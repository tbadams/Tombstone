package com.tadams.pcg.tomb.model;

import java.util.Random;

/**
 * Miscellaneous ways to die.
 * Created by tadams on 12/22/15.
 */
public class Hazard {
    private DangerTemplate[] hazards = {
            new DangerTemplate("acidic corpse"),
            new DangerTemplate("alchemical blast"),
            new DangerTemplate("brainlessness").setNoArticle(),
            new DangerTemplate("suicide").setVerbPhrase("committed").setNoArticle(),
            new DangerTemplate("death ray"),
            new DangerTemplate("carnivorous bag"),
            new DangerTemplate("exhaustion").setNoArticle(),
            new DangerTemplate("psychic blast"),
            new DangerTemplate("overexertion"),
            new DangerTemplate("strangulation"),
            new DangerTemplate("suffocation"),
            new DangerTemplate("system shock"),
            new DangerTemplate("System Shock 2"),
            new DangerTemplate("starvation"),
            new DangerTemplate("petrification"),
            new DangerTemplate("wrath of god"), // TODO gods
            new DangerTemplate("cancer").setNoArticle(),
            new DangerTemplate("VD").setNoArticle(),
            new DangerTemplate("old age").setNoArticle().setVerbPhrase("died of"),
            new DangerTemplate("riding accident"),
            new DangerTemplate("boredom").setNoArticle().setVerbPhrase("died of"),
            new DangerTemplate("embarassment").setNoArticle().setVerbPhrase("died of"),
            new DangerTemplate("fright").setNoArticle().setVerbPhrase("died of"),
            new DangerTemplate("spontaneous combustion"),
            new DangerTemplate("turned to gold").setNoArticle().setVerbPhrase("was"),};

//    public enum HazardType {
//        BLAST, //TODO
//        BOLT, // TODO
//        BOILING,
//        BUMPING,
////        CADAVER,
//        BURNING,
//        CAUGHT_SELF,
//        CHOKING,
//        DRAWBRIDGE_CLOSE,
//        DRAWBRIDGE_COLLAPSE,
//        DRAWBRIDGE_FALLING,
//        CEILING_COLLIDE,
//        POISONED_SPELLBOOK(),
//        CONTAMINATED_WATER(),
//        CONTAMINATED_POTION,
//        IRON_BARS,
//        HEAD_CRUNCHED_BALL,
//        THRONE,
//        DELIBERATE_MEDUSA,
//        DRAGGED_DOWNSTAIRS,
//        DROWNED,
//        ELECTRIC_CHAIR,
//        ELECTRIC_SHOCK,
//        ELEMENTARY,
//        EXHAUSTION("exhaustion", false),
//        EXPLODING, // chest, door, etc.
//        EXPLOSION,
//        FALLING_OBJECT,
//        FALLING_ROCK,
//        FALLING_OFF_A,
//        FALLING_DOWNSTAIRS,
//        FELL_ONTO, // pit, sink, spikes, etc
//        GAS_CLOUD,
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
