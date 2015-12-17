package com.tadams.pcg.tomb;

/**
 * Created by tadams on 12/14/15.
 */
enum WhileStatus {
    HELPLESS("helpless"),
    FAINTED("fainted from hunger"),
    FROZEN("frozen"),
    SLEEPING("sleeping"),
    DISROBING("disrobing"),
    PRAYING("praying"),
    READING("reading a book"),
    PARALYZED("paralyzed"),
    VOMITING("vomiting"),
    SLEEPING_DRAUGHT("sleeping off a magical draught"),
    BOOZE("sleeping off a \"magical draught\""),
    MOUNTING("mounting"),
    JUMPING("jumping around"),
    FRIGHTENED("being frightened to death"),
    UNCONSCIOUS_ROTTEN("unconscious"),
    DRESSING_UP("dressing up"),
    FUMBLING("fumbling"),
    DRAGGING_BALL("dragging an iron ball"),
    TRYING_TURN("trying to turn a monster"),
    BEING_TERRIFIED("being terrified by a demon"),
    GAZING("gazing into a crystal ball"),
    MOVING_THROUGH_AIR("moving through the air"),
    DIGESTING("digesting"),
    GETTING_STONED("getting stoned"),
    HIDING_FROM_THUNDERSTORM("hiding from a thunderstorm");

    private final String phrase;

    WhileStatus(String phrase) {
        this.phrase = phrase;
    }

    String phrase() {
        return phrase;
    }
}