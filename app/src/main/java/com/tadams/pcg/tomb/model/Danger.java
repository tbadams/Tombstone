package com.tadams.pcg.tomb.model;

class Danger
{
	private String name;
	private final String verbPhrase;
	private final boolean usesArticle;

	public Danger(){
		name = null;
		this.verbPhrase = "killed by";
		this.usesArticle = true;
	}

	public Danger(String name, String verbPhrase, boolean usesArticle) {
		this.name = name;
		this.verbPhrase = verbPhrase;
		this.usesArticle = usesArticle;
	}

	String getName() {
		return name;
	}

	String getVerbPhrase() {
		return verbPhrase;
	}

	boolean useArticle() {
		return usesArticle;
	}
}
