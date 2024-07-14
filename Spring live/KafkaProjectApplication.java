package com.kafkalast.kafka.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KafkaProjectApplication {

	@Autowired
	kafkasender kafkasender;

	public static void main(String[] args) {
		SpringApplication.run(KafkaProjectApplication.class, args);
	}

	@GetMapping("/producer")
	public String sender(@RequestParam("message") String message){
		kafkasender.send(message);

		return "Message has been sent to kafka topic hello-world";
	}

//	First: Client/Trigger calls the kafkasender.send(message) method.
//	Second: kafkasender.send(message) sends the message to the Kafka topic "hello-world".
//	Third: topicLisner.consumer(payload) method is executed when the message is received from the Kafka topic.
//	Fourth: MailSenderService.sendMail(...) method is called to send an email.

}
