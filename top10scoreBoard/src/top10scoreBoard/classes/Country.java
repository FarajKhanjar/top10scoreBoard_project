package top10scoreBoard.classes;

public enum Country 
{	
	Italy,
	Sweden,
	Israel,
	Turkey,
	Mexico,
	USA,
	Spain,
	Ukraine,
	Brazil,
	India,
	Denmark,
	Schweiz,
	Slovenia,
	Albania,
	Angola,
	China;	
	
	
	public static String getNameOfCountey(Country country)
	{
		switch(country)
		{
		case Italy:
            return "Italy";
		
		case Sweden:
			return "Sweden";
			
		case Israel:
			return "Israel";
		case Turkey:
			return "Turkey";
		case Mexico:
			return "Mexico";
		case USA:
			return "USA";
		case Spain:
			return "Spain";
		case Ukraine:
			return "Ukraine";
		case Brazil:
			return "Brazil";
		case India:
			return "India";
		case Denmark:
			return "Denmark";
		case Schweiz:
			return "Schweiz";
		case Slovenia:
			return "Slovenia";
		case Albania:
			return "Albania";
		case Angola:
			return "Angola";
		case China:
			return "China";
		}
		return "however";
	}
}

