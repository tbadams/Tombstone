package com.tadams.pcg.tomb;

public enum CharClass
{
	SOLDIER("Soldier"),
	SPY("Spy"),
	MAGICIAN("Magician"),
	SCOUT("Scout");

	private String name;

	CharClass(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
