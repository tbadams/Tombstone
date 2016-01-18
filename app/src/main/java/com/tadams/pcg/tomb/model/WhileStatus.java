package com.tadams.pcg.tomb.model;

import java.util.Random;

/**
 * Enumeration of possible states the player can have been in when death occurred.
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
    MOUNTING("mounting"),
    JUMPING("jumping around"),
    FRIGHTENED("being frightened to death"),
    UNCONSCIOUS_ROTTEN("unconscious"),
    DRESSING_UP("getting dressed"),
    FUMBLING("fumbling"),
    DRAGGING_BALL("dragging an iron ball"),
    TRYING_TURN("trying to turn a monster"),
    BEING_TERRIFIED("being terrified"),
    GAZING("gazing into a crystal ball"),
    MOVING_THROUGH_AIR("moving through the air"),
    DIGESTING("digesting"),
    GETTING_STONED("getting stoned"),
    HIDING_FROM_THUNDERSTORM("hiding"),
    GIBBERING("gibbering crazily"),
    BLIND("blind"), // TODO footrinsic?
    SLEEPWALKING("sleepwalking"),
    SHRUNK("shrunk to a tiny size"), // TODO footrinsic?
    MIND_CONTROLLED("mind-controlled"), // TODO footrinsic?
    POSSESSED("possessed"), // TODO footrinsic?
    INEBRIATED("passed out drunk"),
    COITUS("mid-coitus"),
    DANCING("dancing"),
    SINGING("singing"),
    SPIDER_WEB("stuck in a spider web"),
    POLYMORPHED("stuck in creature form"); // TODO creatures

    private final String phrase;

    WhileStatus(String phrase) {
        this.phrase = phrase;
    }

    String phrase() {
        return phrase;
    }

    static WhileStatus newStatus(Random random) {
        return values()[random.nextInt(values().length)];
    }
}
