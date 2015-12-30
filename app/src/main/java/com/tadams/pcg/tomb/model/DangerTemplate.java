package com.tadams.pcg.tomb.model;

import java.util.Random;

/**
 * Created by tadams on 12/22/15.
 */
class  DangerTemplate {
    private String typeName;
    private String verbPhrase = "killed by";
    private boolean usesArticle = true;
    private NameAlgorithm nameAlgorithm = new NameAlgorithm();

    DangerTemplate(String typeName) {
        this.typeName = typeName;
    }

    DangerTemplate setNameAlgorithm(NameAlgorithm nameAlgorithm) {
        if(nameAlgorithm == null) {
            throw new NullPointerException("NameAlgorithm cannot be null.");
        }
        this.nameAlgorithm = nameAlgorithm;
        return this;
    }

    DangerTemplate setNoArticle() {
        this.usesArticle = false;
        return this;
    }

    DangerTemplate setVerbPhrase(String verbPhrase) {
        if(verbPhrase == null) {
            throw new NullPointerException("verbPhrase cannot be null.");
        }
        this.verbPhrase = verbPhrase;
        return this;
    }

    Danger build(final Random random) {
        return new Danger(nameAlgorithm.getName(random, typeName), verbPhrase, usesArticle){};
    }

}
