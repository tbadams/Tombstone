package com.tadams.pcg.tomb.model;

abstract class Danger
{
	abstract String getName();

	String getVerbPhrase() {
		return "killed by";
	}

	boolean useArticle() {
		return true;
	}
}
