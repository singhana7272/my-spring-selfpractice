package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("message2")
public class SMS implements Message {
	
	@Value("1234567891")
	private long senderNo;
	
	@Value("1987654321")
	private long receiverNo;

	public SMS() {
		super();
	}

	public void setSenderNo(long senderNo) {
		this.senderNo = senderNo;
	}
	
	public void setReceiverNo(long receiverNo) {
		this.receiverNo = receiverNo;
	}

	@Override
	public void send() {
		System.out.println("SMS's sender mail is "+senderNo +" and receiver mail is "+receiverNo);
	}

}
