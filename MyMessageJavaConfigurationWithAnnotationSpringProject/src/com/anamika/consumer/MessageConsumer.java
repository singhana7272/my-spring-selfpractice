package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.config.MessageConfiguration;
import com.anamika.producer.Message;

public class MessageConsumer {

	public static void main(String[] args) {
	ApplicationContext springContainer=new AnnotationConfigApplicationContext(MessageConfiguration.class);
	
	Message message1=(Message)springContainer.getBean("message1");
	message1.send();
	
	Message message2=(Message)springContainer.getBean("message2");
	message2.send();
	}
}
