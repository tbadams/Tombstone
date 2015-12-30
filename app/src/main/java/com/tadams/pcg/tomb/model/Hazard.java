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
            new DangerTemplate("blast"), //TODO magic
            new DangerTemplate("bolt"), // TODO magic
            new DangerTemplate("psychic blast"),
            new DangerTemplate("boiling potion"),
            new DangerTemplate("cadaver"),
            new DangerTemplate("iron ball collision"),
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
            new DangerTemplate("boiling water").setNoArticle(),
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
            new DangerTemplate("petrified").setVerbPhrase("petrified by"), // TODO by what, cock(wait no), cock corpse, egg, tasting, kicking, tinning, swallowing, riding, helping, touching
            new DangerTemplate("bear trap"),
            new DangerTemplate("exsanguination").setNoArticle(),
            new DangerTemplate("blood loss").setNoArticle(),
            new DangerTemplate("rusting away").setNoArticle(),
            new DangerTemplate("runaway cart"),
            new DangerTemplate("bus").setVerbPhrase("hit by a"),
            new DangerTemplate("trickery").setVerbPhrase(""),
            new DangerTemplate("decapitation"),
            new DangerTemplate("having their heart ripped from their body").setNoArticle(),
            new DangerTemplate("abducted by aliens").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("banana peel").setVerbPhrase("slipped on"),
            new DangerTemplate("clerical error").setNoArticle(),
            new DangerTemplate("acute radiation poisoning").setNoArticle(),
            new DangerTemplate("zombification").setNoArticle(),
            new DangerTemplate("infected wound"),
            new DangerTemplate("explosive decompression").setNoArticle(),
            new DangerTemplate("the bends").setNoArticle(),
            new DangerTemplate("lost in space").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("gunshot wound"),
            new DangerTemplate("went insane").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("drug overdose"),
            new DangerTemplate("alcohol poisoning").setNoArticle(),
            new DangerTemplate("giant magnifying glass").setVerbPhrase("burned by"),
            new DangerTemplate("lack of common sense"),
            new DangerTemplate("arrested").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("murphy bed"),
            new DangerTemplate("sexual exhaustion"),
            new DangerTemplate("temporal anomaly"),
            new DangerTemplate("polymorphing into an inanimate object").setNoArticle(),
            new DangerTemplate("sunlight").setNoArticle(),
            new DangerTemplate("laughing themselves to death").setNoArticle(),
            new DangerTemplate("hypothermia").setNoArticle(),
            new DangerTemplate("heat stroke").setNoArticle(),
            new DangerTemplate("dehydration").setNoArticle(),
            new DangerTemplate("sliced in twain").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("sausage grinder"),
            new DangerTemplate("segmentation fault"),
            new DangerTemplate("reverting to an infant").setNoArticle(),
            new DangerTemplate("turned into a space fetus").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("demonic possession"),
            new DangerTemplate("out of body experience becoming permanent"),
            new DangerTemplate("black hole"),
            new DangerTemplate("quit").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("escaped").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("touching an artifact").setNoArticle(), //TODO artifacts
            new DangerTemplate("teleporting into a wall").setNoArticle(),
            
    };

//    public enum HazardType {
//        GAS_SPORE_EXPLOSION,
//        IRON_BALL,
//        STUCK_IN_CREATURE,
//        KICKING,
//        OWN_WEAPON,
//        BEAR_TRAP,
//        LIFE_DRAIN,
//        MAGIC_MISSILE,
//        MOLTEN_LAVA,
//        PETRIFICATION,
//        POISON,
//        POTION, // acid, holy, unholy,
//        RESIDUAL_UNDEAD_TURNING,
//        REVERTING_UNHEALTHY_NORMAL,
//        ROTTED_CORPSE,
//        GENOCIDE_SCROLL,
//        EARTH_SCROLL,
//        FIRE_SCROLL,
//        SELF_GENOCIDE,
//        SITTING_SPIKE,
//        SLIPPED_MOUNTING,
//        SQUISHED_BOULDER,
//        TELEPORT_FALL,
//        TELEPORT_WALL,
//        THROWN_POTION,
//        TOUCH_EDGE_UNIVERSE,
//        DEATH_TOUCH,
//        SLIMED,
//        FAILED_POLYMORPH,
//        WIND_SWEPT,
//        HEAVEN_EARLY,
//        MAGICAL_HORN,
//        ATE_DEATH,
//        ZAPPED_SELF,
//        ARRESTED,
//        HANGED,
//        LETHAL_INJECTION,
//        ELEVATOR,
//        BOTTOMLESS_PIT,
    // kicking exploding cockatrice corpse??
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

    DangerTemplate[] getTemplates() {
        return hazards.clone();
    }
}
