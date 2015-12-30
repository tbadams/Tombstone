package com.tadams.pcg.tomb.model;

import java.util.Random;

/**
 * Miscellaneous ways to die.
 * Created by tadams on 12/22/15.
 */
public class Hazard {
    private static final String DIED_OF = "died of";
    private DangerTemplate[] hazards = {
            new DangerTemplate("acidic corpse"),
            new DangerTemplate("alchemical blast"),
            new DangerTemplate("death ray"),
            new DangerTemplate("carnivorous bag"),
            new DangerTemplate("riding accident"),
            new DangerTemplate("psychic blast"),
            new DangerTemplate("system shock"),
            new DangerTemplate("System Shock 2"),
            new DangerTemplate("petrification"),
            new DangerTemplate("the wrath of god").setNoArticle(), // TODO gods
            new DangerTemplate("overexertion").setNoArticle(),
            new DangerTemplate("strangulation").setNoArticle(),
            new DangerTemplate("suffocation").setNoArticle(),
            new DangerTemplate("starvation").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("cancer").setNoArticle(),
            new DangerTemplate("VD").setNoArticle(),
            new DangerTemplate("dysentery").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("brainlessness").setNoArticle(),
            new DangerTemplate("spontaneous combustion").setNoArticle(),
            new DangerTemplate("old age").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("exhaustion").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("boredom").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("embarassment").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("fright").setNoArticle().setVerbPhrase(DIED_OF),
            new DangerTemplate("suicide").setVerbPhrase("committed").setNoArticle(),
            new DangerTemplate("turned to gold").setNoArticle().setVerbPhrase("was"),
            new DangerTemplate("blast"), //TODO magic
            new DangerTemplate("bolt"), // TODO magic
            new DangerTemplate("boiling water").setNoArticle(),
            new DangerTemplate("boiling potion"),
            new DangerTemplate("cadaver"),
            new DangerTemplate("iron ball collision"),
            new DangerTemplate("their own magical blast").setVerbPhrase("caught in").setNoArticle(),
            new DangerTemplate("genocidal confusion").setNoArticle(),
            new DangerTemplate("gas cloud"),
            new DangerTemplate("fell"), // TODO onto sink or into chasm, spike pit, pit, etc.
            new DangerTemplate("falling rock"),
            new DangerTemplate("falling object"),
            new DangerTemplate("exploding"), // TODO object: door, chest
            new DangerTemplate("explosion"),
            new DangerTemplate("elementary").setNoArticle(), // TODO physics or chemistry
            new DangerTemplate("electric shock"),
            new DangerTemplate("electric chair"),
            new DangerTemplate("drowned").setNoArticle().setVerbPhrase(""), // TODO location, monster
            new DangerTemplate("falling downstairs").setNoArticle(),
            new DangerTemplate("Medusa's gaze").setNoArticle().setVerbPhrase("petrified by"),
            new DangerTemplate("cursed throne"),
            new DangerTemplate("iron ball").setVerbPhrase("crunched in the head by"),
            new DangerTemplate("crashing into iron bars").setNoArticle(),
            new DangerTemplate("burned to death").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("contaminated water").setNoArticle(),
            new DangerTemplate("contact-posioned speelbook"),
            new DangerTemplate("colliding with the ceiling").setNoArticle(),
            new DangerTemplate("drawbridge").setVerbPhrase("crushed to death by"), // TODO collapsing, falling, exploding
            new DangerTemplate("food").setVerbPhrase("choked on their").setNoArticle(), // TODO food
            new DangerTemplate("bumping into").setNoArticle(), //TODO bumps
    };

//    public enum HazardType {
//        GAS_SPORE_EXPLOSION,
//        GENOCIDAL_CONFUSION,
//        IRON_BALL,
//        STUCK_IN_CREATURE,
//        KICKING,
//        OWN_WEAPON,
//        BEAR_TRAP,
//        LIFE_DRAIN,
//        MAGIC_MISSILE,
//        MOLTEN_LAVA,
//        OVEREXERTION,
//        PETRIFICATION,
//        POISON,
//        POTION, // acid, holy, unholy,
//        PSYCHIC_BLAST,
//        RESIDUAL_UNDEAD_TURNING,
//        REVERTING_UNHEALTHY_NORMAL,
//        RIDING_COCKATRICE,
//        RIDING_ACCIDENT,
//        ROTTED_CORPSE,
//        RUSTING_AWAY,
//        GENOCIDE_SCROLL,
//        EARTH_SCROLL,
//        FIRE_SCROLL,
//        SELF_GENOCIDE,
//        SITTING_SPIKE,
//        SLIPPED_MOUNTING,
//        STARVATION,
//        SQUISHED_BOULDER,
//        STRANGULATION,
//        SUFFPOCATION,
//        EATING_COCKATRICE,
//        SYSTEM_SHOCK,
//        SYSTEM_SHOCK_2,
//        TELEPORT_FALL,
//        TELEPORT_WALL,
//        WRATH_OF_GOD,
//        THROWN_POTION,
//        TOUCH_ARTIFACT,
//        TOUCH_EDGE_UNIVERSE,
//        DEATH_TOUCH,
//        HELP_UP_COCKATRICE,
//        TIN_COCKATRICE,
//        SLIMED,
//        FAILED_POLYMORPH,
//        WIND_SWEPT,
//        HEAVEN_EARLY,
//        MAGICAL_HORN,
//        ATE_DEATH,
//        ZAPPED_SELF,
//        CANCER,
//        VD,
//        OLD_AGE,
//        EXSANGUINATION,
//        BLOOD_LOSS,
//        DECAPITATION,
//        BOREDOM,
//        FRIGHT,
//        EMBARASSMENT,
//        SPONTANEOUS_COMBUSTION,
//        BUS,
//        RUNAWAY_CART,
//        BANANA_PEEL,
//        RADIATION,
//        CLERICAL,
//        ARRESTED,
//        TURNED_TO_GOLD,
//        HANGED,
//        LETHAL_INJECTION,
//        ELEVATOR,
//        ALIEN_ABDUCTION,
//        INFECTION,
//        ZOMBIFIED,
//        INSANITY,
//        DECOMPRESSION,
//        BENDS,
//        LOST_IN_SPACE,
//        GUNSHOT_WOUND,
//        BOTTOMLESS_PIT,
//        DRUG_OVERDOSE,
//        ALCOHOL_POISONING,
//        MAGNAFYING_GLASS;
//
//        final String name;
//        private int monsterLevel;
//
//        Hazard(String name){
//            this.name = name;
//        }
//
//        String getName(Random random) {
//            return name;
//        }
//
//        @Override
//        public String toString()
//        {
//            return name;
//        }
//    }

    private String name;

    Danger getHazard(Random random, int dungeonLevel) {
        return hazards[random.nextInt(hazards.length)].build(random);
    }

    public String getName() {
        return name;
    }
}
