package br.com.alura.ecommerce;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class NewOrderMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Tem dois parâmetros: tipo da chave e tipo da mensagem
        var producer = new KafkaProducer<String, String>(properties());

        var value = "132123,675223,91238419";

        // Agora que eu tenho um producer, posso enviar algo:
        // var record = new ProducerRecord<String, String>("ECOMMERCE_NEW_ORDER", value, value);
        // Ele percebe que é String, String, então eu posso remover:
        var record = new ProducerRecord<>("ECOMMERCE_NEW_ORDER", value, value);

        producer.send(record, (data, ex) ->{
            if(ex != null){
                ex.printStackTrace();
                return;
            }
            System.out.println("sucesso enviando nesse tópico:" + data.topic() + ":::partition " + data.partition() + "/ offset " + data.offset() + "/ timestamp" + data.timestamp());
        }).get(); // é um registro porque ficará registrado no kafka pelo tempo que eu quiser, basta eu configurar
    }

    private static Properties properties() {
        var properties = new Properties();
        // Preciso apontar ONDE estão rodando minhas kafkas
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        // Além disso, eu preciso passar os transformadores de Strings para Byte (Serializadores)
        // Key Serializer é o transformador, depois preciso intigar que será de String, tanto p/ chave quanto p/ o valor
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }
}
