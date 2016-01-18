package com.tadams.pcg.tomb.model;

/**
 * List of possible Dungeon Features.
 *
 * Created by tadams on 1/1/16.
 */
enum DungeonFeature {
    WALL("wall"),
    DOOR("door"),
    TREE("tree"),
    BOULDER("boulder"),
    FOUNTAIN("fountain"),
    TOMBSTONE("tombstone"),
    ALTAR("altar"),
    SINK("sink"),
    STAIRS("stairway");

    private final String word;

    DungeonFeature(String word) {
        this.word = word;
    }

    String getWord() {
        return word;
    }
}
