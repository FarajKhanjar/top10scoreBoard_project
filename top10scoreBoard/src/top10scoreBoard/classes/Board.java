package top10scoreBoard.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Board 
{
	private List<Player> allPlayers;
	

	public Board() 
	{
		allPlayers = new ArrayList<>();
	}

	public void addPlayer(Player player) 
	{
		if (player == null) 
		{
			System.out.println("Invalid player");
			return;
		}
		allPlayers.add(player);
	}

	public void updateBoard() 
	{
		int top = 10;
		List<Player> copyArrayPlayers = getCopyOfPlayers();
		Collections.sort(copyArrayPlayers);
		Iterator<Player> iterator = copyArrayPlayers.iterator();
		
		for (int i = 1; i <= top && iterator.hasNext(); i++) 
		{
			if(i==10)
				System.out.println(i + ")" + iterator.next());
			else
			System.out.println(i + ") " + iterator.next());
		}
	}

	private List<Player> getCopyOfPlayers() 
	{
		List<Player> copyOfArray = new ArrayList<Player>();
		Iterator<Player> iterator = allPlayers.iterator();

		while (iterator.hasNext()) 
		{
			copyOfArray.add(iterator.next());
		}
		return copyOfArray;
	}

	public void sortByUserName() 
	{
		List<Player> copyOfArray = getCopyOfPlayers();
		Comparator<Player> byUserName = new Comparator<Player>() 
		{

			@Override
			public int compare(Player player1, Player player2) 
			{
				return player1.getName().compareTo(player2.getName());
			}
		};

		Collections.sort(copyOfArray, byUserName);
		printListValues(copyOfArray);
	}

	public void sortByUserCountry() 
	{
		List<Player> copyOfArray = getCopyOfPlayers();
		Comparator<Player> byUserCountry = new Comparator<Player>() 
		{

			@Override
			public int compare(Player player1, Player player2) 
			{
				return player1.getCountry().compareTo(player2.getCountry());
			}
		};

		Collections.sort(copyOfArray, byUserCountry);
		printListValues(copyOfArray);
	}

	public void sortByUserRank() 
	{
		List<Player> copyOfArray = getCopyOfPlayers();
		Comparator<Player> byUserRank = new Comparator<Player>() 
		{
			
			@Override
			public int compare(Player player1, Player player2) 
			{
				return Float.compare(player2.getRank(), player1.getRank());
			}
		};
		
		Collections.sort(copyOfArray,byUserRank);
		printListValues(copyOfArray);
	}
	
	private void printListValues(List<Player> queue) 
	{		
		Iterator<Player> iterator = queue.iterator();

		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
	}
}
