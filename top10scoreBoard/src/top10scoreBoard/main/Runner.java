package top10scoreBoard.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import top10scoreBoard.classes.Board;
import top10scoreBoard.classes.Country;
import top10scoreBoard.classes.Player;

public class Runner 
{
	static Board scoreBoard = new Board();
	static List<Player> playersList = new ArrayList<>();

	
	public static void main(String[] args) 
	{
		createAllPlayersList();
		createPlayersScore();
		//scoreBoard.update();
		
		System.out.println("The top 10 (with the highest score) gamers:");
		scoreBoard.sortByUserScore();
		System.out.println("\nList sorted by the user name:");
		scoreBoard.sortByUserName();
		System.out.println("\nList sorted by the user country:");
		scoreBoard.sortByUserCountry();
		System.out.println("\nList sorted by the user rank (Max to Min):");
		scoreBoard.sortByUserRank();
	}
	
	public static void createAllPlayersList()
	{
		playersList.add(new Player("Faraj", Country.Israel));
		playersList.add(new Player("Sami", Country.Italy));
		playersList.add(new Player("Omer", Country.Sweden));
		playersList.add(new Player("Guy", Country.Israel));
		playersList.add(new Player("Adam", Country.Turkey));
		playersList.add(new Player("Ofer", Country.Italy));
		playersList.add(new Player("Raviv", Country.Mexico));
		playersList.add(new Player("Reta", Country.Slovenia));
		playersList.add(new Player("Ketty", Country.USA));
		playersList.add(new Player("Aviv", Country.Albania));
		playersList.add(new Player("Idan", Country.Spain));
		playersList.add(new Player("Mina", Country.Ukraine));
		playersList.add(new Player("Norman", Country.Brazil));
		playersList.add(new Player("Nasreen", Country.Israel));
		playersList.add(new Player("Laila", Country.India));
		playersList.add(new Player("John", Country.Schweiz));
	}
	
	public static void createPlayersScore()
	{
		Iterator<Player> iteratorOfPlayers = playersList.iterator();
		
		while (iteratorOfPlayers.hasNext()) 
		{
			scoreBoard.addGamer(iteratorOfPlayers.next());
		}		

		int[] scores = new int[playersList.size()];	
		for (int i = 0; i < scores.length; i++) 
		{
			scores[i] = playerRandomScore();
		}
		
		for (int i = 0; i < playersList.size(); i++) 
		{
			playersList.get(i).setScore(scores[i]);
		}	
	}
	
	public static int playerRandomScore()
	{
		return (int) ((Math.random() * (800 - 10)) + 10); // random value between 10 and 800.
		
	}
}
