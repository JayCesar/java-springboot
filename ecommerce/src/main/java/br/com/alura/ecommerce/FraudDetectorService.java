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
        // O correto é cada serviço escutar um tópico só! É raro escuta mais de um tópico
        consumer.subscribe(Collections.singletonList("ECOMMERCE_NEW_ORDER")); // Eu preciso esctuar de algum local - eu preciso passar uma lista
        while (true) {
            var records = consumer.poll(Duration.ofMillis(100)); // Preciso perguntar por algum tempo se tem mensagem ali dentro
            // poll é assim que eu pergunto
            if (!records.isEmpty()) {
                System.out.println("Encontrei " + records.count() + " registros");
                for (var record : records) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Processing new order, checking for fraud!");
                    System.out.println(record.key());
                    System.out.println(record.value());
                    System.out.println(record.partition());
                    System.out.println(record.offset());
                    try {
                        Thread.sleep(5000); // Finjindo uma fraude
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        //                throw new RuntimeException(e);
                    }
                    System.out.println("Order processed");
                }
            }
        }
    }

    private static Properties properties() {
        var properties = new Properties();

        // Eu preciso "escutar" o quê ele está falando!
        properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, FraudDetectorService.class.getSimpleName());
        return properties;
    }


}
