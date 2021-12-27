package menu;

import character.User;
import java.util.Scanner;

public class Menu {

	public static String[] startGame() {

		// Introduction message
		System.out.println("""
				Welcome to Path of Adventurer!
				PoA is a simple text-based RPG where you can choose from 4 available classes.
				Your character can level up and spend resources to get stronger
				 in order to fight increasingly harder enemies and a final boss.
				You can find more information on how the game works once you create a character.
				""");

		User player = new User();
		Scanner scanner =new Scanner(System.in);

		// Set a nickname for the user
		System.out.print("Please enter a nickname: ");
		String nickname = scanner.nextLine();
		player.setNickname(nickname);
		System.out.println("Nickname set to: " + nickname + "\n");

		// Set a class for the user
		System.out.print("""
				Now, you can choose between 4 classes which have different attributes and spells.
				Please type 'info' if you want to see details of each class.
				Available classes: Warrior, Wizard, Ranger, BattleMage
				Please select a class from available classes:\s""");
		String className = scanner.nextLine();

		boolean setClass = false;
		while (!setClass) {

			switch (className.toLowerCase()) {

				case "warrior" -> {

					System.out.println("Selected class: Warrior\n");
					setClass = true;
				}
				case "wizard" -> {

					System.out.println("Selected class: Wizard\n");
					setClass = true;
				}
				case "ranger" -> {

					System.out.println("Selected class: Ranger\n");
					setClass = true;
				}
				case "battlemage" -> {

					System.out.println("Selected class: BattleMage\n");
					setClass = true;
				}
				case "info" -> {
					System.out.print("""
							Class information:

							Warrior is a durable class with high HP, high defenses, moderate physical damage and
							 offers utility spells in order to stay alive for longer compared to other classes.

							Wizard is a magic class with medium HP, low defenses, high magical damage and while it isn't
							 a durable class, it has some self healing capabilities while using various magic spells.

							Ranger is a potent class with low HP, low defenses with high physical damage but has it a
							high dodge chance which can negate enemy attacks completely while dealing a lot of damage.

							Battle Mage is a balanced class with medium HP, medium defenses, medium mixed damage and
							 it has both offensive and defensive spells for different combat situations.

							Available classes: Warrior, Wizard, Ranger, BattleMage
							Please select a class from available classes:\s""");
					className = scanner.nextLine();
				}
				default -> {
					System.out.print("""
       
							Invalid input!
							Please type 'info' if you want to see details of each class.
							Available classes: Warrior, Wizard, Ranger, BattleMage
							Please select a class from available classes:\s""");
					className = scanner.nextLine();
				}
			}
		}
		String[] playerData = new String[2];
		playerData[0] = className;
		playerData[1] = nickname;
		return playerData;
	}
	
	public static void mainMenu(User player) {
		
		Scanner scanner = new Scanner(System.in);
		
	      // Main Menu
		
	        System.out.println("\nWIP: Main Menu introduction..");
	        String selectMenu = "main";
	        boolean run = true;
	        while (run) {
	            
	            //her seferinde string yazdırmaktansa seçeneklere index verip index girilmesi istenebilir
	             
	            switch (selectMenu.toLowerCase()) {
	                case "main" -> {
	                    System.out.println("WIP: Display main menu and selections etc.");
	                    System.out.print("WIP: Select an option: ");
	                    selectMenu = scanner.nextLine();
	                }
	                case "encounter" -> {
	                    System.out.println("\nWIP: Create encounter and switch to combat menu\n");
	                    selectMenu = "main";
	                    CombatMenu.CombatMenu(player);
	                    player.print();
	                }
	                case "inventory" -> {
	                    System.out.println("\nWIP: Switch to inventory menu\n");
	                    menu.InventoryMenu.inventoryMenu(player);
	                    selectMenu = "main";
	                }
	                case "shop" -> {
	                    System.out.println("\nWIP: Switch to shop menu\n");
	                    ShopMenu.Shop(player);
	                    selectMenu = "main";
	                }
	                case "craft" -> {
	                    System.out.println("\nWIP: Switch to craft menu\n");
	                    selectMenu = "main";
	                    menu.CraftMenu.Craft(player);
	                }
	                case "rest" -> {
	                    System.out.println("\nWIP: Rest\n");
	                    selectMenu = "main";
	                }
	                case "introductions" -> {
	                    System.out.println("\nWIP: Show introductions\n");
	                    selectMenu = "main";
	                }
	                case "exit" -> {
	                    System.out.println("\nWIP: exit game\n");
	                    run = false;
	                }
	                default -> {
	                    System.out.println("Invalid input!\n");
	                    selectMenu = "main";
	                }
	            }
	        }
		
	}

}
