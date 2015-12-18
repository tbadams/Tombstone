package com.tadams.pcg.tomb.model;

public enum CharClass
{
	SOLDIER("Soldier"),
	SPY("Spy"),
	MAGICIAN("Magician"),
	SCOUT("Scout");

	private final String name;

	CharClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
