package menu;

import character.User;
import java.util.Scanner;

public class Menu {

	// Character creation
	public static String[] startGame() {

		Scanner scanner =new Scanner(System.in);
		User player = new User();

		// Introduction message
		System.out.println("""
				Welcome to Path of Adventurer!
				PoA is a simple text-based RPG where you can choose from 4 available classes.
				Your character can level up and spend resources to get stronger
				in order to fight increasingly harder enemies and a final boss.
				You can find more information on how the game works once you create a character.
				""");

		// Set a nickname for the user
		System.out.print("Please enter a nickname: ");
		String nickname = scanner.nextLine();
		player.setNickname(nickname);
		System.out.println("\nNickname set to: " + nickname + "\n");

		// Set a class for the user
		System.out.print("""
				Now, you can choose between 4 classes which have different attributes and skills.
				Please type 'info' if you want to see details of each class.
				Available classes: Warrior, Wizard, Ranger, BattleMage
				Please select a class from available classes:\s""");
		String className = scanner.nextLine();

		boolean setClass = false;
		while (!setClass) {
			switch (className.toLowerCase()) {
				case "warrior" -> {

					System.out.println("\nSelected class: Warrior\n");
					setClass = true;
				}
				case "wizard" -> {

					System.out.println("\nSelected class: Wizard\n");
					setClass = true;
				}
				case "ranger" -> {

					System.out.println("\nSelected class: Ranger\n");
					setClass = true;
				}
				case "battlemage" -> {

					System.out.println("\nSelected class: BattleMage\n");
					setClass = true;
				}
				case "info" -> {
					System.out.print("""
       
							Class information:

							Warrior is a durable class with high HP, high defenses, moderate physical damage and
							offers utility skills in order to stay alive for longer compared to other classes.

							Wizard is a magic class with medium HP, low defenses, high magical damage and while it isn't
							a durable class, it has some self healing capabilities while using various magic skills.

							Ranger is a potent class with low HP, low defenses with high physical damage but has it a
							high evasion chance which can negate enemy attacks completely while dealing a lot of damage.

							Battle Mage is a balanced class with medium HP, medium defenses, medium mixed damage and
							it has both offensive and defensive skills for different combat situations.

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

	// Main menu of the game
	public static void mainMenu(User player) {

		Scanner scanner = new Scanner(System.in);
		String selectMenu = "main";
		System.out.println("Switching to Main Menu.");

		boolean run = true;
		while (run) {
			switch (selectMenu.toLowerCase()) {
				case "main" -> {
					System.out.print("""
       
							MAIN MENU
							Please type 'info' if you want to see information about the main menu and basics of the gameplay.
							Available commands: Encounter, Character, Shop, Craft, Rest, Exit
							Please enter a command:\s""");
					selectMenu = scanner.nextLine();
				}
				case "encounter" -> {
					System.out.println("\nSwitching to Combat Menu.\n");
					CombatMenu.CombatMenu(player);
					player.print();
					selectMenu = "main";
				}
				case "character" -> {
					System.out.println("\nSwitching to Character Menu.\n");
					CharacterMenu.characterMenu(player);
					selectMenu = "main";
				}
				case "shop" -> {
					System.out.println("\nSwitching to Shop Menu.\n");
					ShopMenu.Shop(player);
					selectMenu = "main";
				}
				case "craft" -> {
					System.out.println("\nSwitching to Crafting Menu.\n");
					selectMenu = "main";
					menu.CraftMenu.Craft(player);
				}
				case "rest" -> {
					String prompt = null;
					System.out.println("\nYou can rest in order to fully restore your character's HP and MP for 100 currency." +
							"\nYour currency: " + player.currency);

					if (player.currency < 100) {
						System.out.println("You don't have enough currency.");
						selectMenu = "main";
					}
					else {
						System.out.print("\nDo you want to rest? Y/N: ");
						prompt = scanner.nextLine();

						if (prompt.equalsIgnoreCase("Y")) {
							player.hitPoints = player.maxHitPoints;
							player.currency -= 100;
						}
						else selectMenu = "main";
					}
				}
				case "info" -> {
					System.out.print("""
       
							MAIN MENU BASICS
							
							Encounter -> The game will switch to combat menu and you will fight a randomly generated enemy.
							Character -> The game will switch to character menu and you will be able to see all the information related
										 to your character like attributes, skills, inventory and currency.
							Shop -> The game will switch to shop menu and you will be able to buy items from shop in exchange for currency.
							Craft -> The game will switch to craft menu and you will be able to craft items that increase your stats.
							Rest -> Fully restore your character's HP and MP in exchange for currency.
							Exit -> Display final stats of the character and exit the game.
							
							CHARACTER BASICS
							
							Your character is assigned attributes and spells based on the class you choose.
							The character attributes in this game are:
							Hit Points (HP) -> Your HP determines the amount of points your character can take.
											   You will lose the game if it reaches 0.
							Mana Points (MP) -> Your MP is used to use your character's skills. You won't be able to use a skill
												if you don't meet MP requirements.
							Attack Damage (AD) -> Your AD is used when calculating damage dealt from physical weapons and skills.
							Ability Power (AP) -> Your AP is used when calculating damage dealt from magical weapons and skills.
							Defense (DEF) -> Your character takes % less damage from enemy attacks based on the amount of DEF they have.
							Evasion (EV) -> Your character has % chance to evade an enemy attack completely.
							Block (BL) -> Your character has % chance to block (DEF*2)% of the damage from enemy attacks.
							
							You can see other information about your character like level, skills and inventory from Character Menu.
							
							COMBAT BASICS
							
							Combat in this game is played in turns. Your character always goes first and choose from various actions
							like basic attack, use skills or items, defend yourself from next enemy attack or flee the combat.
							Once you play your turn, the enemy will attack. While the enemies don't have skills, they do have
							different amounts of physical and magical damage resistances so you should take that into consideration.
							
							You will lose the game if your character's HP reaches 0 before the enemy's does and you will earn EXP,
							currency and crafting materials if you win. EXP is used to level up your character.
							Once you reach a certain level, you will be able to fight a powerful boss enemy and if you defeat the boss,
							you will win the game.
							""");
					selectMenu = "main";
				}
				case "exit" -> {
					String prompt = null;
					System.out.print("""
       
							The game will end and your character's final statistics will be displayed.
							Are you sure you want to exit the game? Y/N:\s""");
					prompt = scanner.nextLine();

					if (prompt.equalsIgnoreCase("Y")) {
						// end game
						run = false;
						System.exit(0);
					}
					else selectMenu = "main";
				}
				default -> {
					System.out.println("\nInvalid input!\n");
					selectMenu = "main";
				}
			}
		}
	}
}