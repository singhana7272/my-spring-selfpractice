package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("message1")
public class Mail implements Message {
	
	private String senderMail;
	private String receiverMail;

	public Mail(@Value("sender123@gmail.com") String senderMail,@Value("receiver123@gmail.com") String receiverMail) {
		super();
		this.senderMail = senderMail;
		this.receiverMail = receiverMail;
	}

	@Override
	public void send() {
		System.out.println("Sender's Mail is "+senderMail+ " and Receiver's Mail is "+receiverMail);
	}

}
