package com.tadams.pcg.tomb.model;

/**
 * Created by tadams on 12/22/15.
 */
public class  DangerTemplate {
    String typeName;
//    Function<Integer, Integer> blat = t -> t +1;
    public DangerTemplate(String typeName) {
        this.typeName = typeName;
    }

    public Danger build() {
        return new Danger() {
            @Override
            String getName() {
                return typeName;
            }
        };
    }

}
