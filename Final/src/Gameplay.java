import java.util.ArrayList;
import java.util.Scanner;


public class Gameplay
	{
		static ArrayList<Gameplay>comSkills = new ArrayList<Gameplay>();
		static ArrayList<Gameplay>playerSkills = new ArrayList<Gameplay>();
		private int defense;
		private int health;
		private String name;
		static int player;
		static int com;
		public Gameplay(String n ,int d, int h)
			{
				name = n;
				defense = d;
				health = h;
			}
		public static void main (String[] args)
			{
				userPlayerMaker();
				comPlayerMaker();
				runningTheGame();
			}
		public static void userPlayerMaker()
			{
				playerSkills.add(new Gameplay("Knight", 18, 120));
				playerSkills.add(new Gameplay("Paladin", 16, 140));
				playerSkills.add(new Gameplay("Dragonknight", 14, 100));
				playerSkills.add(new Gameplay("Wood Elf Archer", 14, 125));
			}
		public static void comPlayerMaker()
			{
				comSkills.add(new Gameplay("Kobold", 7, 50));
				comSkills.add(new Gameplay("Dark Wizard", 10, 90));
				comSkills.add(new Gameplay("the Beholder", 15, 180));
				comSkills.add(new Gameplay("Vampire King", 13, 120));
			}
		public static void runningTheGame()
			{
				System.out.println("Now it's time to battle!");
				System.out.println("Your player is " + playerSkills.get(player).getName() + " and its Defense is " + playerSkills.get(player).getDefense() + " and its health is " + playerSkills.get(player).getHealth() + ".");
				System.out.println("Your player is " + comSkills.get(player).getName() + " and its Defense is " + comSkills.get(player).getDefense() + " and its health is " + comSkills.get(player).getHealth() + ".");
				System.out.println("You go first.");
			}
		public int getDefense()
			{
				return defense;
			}
		public void setDefense(int defense)
			{
				this.defense = defense;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
	}
