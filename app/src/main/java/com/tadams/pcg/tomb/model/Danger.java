package com.tadams.pcg.tomb.model;

public abstract class Danger
{
	abstract String getName();

	String getVerbPhrase() {
		return "killed by";
	}

	boolean useArticle() {
		return true;
	}
}
