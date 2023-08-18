package com.anamika.producer;

public class SMS implements Message {
	
	private long senderNo;
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
