package com.anamika.producer;

import java.util.List;

public class Dancer implements Performer {

	private List<String> styles;

	public Dancer(List<String> styles) {
		super();
		this.styles = styles;
	}

	@Override
	public void perform() {
		System.out.print("Dancer is dancing in ");
		for(String dance: styles) {
			System.out.print(dance+",");
		}
		System.out.println(" styles");
	}

}
