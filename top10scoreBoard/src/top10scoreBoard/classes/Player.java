package top10scoreBoard.classes;

import java.util.Objects;

public class Player implements Comparable<Player> 
{
	private int score;
	private String name;
	private Country country;
	private float rank;

	public Player(String name, Country country) 
	{
		setName(name);
		setCountry(country);
		setScore(0);
		setRank(0);
	}

	public void setScore(int score) 
	{
		this.score = score;
		setRank((float)(Math.random() * 50));
	}

	private void setName(String name) 
	{
		this.name = name;
	}

	private void setCountry(Country country) 
	{
		this.country = country;
	}

	public void setRank(float rank) 
	{
		this.rank = rank;
	}

	public String getName() 
	{
		return name;
	}

	public Country getCountry() 
	{
		return country;
	}

	public float getRank() 
	{
		return rank;
	}


	@Override
	public int hashCode() 
	{
		return Objects.hash(score);
	}

	@Override
	public boolean equals(Object player) 
	{
		if (this == player)
			return true;
		if (player == null)
			return false;
		if (getClass() != player.getClass())
			return false;
		Player other = (Player) player;
		return score == other.score;
	}

	@Override
	public int compareTo(Player player) 
	{
		return player.score - this.score;
	}
	
	@Override
	public String toString() 
	{
		return "[score=" + score + ", name=" + name + ", country=" + country + String.format(", rank= %.2f", rank) + "]";
	}
}
