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
				System.out.println("____________________________________");
				System.out.println("");
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
				int com = (int)(Math.random()* 188)+1;
				if(com == 1)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Dragon.");
					}
				if(com == 2)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Gelatin Cube.");
					}
				if(com == 3)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Giant.");
					}
				if(com == 4)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Goblin.");
					}
				if(com == 5)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and an Orc.");
					}
				if(com == 6)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and the Beholder.");
					}
				if(com == 7)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Vampire King.");
					}
				if(com == 8)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Vampire Queen.");
					}
				if(com == 9)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and Alduin.");
					}
				if(com == 10)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Griffin.");
					}
				if(com == 11)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Ogre.");
					}
				if(com == 12)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and Nezznar the Black Spider .");
					}
				if(com == 13)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and Mormesk the Wraith .");
					}
				if(com == 14)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Gargoyle.");
					}
				if(com == 15)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and an Wyvern.");
					}
				if(com == 16)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Stone Giant.");
					}
				if(com == 17)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Stone Golem.");
					}
				if(com == 18)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Troll.");
					}
				if(com == 19)
					{
						System.out.println("And your enemies are: Kobald, Dark Wizard, and a Death Knight.");
					}
				if(com == 20)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Gelatin Cube.");
					}
				if(com == 21)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Giant.");
					}
				if(com == 22)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Goblin.");
					}
				if(com == 23)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and an Orc.");
					}
				if(com == 24)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and the Beholder.");
					}
				if(com == 25)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Vampire King.");
					}
				if(com == 26)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Vampire Queen.");
					}
				if(com == 27)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and Alduin.");
					}
				if(com == 28)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Griffin.");
					}
				if(com == 29)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Ogre.");
					}
				if(com == 30)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Nezznar the Black Spider.");
					}
				if(com == 31)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Mormesk the Wraith.");
					}
				if(com == 32)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Gargoyle.");
					}
				if(com == 33)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Wyvern.");
					}
				if(com == 34)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Stone Giant.");
					}
				if(com == 35)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Stone Golem.");
					}
				if(com == 36)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Troll.");
					}
				if(com == 37)
					{
						System.out.println("And your enemies are: Dark Wizard, Dragon, and a Death Knight.");
					}
				if(com == 38)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Giant.");
				}
				if(com == 39)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Goblin.");
				}
				if(com == 40)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and an Orc.");
				}
				if(com == 41)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and the Beholder.");
				}
				if(com == 42)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Vampire King.");
				}
				if(com == 43)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Vampire Queen.");
				}
				if(com == 44)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and Alduin.");
				}
				if(com == 45)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Griffin.");
				}
				if(com == 46)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and an Ogre.");
				}
				if(com == 47)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and Nezznar the Black Spider.");
				}
				if(com == 48)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and Mormesk the Wraith.");
				}
				if(com == 49)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Gargoyle.");
				}
				if(com == 49)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Wyvern.");
				}
				if(com == 50)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Stone Giant.");
				}
				if(com == 51)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Stone Golem.");
				}
				if(com == 52)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Troll.");
				}
				if(com == 53)
				{
					System.out.println("And your enemies are: Dragon, Gelatin Cube, and a Death Knight.");
				}
				if(com == 54)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Goblin.");
				}
				if(com == 55)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and an Orc.");
				}
				if(com == 55)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and the Beholder.");
				}
				if(com == 56)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Vampire King.");
				}
				if(com == 57)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Vampire Queen.");
				}
				if(com == 58)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and Alduin.");
				}
				if(com == 59)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Griffin.");
				}
				if(com == 60)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and an Ogre.");
				}
				if(com == 61)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and Nezznar the Black Spider.");
				}
				if(com == 62)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and Mormesk the Wraith.");
				}
				if(com == 63)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Gargoyle.");
				}
				if(com == 64)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Wyvern.");
				}
				if(com == 65)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Stone Giant.");
				}
				if(com == 66)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Stone Golem.");
				}
				if(com == 67)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Troll.");
				}
				if(com == 68)
				{
					System.out.println("And your enemies are: Gelatin Cube, Giant, and a Death Knight.");
				}
				if(com == 69)
				{
					System.out.println("And your enemies are: Giant, Goblin, and an Orc.");
				}
				if(com == 70)
				{
					System.out.println("And your enemies are: Giant, Goblin, and the Beholder.");
				}
				if(com == 71)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Vampire King.");
				}
				if(com == 72)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Vampire Queen.");
				}
				if(com == 73)
				{
					System.out.println("And your enemies are: Giant, Goblin, and Alduin.");
				}
				if(com == 74)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Griffin.");
				}
				if(com == 75)
				{
					System.out.println("And your enemies are: Giant, Goblin, and an Ogre.");
				}
				if(com == 76)
				{
					System.out.println("And your enemies are: Giant, Goblin, and Nezznar the Black Spider.");
				}
				if(com == 77)
				{
					System.out.println("And your enemies are: Giant, Goblin, and Mormesk the Wraith.");
				}
				if(com == 78)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Gargoyle.");
				}
				if(com == 79)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Wyvern.");
				}
				if(com == 80)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Stone Giant.");
				}
				if(com == 81)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Stone Golem.");
				}
				if(com == 82)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Troll.");
				}
				if(com == 83)
				{
					System.out.println("And your enemies are: Giant, Goblin, and a Death Knight.");
				}
				if(com == 84)
				{
					System.out.println("And your enemies are: Goblin, Orc, and the Beholder.");
				}
				if(com == 85)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Vampire King.");
				}
				if(com == 86)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Vampire Queen.");
				}
				if(com == 87)
				{
					System.out.println("And your enemies are: Goblin, Orc, and Alduin.");
				}
				if(com == 88)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Griffin.");
				}
				if(com == 89)
				{
					System.out.println("And your enemies are: Goblin, Orc, and an Ogre.");
				}
				if(com == 90)
				{
					System.out.println("And your enemies are: Goblin, Orc, and Nezznar the Black Spider.");
				}
				if(com == 91)
				{
					System.out.println("And your enemies are: Goblin, Orc, and Mormesk the Wraith.");
				}
				if(com == 92)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Gargoyle.");
				}
				if(com == 93)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Wyvern.");
				}
				if(com == 94)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Stone Giant.");
				}
				if(com == 95)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Stone Golem.");
				}
				if(com == 96)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Troll.");
				}
				if(com == 97)
				{
					System.out.println("And your enemies are: Goblin, Orc, and a Death Knight.");
				}
				if(com == 98)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Vampire King.");
				}
				if(com == 99)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Vampire Queen.");
				}
				if(com == 100)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and Alduin.");
				}
				if(com == 101)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Griffin.");
				}
				if(com == 102)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and an Ogre.");
				}
				if(com == 103)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and Nezznar the Black Spider.");
				}
				if(com == 104)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and Mormesk the Wraith.");
				}
				if(com == 105)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Gargoyle.");
				}
				if(com == 106)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Wyvern.");
				}
				if(com == 107)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Stone Giant.");
				}
				if(com == 108)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Stone Golem.");
				}
				if(com == 109)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Troll.");
				}
				if(com == 110)
				{
					System.out.println("And your enemies are: Orc, the Beholder, and a Death Knight.");
				}
				if(com == 111)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Vampire Queen.");
				}
				if(com == 112)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and Alduin.");
				}
				if(com == 113)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Griffin.");
				}
				if(com == 114)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and an Ogre.");
				}
				if(com == 115)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and Nezznar the Black Spider.");
				}
				if(com == 116)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and Mormesk the Wraith.");
				}
				if(com == 117)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Gargoyle.");
				}
				if(com == 118)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Wyvern.");
				}
				if(com == 119)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Stone Giant.");
				}
				if(com == 120)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Stone Golem.");
				}
				if(com == 121)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Troll.");
				}
				if(com == 122)
				{
					System.out.println("And your enemies are: The Beholder, Vampire King, and a Death Knight.");
				}
				if(com == 123)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and Alduin.");
				}
				if(com == 124)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Griffin.");
				}
				if(com == 125)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and an Ogre.");
				}
				if(com == 126)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and Nezznar the Black Spider.");
				}
				if(com == 127)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and Mormesk the Wraith.");
				}
				if(com == 128)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Gargoyle.");
				}
				if(com == 129)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Wyvern.");
				}
				if(com == 130)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Stone Giant.");
				}
				if(com == 131)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Stone Golem.");
				}
				if(com == 132)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Troll.");
				}
				if(com == 133)
				{
					System.out.println("And your enemies are: Vampire King, Vampire Queen, and a Death Knight.");
				}
				if(com == 134)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Griffin.");
				}
				if(com == 135)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and an Ogre.");
				}
				if(com == 136)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and Nezznar the Black Spider.");
				}
				if(com == 137)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and Mormesk the Wraith.");
				}
				if(com == 138)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Gargoyle.");
				}
				if(com == 139)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Wyvern.");
				}
				if(com == 140)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Stone Giant.");
				}
				if(com == 141)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Stone Golem.");
				}
				if(com == 142)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Troll.");
				}
				if(com == 143)
				{
					System.out.println("And your enemies are: Vampire Queen, Alduin, and a Death Knight.");
				}
				if(com == 144)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and an Ogre.");
				}
				if(com == 145)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and Nezznar the Black Spider.");
				}
				if(com == 146)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and Mormesk the Wraith.");
				}
				if(com == 147)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and a Gargoyle.");
				}
				if(com == 148)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and a Wyvern.");
				}
				if(com == 149)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and a Stone Giant.");
				}
				if(com == 150)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and a Stone Golem.");
				}
				if(com == 151)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and a Troll.");
				}
				if(com == 152)
				{
					System.out.println("And your enemies are: Alduin, Griffin, and a Death Knight.");
				}
				if(com == 153)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and Nezznar the Black Spider.");
				}
				if(com == 154)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and Mormesk the Wraith.");
				}
				if(com == 155)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and a Gargoyle.");
				}
				if(com == 156)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and a Wyvern.");
				}
				if(com == 157)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and a Stone Giant.");
				}
				if(com == 158)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and a Stone Golem.");
				}
				if(com == 159)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and a Troll.");
				}
				if(com == 160)
				{
					System.out.println("And your enemies are: Griffin, Ogre, and a Death Knight.");
				}
				if(com == 161)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and Mormesk the Wraith.");
				}
				if(com == 162)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and a Gargoyle.");
				}
				if(com == 163)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and a Wyvern.");
				}
				if(com == 164)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and a Stone Giant.");
				}
				if(com == 165)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and Stone Golem.");
				}
				if(com == 166)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and a Troll.");
				}
				if(com == 167)
				{
					System.out.println("And your enemies are Ogre, Nezznar the Black Spider, and a Death Knight.");
				}
				if(com == 168)
				{
					System.out.println("And your enemies are Nezznar the Black Spider, Mormesk the Wraith, and a Gargoyle.");
				}
				if(com == 169)
				{
					System.out.println("And your enemies are Nezznar the Black Spider, Mormesk the Wraith, and a Wyvern.");
				}
				if(com == 170)
				{
					System.out.println("And your enemies are Nezznar the Black Spider, Mormesk the Wraith, and a Stone Giant.");
				}
				if(com == 171)
				{
					System.out.println("And your enemies are Nezznar the Black Spider, Mormesk the Wraith, and a Stone Golem.");
				}
				if(com == 172)
				{
					System.out.println("And your enemies are Nezznar the Black Spider, Mormesk the Wraith, and a Troll.");
				}
				if(com == 173)
				{
					System.out.println("And your enemies are Nezznar the Black Spider, Mormesk the Wraith, and a Death Knight.");
				}
				if(com == 174)
				{
					System.out.println("And your enemies are: Mormesk the Wraith, Gargoyle, and a Wyvern.");
				}
				if(com == 175)
				{
					System.out.println("And your enemies are: Mormesk the Wraith, Gargoyle, and a Stone Giant.");
				}
				if(com == 176)
				{
					System.out.println("And your enemies are: Mormesk the Wraith, Gargoyle, and a Stone Golem.");
				}
				if(com == 177)
				{
					System.out.println("And your enemies are: Mormesk the Wraith, Gargoyle, and a Troll.");
				}
				if(com == 178)
				{
					System.out.println("And your enemies are: Mormesk the Wraith, Gargoyle, and a Death Knight.");
				}
				if(com == 179)
				{
					System.out.println("And your enemies are: Gargoyle, Wyvern, and a Stone Giant.");
				}
				if(com == 180)
				{
					System.out.println("And your enemies are: Gargoyle, Wyvern, and a Stone Golem.");
				}
				if(com == 181)
				{
					System.out.println("And your enemies are: Gargoyle, Wyvern, and a Troll.");
				}
				if(com == 182)
				{
					System.out.println("And your enemies are: Gargoyle, Wyvern, and a Death Knight.");
				}
				if(com == 183)
				{
					System.out.println("And your enemies are: Wyvern, Stone Giant, and a Stone Golem.");
				}
				if(com == 184)
				{
					System.out.println("And your enemies are: Wyvern, Stone Giant, and a Troll.");
				}
				if(com == 185)
				{
					System.out.println("And your enemies are: Wyvern, Stone Giant, and a Death Knight.");
				}
				if(com == 186)
				{
					System.out.println("And your enemies are: Stone Giant, Stone Golem, and a Troll.");
				}
				if(com == 187)
				{
					System.out.println("And your enemies are: Stone Giant, Stone Golem, and a Death Knight.");
				}
				if(com == 188)
				{
					System.out.println("And your enemies are: Stone Golem, Troll, and a Death Knight.");
				}
			}
	}