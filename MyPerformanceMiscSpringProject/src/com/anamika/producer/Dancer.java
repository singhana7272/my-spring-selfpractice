package com.anamika.producer;

public class Dancer implements Performer {

	private String style;

	public Dancer() {
		System.out.println("1. Dancer's constructor is called");
	}
	
	

	public void setStyle(String style) {
		System.out.println("2. Dancer's setter is called");
		this.style = style;
	}



	@Override
	public void perform() {
		System.out.println("Dancer is dancing in "+style+" Style!");
	}

}
