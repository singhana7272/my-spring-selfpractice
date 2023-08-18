package com.anamika.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("michaeljackson")
public class Dancer implements Performer {
	
	@Value("moonwalk")
	private String style;

	public Dancer() {
		super();
	}

	public Dancer(String style) {
		super();
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" Style!");
	}

}
