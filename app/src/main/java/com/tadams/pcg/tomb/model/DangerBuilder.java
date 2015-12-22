package com.tadams.pcg.tomb.model;

/**
 * Created by tadams on 12/22/15.
 */
public class DangerBuilder {
    private Function<Long, Danger> func;

    public DangerBuilder() {

    }


    public Danger build() {
        return null;
    }

    interface Function<T, R> {
        R apply(T t);
    }
}
