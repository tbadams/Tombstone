package com.tadams.pcg.tomb.model;

import java.util.Random;

public class Trap extends Danger
{
	public enum TrapType {
		ROCK_TRAP("rock trap"),
		FLAME_TRAP("flame trap"),
		TELEPORT_TRAP("teleport trap"),
		LAND_MINE("land mine"),
		SPIKE_PIT("spike pit"),
		DART_TRAP("dart trap");

        private final String name;

        TrapType(String name) {
            this.name = name;
        }
	}

    private final TrapType type;

    public Trap(long seed) {
        Random r = new Random(seed);
        type = TrapType.values()[r.nextInt(TrapType.values().length)];
    }

    public String getName() {
        return type.name;
    }
}
