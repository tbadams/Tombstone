package com.tadams.pcg.tomb;

public abstract class Danger
{
	abstract String getName();

	protected String getVerbPhrase() {
		return "killed by";
	}

	protected boolean useArticle() {
		return true;
	}
}
