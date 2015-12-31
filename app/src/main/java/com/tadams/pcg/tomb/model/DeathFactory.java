package com.tadams.pcg.tomb.model;

import java.util.Random;

/**
 * Factory class for instantiating {@link CharDeath} objects.
 * Created by tadams on 12/17/15.
 */
public class DeathFactory {

    private static final int SCORE_MULTIPLIER = 1234;
    private static final int FLOOR_MULTIPLIER = 10;
    private static final int FLOOR_VARIANCE = 3;
    private static final double HAZARD_CHANCE = 0.4;
    private static final double WHILE_STATUS_CHANCE = 0.5;

    private Hazard hazardFactory = new Hazard();

    public CharDeath getDeath(String name, CharClass charClass) {
        long seedLong = (name + charClass.ordinal()).hashCode();
        Player character = new Player(name, charClass);
        Random seed = new Random(seedLong);
        double gaussian = Math.abs(seed.nextGaussian());
        int score = (int)(gaussian * SCORE_MULTIPLIER);
        int floorMedian = (int)(gaussian * FLOOR_MULTIPLIER);
        int floorNum = (int)Math.max(1, seed.nextGaussian() * FLOOR_VARIANCE + floorMedian);
        String floor = "Dungeon Level " + floorNum;
        Danger killer = getDanger(seed, floorNum     );
        WhileStatus whileStatus = null;
        if(seed.nextDouble() < WHILE_STATUS_CHANCE) {
            whileStatus = WhileStatus.newStatus(seed);
        }
        return new CharDeath(character, killer, floor, score, whileStatus);
    }

    private Danger getDanger(Random r, int dLevel) {
        if(r.nextDouble() < HAZARD_CHANCE) {
            return hazardFactory.getHazard(r, dLevel);
        }
        return new Enemy(r, dLevel);
    }
}
