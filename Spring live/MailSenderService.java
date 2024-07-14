package com.kafkalast.kafka.project;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

    private JavaMailSender mailSender;
//    JavaMailSender mailSender: This is a Spring interface used to send emails.
//    It provides methods to send simple emails as well as MIME messages.

    public void sendMail(String to, String subject, String body){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(body);

        mailSender.send(simpleMailMessage);

       // This method constructs and sends an email.

    }

}
