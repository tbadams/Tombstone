package com.tadams.pcg.tomb.model;

/**
 * List of possible weapons.
 *
 * Created by tadams on 1/1/16.
 */
enum Weapon {
    BASTARD_SWORD("bastard sword"),
    RAPIER("rapier"),
    MUSKET("musket"),
    SABER("saber"),
    WHIP("whip"),
    SHORTSWORD("shortsword"),
    DAGGER("dagger"),
    CLUB("club"),
    MACE("mace"),
    MORNINGSTAR("morningstar"),
    REVOLVER("revolver"),
    PICKAXE("pickaxe"),
    SHOVEL("shovel"),
    LANCE("lance"),
    PIKE("pike"),
    HALBERD("halberd"),
    BLACKJACK("blackjack"),
    SPEAR("spear"),
    BROADSWORD("broadsword"),
    LONGBOW("longbow"),
    SHORTBOW("short bow"),
    CROSSBOW("crossbow"),
    CANE_SWORD("cane sword");

    private final String word;

    Weapon(String word) {
        this.word = word;
    }

    String getWord() {
        return word;
    }
}
