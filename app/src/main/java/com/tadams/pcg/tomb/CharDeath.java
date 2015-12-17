package com.tadams.pcg.tomb;

public class CharDeath
{
	private final Character character;
	private final Danger killer;
	private final String floor;
	private final int score;
	private int gold;
    private WhileStatus whileStatus;

	public CharDeath(Character dude, Danger kill, String place, int score){
		character = dude;
		killer = kill;
		floor = place;
		this.score = score;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(character.getName()).append(" the ")
				.append(character.getCharClass().getName()).append(", ").append(killer.getVerbPhrase()).append(" ");
        if(killer.useArticle()) {
            String killerName = killer.getName();
            sb.append(killerName.matches("[aeiouAEIOU].*") ? "an" : "a").append(" ");
        }
        sb.append(killer.getName());
        if(whileStatus != null) {
            sb.append(" while ").append(whileStatus.phrase());
        }
        sb.append(" at ").append(floor).append(" with score ").append(score)
        		.append(".");
		return sb.toString();
	}
}
