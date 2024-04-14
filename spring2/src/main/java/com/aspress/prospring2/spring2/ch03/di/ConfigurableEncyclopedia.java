package com.aspress.prospring2.spring2.ch03.di;

import java.util.Map;

import org.springframework.util.Assert;

public class ConfigurableEncyclopedia implements Encyclopedia {
	
	private Map<String,Long> entries;
	
	public ConfigurableEncyclopedia(Map<String,Long> entries) {
		Assert.notNull(entries, "Then 'entries' argument cannot be null.");
		this.entries = entries;
	}

	@Override
	public Long findLong(String entry) {
		return this.entries.get(entry);
	}

}
