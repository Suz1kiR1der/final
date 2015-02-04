import java.util.Scanner;


public class PlayerMaker
	{
		
		public static void thePlayer()
			{
				greetUser();
				playerMaker();
				//comMaker();
			}
		public static void greetUser()
			{
				Scanner userlnput = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = userlnput.nextLine();
				System.out.println("Nice to meet you, " + name + ".");
				System.out.println("Would you like to play a game of ESO, " + name + "?");
				String choice = userlnput.nextLine();
				if(choice.equals ("no"))
					{
						System.out.println("Okay.... bye");
						System.exit(0);
					}
				if(choice.equals ("yes"))
					{
						System.out.println("Let's get it onnn!!!");
					}
				System.out.println("Ok, you will have 3 players to face 3 bad guys. Let the games begin!!!");
			}
		public static void playerMaker()
			{
				
				
			}
	}
