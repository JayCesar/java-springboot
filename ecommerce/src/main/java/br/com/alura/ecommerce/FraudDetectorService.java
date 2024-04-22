package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

public class FraudDetectorService {

    public static void main(String[] args) {
        var consumer = new KafkaConsumer<String, String>(properties());
        // O correto é cada serviço escutar um tópico só! É raro escturar mais de um tópico
        consumer.subscribe(Collections.singleton("ECOMMERCE_NEW_ORDER"));
        var records = consumer.poll(Duration.ofMillis(100)); // Preciso perguntar por algum tempo se tem mensagem ali dentro
        if (records.isEmpty()) System.out.println("Não encontrei registros");
        for (var record : records){
            System.out.println("---------------------------------------------------");
            System.out.println("Processando new order, checking for fraud!");
            System.out.println(record.key());
            System.out.println(record.partition());
            System.out.println(record.offset());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Properties properties() {
        var properties = new Properties();

        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());

        return properties;
    }
}
