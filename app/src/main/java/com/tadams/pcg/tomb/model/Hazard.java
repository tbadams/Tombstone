package com.tadams.pcg.tomb.model;

import java.util.Random;

/**
 * Miscellaneous ways to die.
 * Created by tadams on 12/22/15.
 */
public class Hazard {
    private static final String DIED_OF = "died of";

    private String[] magicTypes = new String[] {"fire", "ice", "lightning", "psychic energy", "poison",
            "disintegration"};

    private final NameAlgorithm magicAlgorithm = new NameAlgorithm() {
        @Override
        String getName(Random random, String typeName) {
            return typeName + " of " + magicTypes[random.nextInt(magicTypes.length)];
        }
    };
    private DangerTemplate[] hazards = {
            new DangerTemplate("acidic corpse"),
            new DangerTemplate("alchemical blast"),
            new DangerTemplate("death ray"),
            new DangerTemplate("carnivorous bag"),
            new DangerTemplate("riding accident"),
            new DangerTemplate("blast").setNameAlgorithm(magicAlgorithm),
            new DangerTemplate("bolt").setNameAlgorithm(magicAlgorithm),
            new DangerTemplate("boiling potion"),
            new DangerTemplate("cadaver"),
            new DangerTemplate("iron ball collision"),
            new DangerTemplate("system shock"),
            new DangerTemplate("System Shock 2"),
            new DangerTemplate("petrification"),
            new DangerTemplate("the wrath of ").setNoArticle().setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    return typeName + God.random(random);
                }
            }),
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
            new DangerTemplate("fell").setVerbPhrase("fell into").setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    String[] fallables = new String[]{"pit", "pit of iron spikes", "chasm", "pit of lava",
                            "bottomless pit", "pit of snakes", "pool of acid", "sausage grinder"};
                    return fallables[random.nextInt(fallables.length)];
                }
            }),
            new DangerTemplate("falling rock"),
            new DangerTemplate("falling object"),
            new DangerTemplate("exploding").setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    String[] explodables =  new String[]{"door", "chest", "large box", "wand", "rune", "crystal ball",
                            "ring", "potion"};
                    return explodables[random.nextInt(explodables.length)];
                }
            }),
            new DangerTemplate("explosion"),
            new DangerTemplate("elementary").setNoArticle().setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    return typeName + " " + (random.nextBoolean() ? "physics" : "chemistry");
                }
            }),
            new DangerTemplate("electric shock"),
            new DangerTemplate("electric chair"),
            new DangerTemplate("drowned").setNoArticle().setVerbPhrase(""), // TODO location, monster
            new DangerTemplate("falling downstairs").setNoArticle(),
            new DangerTemplate("Medusa's gaze").setNoArticle().setVerbPhrase("petrified by"),
            new DangerTemplate("cursed throne"),
            new DangerTemplate("iron ball").setVerbPhrase("crunched in the head by"),
            new DangerTemplate("iron ball").setVerbPhrase("dragged downstairs by"), // TODO Consolidate with above?
            new DangerTemplate("crashing into iron bars").setNoArticle(),
            new DangerTemplate("burned to death").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("contaminated water").setNoArticle(),
            new DangerTemplate("contact-posioned spellbook"),
            new DangerTemplate("colliding with the ceiling").setNoArticle(),
            new DangerTemplate("drawbridge").setVerbPhrase("crushed to death by"), // TODO collapsing, falling, exploding
            new DangerTemplate("food").setVerbPhrase("choked on their").setNoArticle(), // TODO food
            new DangerTemplate("bumping into").setNoArticle().setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    return DungeonFeature.values()[random.nextInt(DungeonFeature.values().length)].getWord();
                }
            }),
            new DangerTemplate("petrified").setVerbPhrase("petrified by").setNoArticle()
                    .setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    String[] stoners = new String[]{"a cockatrice", "a cockatrice corpse", "Medusa", "a cockatrice egg",
                    "tasting cockatrice meat", "riding a cockatrice", "touching a cockatrice corpse bare handed"};
                    return stoners[random.nextInt(stoners.length)];
                }
            }),
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
            new DangerTemplate("quicksand").setNoArticle(),
            new DangerTemplate("kicking").setVerbPhrase("killed by kicking").setNameAlgorithm(new NameAlgorithm() {
                    @Override
                    String getName(Random random, String typeName) {
                            // TODO Add objects.
                            return DungeonFeature.values()[random.nextInt(DungeonFeature.values().length)].getWord();
                    }
            }),
            new DangerTemplate("their own").setNoArticle().setNameAlgorithm(magicAlgorithm),
            new DangerTemplate("life drainage").setNoArticle(),
            new DangerTemplate("magic missile"),
            new DangerTemplate("molten lava").setNoArticle().setVerbPhrase("burned by"),
            new DangerTemplate("thrown potion"),
            new DangerTemplate("elevator"),
            new DangerTemplate("touching the edge of the universe"),
            new DangerTemplate("teleported out of the dungeon and fell to their death").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("self-genocide"),
            new DangerTemplate("imperious order"),
            new DangerTemplate("turned to slime").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("went to heaven prematurely").setNoArticle().setVerbPhrase(""),
            new DangerTemplate("burning potion of oil"),
            new DangerTemplate("rotted corpse").setVerbPhrase("poisoned by"), // TODO Particular corpses
            new DangerTemplate("potion of acid"),
            new DangerTemplate("residual undead turning effect"),
            new DangerTemplate("touch of death"),
            new DangerTemplate("saddled pony").setVerbPhrase("slipped while mounting"),
            new DangerTemplate("boulder").setVerbPhrase("squished under"),
            new DangerTemplate("unsuccessful polymorph"),
            new DangerTemplate("zapped").setVerbPhrase("zapped themself with").setNameAlgorithm(new NameAlgorithm() {
                    @Override
                    String getName(Random random, String typeName) {
                            return random.nextBoolean() ? "spell" : "wand";
                    }
            }),
            new DangerTemplate("buring scroll"),
            new DangerTemplate("scroll of fire").setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    return random.nextBoolean() ? "fire" : "earth";
                }
            }),
            new DangerTemplate("dangerous winds").setNoArticle(),
            new DangerTemplate("lethal injection").setNoArticle(),
            new DangerTemplate("hanging by the neck until dead").setNoArticle(),
            new DangerTemplate("bottomless pit"),
            new DangerTemplate("the body of ").setNoArticle().setVerbPhrase("unwisely ate").setNameAlgorithm(new NameAlgorithm() {
                @Override
                String getName(Random random, String typeName) {
                    String[] riders = new String[]{"Death", "Famine", "Pestilence", "War", "Ronnie"};
                    return riders[random.nextInt(riders.length)];
                }
            }),
            new DangerTemplate("kicking an exploding cockatrice corpse").setNoArticle(),
    };

    Danger getHazard(Random random, int dungeonLevel) {
        return hazards[random.nextInt(hazards.length)].build(random);
    }

    DangerTemplate[] getTemplates() {
        return hazards.clone();
    }
}
