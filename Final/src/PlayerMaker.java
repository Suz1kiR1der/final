import java.util.ArrayList;
import java.util.Scanner;


public class PlayerMaker
	{
		static String board [] [] = new String [4] [4];
		private int defense;
		private int health;
		private String name;
		private int sneak;
		public PlayerMaker(String n ,int d, int h, int s)
			{
				sneak = s;
				name = n;
				defense = d;
				health = h;
			}
		public static void main(String[] args)
			{
				greetUser();
				userPlayerMaker();
				comPlayerMaker();
				//playerSkill();
			}
		public static void greetUser()
			{
				Scanner userlnput = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = userlnput.nextLine();
				System.out.println("Nice to meet you, " + name + ".");
				System.out.println("Would you like to play a game of ESO, " + name + "?");
				String choice = userlnput.nextLine();
				if(choice.equals ("no") || choice.equals("No"))
					{
						System.out.println("Okay.... bye");
						System.exit(0);
					}
				if(choice.equals ("yes") || choice.equals("Yes"))
					{
						System.out.println("Let's get it onnn!!!");
					}
				System.out.println("Ok, you will have 1 player to face 1 bad guy. Let the games begin!!!");
				System.out.println("____________________________________");
				System.out.println("");
			}
		public static void userPlayerMaker()
			{
				int player = (int)(Math.random()* 11)+1;
				if(player == 1)
					{
						System.out.println("Your character is: Knight.");
					}
				if(player == 2)
					{
						System.out.println("Your character is: Paladin.");
					}
				if(player == 3)
					{
						System.out.println("Your character is: Dragonknight.");
					}
				if(player == 4)
					{
						System.out.println("Your character is: Wood Elf Archer.");
					}
				if(player == 5)
					{
						System.out.println("Your character is: Dwarf.");
					}
				if(player == 6)
					{
						System.out.println("Your character is: High Elf.");
					}
				if(player == 7)
					{
						System.out.println("Your character is: Dark Sorcerer.");
					}
				if(player == 8)
					{
						System.out.println("Your character is: Rogue.");
					}
				if(player == 9)
					{
						System.out.println("Your character is: Theif.");
					}
				if(player == 10)
					{
						System.out.println("Your character is: Dragonborn.");
					}
				if(player == 11)
					{
						System.out.println("Your character is: Dark Elf.");
					}
			}
		public static void comPlayerMaker()
			{
				int com = (int)(Math.random()* 18)+1;
				if(com == 1)
					{
						System.out.println("And your enemy is: Kobald.");
					}
				if(com == 2)
					{
						System.out.println("And your enemy is: Dark Wizard.");
					}
				if(com == 3)
					{
						System.out.println("And your enemy is: Dragon.");
					}
				if(com == 4)
					{
						System.out.println("And your enemy is: Giant.");
					}
				if(com == 5)
					{
						System.out.println("And your enemy is: Goblin.");
					}
				if(com == 6)
					{
						System.out.println("And your enemy is: Orc.");
					}
				if(com == 7)
					{
						System.out.println("And your enemy is: the Beholder.");
					}
				if(com == 8)
					{
						System.out.println("And your enemy is: Vampire King.");
					}
				if(com == 9)
					{
						System.out.println("And your enemy is: Vampire Queen.");
					}
				if(com == 10)
					{
						System.out.println("And your enemy is: Alduin.");
					}
				if(com == 11)
					{
						System.out.println("And your enemy is: Griffin.");
					}
				if(com == 12)
					{
						System.out.println("And your enemy is: Ogre.");
					}
				if(com == 13)
					{
						System.out.println("And your enemy is: Nezznar the Black Spider.");
					}
				if(com == 14)
					{
						System.out.println("And your enemy is: Mormesk the Wraith.");
					}
				if(com == 15)
					{
						System.out.println("And your enemy is: Gargoyle.");
					}
				if(com == 16)
					{
						System.out.println("And your enemy is: Wyvern.");
					}
				if(com == 17)
					{
						System.out.println("And your enemy is: Stone Giant.");
					}
				if(com == 18)
					{
						System.out.println("And your enemy is: Troll.");
					}
				if(com == 19)
					{
						System.out.println("And your enemy is: Death Knight");
					}
				}
		/*public static void playerSkill()
			{
				ArrayList<PlayerMaker>Skills = new ArrayList<PlayerMaker>();
				Skills.add(new PlayerMaker("Knight", ));
				Skills.add(new PlayerMaker("Paladin", ));
				Skills.add(new PlayerMaker("Templar", ));
				Skills.add(new PlayerMaker("Dragonknight", ));
				Skills.add(new PlayerMaker("Wood Elf Archer", ));
				Skills.add(new PlayerMaker("Dwarf", ));
				Skills.add(new PlayerMaker("High Elf", ));
				Skills.add(new PlayerMaker("Dark Sorcerer", ));
				Skills.add(new PlayerMaker("Rogue", ));
				Skills.add(new PlayerMaker("Theif", ));
				Skills.add(new PlayerMaker("Dragonborn", ));
				Skills.add(new PlayerMaker("Dark Elf", ));
				Skills.add(new PlayerMaker("Knight", ));
				Skills.add(new PlayerMaker("Kobold", ));
				Skills.add(new PlayerMaker("Dark Wizard", ));
				Skills.add(new PlayerMaker("Dragon", ));
				Skills.add(new PlayerMaker("Gelatin Cube", ));
				Skills.add(new PlayerMaker("Giant", ));
				Skills.add(new PlayerMaker("Goblin", ));
				Skills.add(new PlayerMaker("Orc", ));
				Skills.add(new PlayerMaker("the Beholder", ));
				Skills.add(new PlayerMaker("Vampire King", ));
				Skills.add(new PlayerMaker("Vampire Queen", ));
				Skills.add(new PlayerMaker("Alduin", ));
				Skills.add(new PlayerMaker("Griffin", ));
				Skills.add(new PlayerMaker("Ogre", ));
				Skills.add(new PlayerMaker("Nezznar the Black Spider", ));
				Skills.add(new PlayerMaker("Mormesk the Wraith", ));
				Skills.add(new PlayerMaker("Gargoyle", ));
				Skills.add(new PlayerMaker("Wyvern", ));
				Skills.add(new PlayerMaker("Stone Giant", ));
				Skills.add(new PlayerMaker("Troll", ));
				Skills.add(new PlayerMaker("Death Knight", ));
			}*/
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