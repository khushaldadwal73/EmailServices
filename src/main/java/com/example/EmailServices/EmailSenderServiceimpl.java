package com.example.EmailServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("emailSenderService")
public class EmailSenderServiceimpl implements EmailSenderService {


    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String toEmail,
                          String subject,
                          String body)
    {
        SimpleMailMessage message=new SimpleMailMessage();
        message.setFrom("khushaldadwal73@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        javaMailSender.send(message);


        System.out.println("mail sent successfully..");
    }
}
