package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("edsheeran")
public class Singer implements Performer {
	
	private String song;
	
	
	public Singer(@Value("Anti-social") String song) {
		super();
		this.song = song;
	}


	@Override
	public void perform() {
		System.out.println("Singer is singing "+song+" Song!");
	}

}
