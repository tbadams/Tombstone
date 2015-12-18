package com.tadams.pcg.tomb.model;
public class Player // TODO default
{

	private final  String name;
	private final CharClass charClass;
	private int level = 1;
    private boolean amulet;
	
	public Player(String name, CharClass charClass){
		this.name = name;
		this.charClass = charClass;
	}

	public CharClass getCharClass()
	{
		return charClass;
	}

	public String getName()
	{
		return name;
	}

}
