package com.tadams.pcg.tomb.model;

import java.util.Random;

public class Enemy extends Danger
{
	public enum EnemyType{
		ORC("orc"),
		GOBLIN("goblin"),
		DEMON("demon"),
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
		NEWT("newt");
		
		private final String name;
        private int monsterLevel;
		
		EnemyType(String name){
			this.name = name;
		}

		@Override
		public String toString()
		{
			return name;
		}
	}

    private String name;

    public Enemy() {

    }

    public Enemy(long seed) {
        name = EnemyType.values()[new Random(seed).nextInt(EnemyType.values().length)].name;
    }

    public String getName() {
        return name;
    }
}
