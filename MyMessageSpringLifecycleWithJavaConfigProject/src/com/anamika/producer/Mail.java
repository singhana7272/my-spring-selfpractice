package com.anamika.producer;

public class Mail implements Message {
	
	private String senderMail;
	private String receiverMail;

	public Mail(String senderMail, String receiverMail) {
		super();
		this.senderMail = senderMail;
		this.receiverMail = receiverMail;
	}

	@Override
	public void send() {
		System.out.println("Sender's Mail is "+senderMail+ " and Receiver's Mail is "+receiverMail);
	}

}
