package com.tadams.pcg.tomb.model;
import com.tadams.pcg.tomb.MainActivity;

import java.util.*;

public class Character
{
	private static final int SCORE_MULTIPLIER = 1234;
	private static final int FLOOR_MULTIPLIER = 10;
	private static final int FLOOR_VARIANCE = 3;

	private final  String name;
	private final CharClass charClass;
	private int level = 1;
    private boolean amulet;
	
	public Character (String name, CharClass charClass){
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
	
	public CharDeath getDeath() {
        long seedLong = (name + charClass.ordinal()).hashCode();
		Random seed = new Random(seedLong);
		double gaussian = Math.abs(seed.nextGaussian());
		int score = (int)(gaussian * SCORE_MULTIPLIER);
		int floorMedian = (int)(gaussian * FLOOR_MULTIPLIER);
		int floorNum = (int)Math.max(1, seed.nextGaussian() * FLOOR_VARIANCE + floorMedian);
		String floor = "Dungeon Level " + floorNum;
		Danger killer = MainActivity.getDanger(seedLong);
		return new CharDeath(this, killer, floor, score);
	}
}
