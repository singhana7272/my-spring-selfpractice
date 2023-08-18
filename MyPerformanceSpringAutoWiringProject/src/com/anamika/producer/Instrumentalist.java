package com.anamika.producer;

public class Instrumentalist implements Performer {

	private Instrument instrument;
	
	public Instrumentalist() {
	}

	public Instrumentalist(Instrument instrument) {
		this.instrument = instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.println("Instrument is playing");
		instrument.play();
	}

}
