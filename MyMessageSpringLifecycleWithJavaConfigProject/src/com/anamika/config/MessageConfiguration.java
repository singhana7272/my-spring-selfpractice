package com.anamika.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.anamika.producer.InitProcessForAllBeans;
import com.anamika.producer.SMS;

@Configuration
public class MessageConfiguration {

	
	@Bean(initMethod = "customInitForBean1",destroyMethod = "customDestroyForBean1")
	@Scope("prototype")
	public SMS SMS1() {
		SMS sms=new SMS();
		sms.setSenderNo(1234567891);
		sms.setReceiverNo(1987654321);
		return sms;
	}
	
	@Bean(initMethod = "customInitForBean2",destroyMethod = "customDestroyForBean2")
	@Lazy
	public SMS SMS2() {
		SMS sms=new SMS();
		sms.setSenderNo(1234567891);
		sms.setReceiverNo(1987654321);
		return sms;
	}
	
	@Bean
	public InitProcessForAllBeans commonInit() {
		return new InitProcessForAllBeans();
	}
	
	
}
