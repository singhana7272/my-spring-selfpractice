package com.anamika.producer;

import java.util.Map;
import java.util.Set;

public class ModifiedInstrumentalist implements Performer {

	private Map<String,Instrument> songInstrument;

	public void setSongInstrument(Map<String, Instrument> songInstrument) {
		this.songInstrument = songInstrument;
	}

	@Override
	public void perform() {
		Set<String> songs=songInstrument.keySet();
		for(String song: songs) {
			System.out.println("On song "+song+" instrumentalist is playing ");
			songInstrument.get(song).play();
		}
	}

}
