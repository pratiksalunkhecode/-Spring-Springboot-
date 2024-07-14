package com.kafkalast.kafka.project;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class topicLisner {

    @Autowired
    MailSenderService mailSenderService;

    @KafkaListener(topics = "hello-world", groupId = "group_id")
    public void consumer(ConsumerRecord<String, String> payload){

        System.out.println("payload"+payload);

        System.out.println("topic"+payload.topic());
        System.out.println("key"+payload.key());
        System.out.println("value"+payload.value());

        mailSenderService.sendMail("pratiksalunkhe5556@gmail.com","kafak mail","im sending mail from topic ");

    }

}
