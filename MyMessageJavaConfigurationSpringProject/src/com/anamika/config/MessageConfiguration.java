package com.anamika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anamika.producer.Mail;
import com.anamika.producer.SMS;

@Configuration
public class MessageConfiguration {
	
	@Bean("message1")
	public Mail getMail() {
		return new Mail("sender123@gmail.com","receiver123@gmail.com");
	}
	
	@Bean("message2")
	public SMS getSMS() {
		SMS sms=new SMS();
		sms.setSenderNo(1234567891);
		sms.setReceiverNo(1987654321);
		return sms;
	}
}
