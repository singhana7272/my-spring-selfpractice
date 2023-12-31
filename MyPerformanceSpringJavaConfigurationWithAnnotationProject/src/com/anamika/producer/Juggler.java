package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Joker")
public class Juggler implements Performer {
	@Value("5")
	private int balls;
	
	
	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" Balls!");
	}

}
