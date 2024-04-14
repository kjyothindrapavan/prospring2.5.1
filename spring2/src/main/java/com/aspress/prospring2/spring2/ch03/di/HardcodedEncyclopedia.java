package com.aspress.prospring2.spring2.ch03.di;

import java.util.HashMap;
import java.util.Map;

public class HardcodedEncyclopedia implements Encyclopedia{
	private Map<String,Long> entryValues = new HashMap<>();
	
	public HardcodedEncyclopedia() {
        this.entryValues.put("AgeOfUniverse", 13700000000L);
        this.entryValues.put("ConstantOfLife", 326190476L);
	}

	@Override
	public Long findLong(String entry) {
		return this.entryValues.get(entry);
	}
	
	

}
