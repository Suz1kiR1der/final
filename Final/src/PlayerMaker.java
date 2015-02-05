import java.util.Scanner;


public class PlayerMaker
	{
		
		public static void main(String[] args)
			{
				greetUser();
				userPlayerMaker();
				//playerSkill();
				comPlayerMaker();
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
				System.out.println("Ok, you will have 3 players to face 3 bad guys. Let the games begin!!!");
			}
		public static void userPlayerMaker()
			{
				int player = (int)(Math.random()* 55)+1;
				if(player == 1)
					{
						System.out.println("Your characters are: Knight, Paladin, and a Templar.");
					}
				if(player == 2)
					{
						System.out.println("Your characters are: Knight, Paladin, and Dragonknight.");
					}
				if(player == 3)
					{
						System.out.println("Your characters are: Knight, Paladin, and Wood Elf Archer.");
					}
				if(player == 4)
					{
						System.out.println("Your characters are: Knight, Paladin, and Dwarf.");
					}
				if(player == 5)
					{
						System.out.println("Your characters are: Knight, Paladin, and High Elf.");
					}
				if(player == 6)
					{
						System.out.println("Your characters are: Knight, Paladin, and Dark Sorcerer.");
					}
				if(player == 7)
					{
						System.out.println("Your characters are: Knight, Paladin, and Rogue.");
					}
				if(player == 8)
					{
						System.out.println("Your characters are: Knight, Paladin, and Theif.");
					}
				if(player == 9)
					{
						System.out.println("Your characters are: Knight, Paladin, and Dragonborn.");
					}
				if(player == 10)
					{
						System.out.println("Your characters are: Knight, Paladin, and Dark Elf.");
					}
				if(player == 11)
					{
						System.out.println("Your characters are: Paladin, Templar, and Dragonknight.");
					}
				if(player == 12)
					{
						System.out.println("Your characters are: Paladin, Templar, and Wood Elf Archer.");
					}
				if(player == 13)
					{
						System.out.println("Your characters are: Paladin, Templar, and Dwarf.");
					}
				if(player == 14)
					{
						System.out.println("Your characters are: Paladin, Templar, and High Elf.");
					}
				if(player == 15)
					{
						System.out.println("Your characters are: Paladin, Templar, and Dark Sorcerer.");
					}
				if(player == 16)
					{
						System.out.println("Your characters are: Paladin, Templar, and Rogue.");
					}
				if(player == 17)
					{
						System.out.println("Your characters are: Paladin, Templar, and Theif.");
					}
				if(player == 18)
					{
						System.out.println("Your characters are: Paladin, Templar, and Dragonborn.");
					}
				if(player == 19)
					{
						System.out.println("Your characters are: Paladin, Templar, and Dark Elf.");
					}
				if(player == 20)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Wood Elf Archer.");
					}
				if(player == 21)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Dwarf.");
					}
				if(player == 22)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and High Elf.");
					}
				if(player == 23)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Dark Sorcerer.");
					}
				if(player == 24)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Rogue.");
					}
				if(player == 25)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Theif.");
					}
				if(player == 26)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Dragonborn.");
					}
				if(player == 27)
					{
						System.out.println("Your characters are: Templar, Dragonknight, and Dark Elf.");
					}
				if(player == 28)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and Dwarf.");
					}
				if(player == 29)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and High Elf.");
					}
				if(player == 30)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and Dark Sorcerer.");
					}
				if(player == 31)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and Rogue.");
					}
				if(player == 32)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and Theif.");
					}
				if(player == 33)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and Dragonborn.");
					}
				if(player == 34)
					{
						System.out.println("Your characters are: Dragonknight, Wood Elf Archer, and Dark Elf.");
					}
				if(player == 35)
					{
						System.out.println("Your characters are: Wood Elf Archer, Dwarf, and High Elf.");
					}
				if(player == 36)
					{
						System.out.println("Your characters are: Wood Elf Archer, Dwarf, and Dark Sorcerer.");
					}
				if(player == 37)
					{
						System.out.println("Your characters are: Wood Elf Archer, Dwarf, and Rogue.");
					}
				if(player == 38)
					{
						System.out.println("Your characters are: Wood Elf Archer, Dwarf, and Theif.");
					}
				if(player == 39)
					{
						System.out.println("Your characters are: Wood Elf Archer, Dwarf, and Dragonborn.");
					}
				if(player == 40)
					{
						System.out.println("Your characters are: Wood Elf Archer, Dwarf, and Dark Elf.");
					}
				if(player == 41)
					{
						System.out.println("Your characters are: Dwarf, High Elf, and Dark Sorcerer.");
					}
				if(player == 42)
					{
						System.out.println("Your characters are: Dwarf, High Elf, and Rogue.");
					}
				if(player == 43)
					{
						System.out.println("Your characters are: Dwarf, High Elf, and Theif.");
					}
				if(player == 44)
					{
						System.out.println("Your characters are: Dwarf, High Elf, and Dragonborn.");
					}
				if(player == 45)
					{
						System.out.println("Your characters are: Dwarf, High Elf, and Dark Elf.");
					}
				if(player == 46)
					{
						System.out.println("Your characters are: High Elf, Dark Sorcerer, and Rogue.");
					}
				if(player == 47)
					{
						System.out.println("Your characters are: High Elf, Dark Sorcerer, and Theif.");
					}
				if(player == 48)
					{
						System.out.println("Your characters are: High Elf, Dark Sorcerer, and Dragonborn.");
					}
				if(player == 49)
					{
						System.out.println("Your characters are: High Elf, Dark Sorcerer, and Dark Elf.");
					}
				if(player == 50)
					{
						System.out.println("Your characters are: Dark Sorcerer, Rogue, and Theif.");
					}
				if(player == 51)
					{
						System.out.println("Your characters are: Dark Sorcerer, Rogue, and Dragonborn.");
					}
				if(player == 52)
					{
						System.out.println("Your characters are: Dark Sorcerer, Rogue, and Dark Elf.");
					}
				if(player == 53)
					{
						System.out.println("Your characters are: Rogue, Theif, and Dragonborn.");
					}
				if(player == 54)
					{
						System.out.println("Your characters are: Rogue, Theif, and Dark Elf.");
					}
				if(player == 55)
					{
						System.out.println("Your characters are: Theif, Dragonborn, and Dark Elf.");
					}
			}
		public static void comPlayerMaker()
			{
				int com = (int)(Math.random()* 3)+1;
				if(com == 1)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and Dragon");
					}
				if(com == 2)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and gelatin cube");
					}
				if(com == 3)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and Giants");
					}
			}
	}