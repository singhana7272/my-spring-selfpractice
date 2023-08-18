package com.anamika.producer;

import java.util.Map;
import java.util.Set;

public class ModifiedDancer implements Performer {

	private Map<String,String> songStyles;

	
	public void setSongStyles(Map<String, String> songStyles) {
		this.songStyles = songStyles;
	}

	@Override
	public void perform() {
		Set<String> songs=songStyles.keySet();
		for(String song: songs) {
			System.out.println("Dancer is dancing in "+songStyles.get(song)+" on "+song);
		}
	}

}
