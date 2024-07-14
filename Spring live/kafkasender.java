package com.kafkalast.kafka.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class kafkasender {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    String topic = "hello-world";

//    KafkaTemplate<String, String> kafkaTemplate: This is a Spring Kafka template for sending messages.
//    It uses generics to specify the key and value types (both are String in this case).

//    String topic = "hello-world": This specifies the Kafka topic to which the messages will be sent.
//    The topic name is "hello-world".

    public void send(String message){
        kafkaTemplate.send(topic,message);
    }

//    public void send(String message): This method sends a message to the specified Kafka topic.
//    It takes a String message as an argument and uses the kafkaTemplate to send it.


}
