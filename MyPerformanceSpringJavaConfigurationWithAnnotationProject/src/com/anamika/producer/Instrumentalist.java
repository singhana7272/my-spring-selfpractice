package com.anamika.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("guitarist")
public class Instrumentalist implements Performer {
	
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.println("Instrument is playing");
		instrument.play();
	}

}
