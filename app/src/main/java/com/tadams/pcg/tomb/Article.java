package com.tadams.pcg.tomb;

/**
 * Created by tadams on 12/14/15.
 */
public enum Article {
    A("a"),
    AN("an"),
    THE("the"),
    THEIR("their");

    private String word;

    Article(String word) {
        this.word = word;
    }

    String getWord() {
        return word;
    }
}
