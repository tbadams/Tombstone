package com.tadams.pcg.tomb.model;

import java.util.Random;

public class Enemy extends Danger
{
	public enum EnemyType{
		ORC("orc"),
		GOBLIN("goblin"),
		DEMON("demon"),
        SOLDIER_ANT("soldier ant"),
		KOBOLD("kobold"),
		CROCODILE("crocodile"),
		DRAGON("dragon"),
		BEAVER("beaver"),
		HOBGOBLIN("hobgoblin"),
		SQUIRREL("squirrel"),
		IMP("imp"),
		SHOGGOTH("shoggoth"),
		XENOMORPH("xenomorph"),
		BANDIT("bandit"),
		PIRATE("pirate"),
		OOZE("ooze"),
		DEEP_ONE("Deep One"),
		GIANT_SQUID("giant squid"),
		RAT("rat"),
		SNAKE("snake"),
		FERRET("ferret"),
		WOLD("wolf"),
		WARG("warg"),
		TROLL("troll"),
		OGRE("ogre"),
		MIND_FLAYER("mind flayer"),
		FLOATING_EYE("floating eye"),
		GARGOYLE("gargoyle"),
		ZOMBIE("zombie"),
		SKELETON("skeleton"),
		GHOUL("ghoul"),
		VAMPIRE("vampire"),
		WEREWOLF("werewolf"),
		FOX("fox"),
		BEAR("bear"),
		VELOCIRAPTOR("velociraptor"),
		GHOST("ghost"),
		UNICORN("unicorn"),
		BOAR("boar"),
		COCKATRICE("cockatrice"),
		TIGER("tiger"),
		GREMLIN("gremlin"),
		NYMPH("nymph"),
		MIMIC("mimic"),
		WUMPUS("wumpus"),
		BAT("bat"),
		SPIDER("spider"),
		CENTAUR("centaur"),
		GIANT("giant"),
		ELEMENTAL("elemental"),
		TITAN("titan"),
		MINOTAUR("minotaur"),
		LICH("lich"),
		MUMMY("mummy"),
		NAGA("naga"),
		NECROMANCER("necromancer"),
		WRAITH("wraith"),
		APE("ape"),
		GOLEM("golem"),
		NEWT("newt"),
        CYCLOPS("cyclops"),
        CHIMERA("chimera"),
        HYDRA("hydra"),
        HARPY("harpy"),
        SATYR("satyr"),
        GRIFFIN("griffin"),
        AMAZON("amazon"),
        SPHINX("sphinx"),
        KRAKEN("kraken"),
        BASILISK("basilisk"),
        CHUPACABRA("chupacabra"),
        MANTICORE("manticore"),
        COLLOSSUS("collossus"),
        HIPPOGRIFF("hippogriff"),
        KELPIE("kelpie"),
        PIXIE("pixie"),
        WENDIGO("wendigo"),
        LEPRECHAUN("leprechaun"),
        GAS_SPORE("gas spore"), // TODO "'s explosion'?
		QUIVERING_BLOB("quivering blob"),
		COBRA("cobra"),
		PIT_VIPER("pit viper"), // TODO Poisened verb?

		SHOPKEEPER("shopkeeper") {
			String getName(Random r) {
				return this.name + " called " + fantasyNames[r.nextInt(fantasyNames.length)];
			}
		};
		
		final String name;
        private int monsterLevel;
		
		EnemyType(String name){
			this.name = name;
		}

		String getName(Random random) {
			return name;
		}

		@Override
		public String toString()
		{
			return name;
		}
	}

	private static String[] fantasyNames = {"Eaumuwu",
			"Afra",
			"Mitom",
			"Flusc",
			"Wib",
			"Eose",
			"Draifev",
			"Gap",
			"Hunkej",
			"Otug",
			"Oretroi",
			"Iutam",
			"Oskek",
			"Wapraim",
			"Seaukrai",
			"Agrefe",
			"Kroleg",
			"Ina",
			"Flebra",
			"Wupez"};

    private String name;

    public Enemy(Random random, int dungeonLevel) {
        name = EnemyType.values()[random.nextInt(EnemyType.values().length)].getName(random);
    }

    public String getName() {
        return name;
    }
}
