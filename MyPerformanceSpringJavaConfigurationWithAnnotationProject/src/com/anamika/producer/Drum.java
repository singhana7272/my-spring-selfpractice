package com.anamika.producer;

import org.springframework.stereotype.Component;

@Component
public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("Dhum Dhum Dhum");
	}

}
