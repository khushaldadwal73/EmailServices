package com.example.EmailServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailServicesApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailServicesApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail()
	{
		emailSenderService.sendEmail("khushaldadwal73@gmail.com",
				"this is subect",
				"this is body of email");
	}
}
