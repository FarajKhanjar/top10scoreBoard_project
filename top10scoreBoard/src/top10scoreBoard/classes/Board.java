package top10scoreBoard.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Board 
{
	private List<Player> allPlayers;
	

	public Board() 
	{
		allPlayers = new ArrayList<>();
	}

	public void addGamer(Player player) 
	{
		if (player == null) 
		{
			System.out.println("Invalid player");
			return;
		}
		allPlayers.add(player);
	}

	public void update() 
	{
		 int TOP = 10;
		updateArrayOfPlayers();
		//System.out.println("The top 10 (with the highest score) gamers:");
		Iterator<Player> iterator = allPlayers.iterator();
		for (int i = 1; i <= TOP && iterator.hasNext(); i++) 
		{
			if(i==10)
				System.out.println(i + ")" + iterator.next());
			else
			System.out.println(i + ") " + iterator.next());
		}
	}

	private void updateArrayOfPlayers() 
	{
		List<Player> copyArrayPlayers = getCopyOfPlayers();

		allPlayers.clear();
		int size = copyArrayPlayers.size();
		for (int i = 0; i < size; i++) 
		{
			allPlayers.add(copyArrayPlayers.get(i));
		}
	}

	private List<Player> getCopyOfPlayers() 
	{
		List<Player> copy = new ArrayList<Player>();
		Iterator<Player> iterator = allPlayers.iterator();

		while (iterator.hasNext()) 
		{
			copy.add(iterator.next());
		}
		return copy;
	}
	
	public void sortByUserScore() 
	{
		Comparator<Player> byUserScore = new Comparator<Player>() 
		{
			
			@Override
			public int compare(Player player1, Player player2) 
			{
				return Float.compare(player2.getScore(), player1.getScore());
			}
		};
		
		List<Player> copy = getCopyOfPlayers();
		Collections.sort(copy,byUserScore);

		printValues(copy);
	}

	public void sortByUserName() 
	{
		Comparator<Player> byUserName = new Comparator<Player>() 
		{

			@Override
			public int compare(Player player1, Player player2) 
			{
				return player1.getName().compareTo(player2.getName());
			}
		};

		List<Player> copy = getCopyOfPlayers();

		Collections.sort(copy, byUserName);
		printValues(copy);
	}

	private void printValues(List<Player> queue) 
	{
		Iterator<Player> iterator = queue.iterator();

		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
		}
	}

	public void sortByUserCountry() 
	{
		Comparator<Player> byUserCountry = new Comparator<Player>() 
		{

			@Override
			public int compare(Player player1, Player player2) 
			{
				return player1.getCountry().compareTo(player2.getCountry());
			}
		};

		List<Player> copy = getCopyOfPlayers();
		Collections.sort(copy, byUserCountry);
		printValues(copy);
	}

	public void sortByUserRank() 
	{
		Comparator<Player> byUserRank = new Comparator<Player>() 
		{
			
			@Override
			public int compare(Player player1, Player player2) 
			{
				return Float.compare(player2.getRank(), player1.getRank());
			}
		};
		
		List<Player> copy = getCopyOfPlayers();
		Collections.sort(copy,byUserRank);

		printValues(copy);
	}
}
