package com.tadams.pcg.tomb.model;

/**
 * Stores the input variables used to create a {@link CharDeath} object.
 * Created by tadams on 12/18/15.
 */
public class DeathSeed {
    public final String name;
    public final CharClass charClass;

    public DeathSeed(String name, CharClass charClass) {
        this.name = name;
        this.charClass = charClass;
    }
}
