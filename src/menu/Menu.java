package menu;

import java.util.Scanner;

import character.BattleMage;
import character.Ranger;
import character.User;
import character.Warrior;
import character.Wizard;

public class Menu {
	
	public static String[] startGame() {
		System.out.println("WIP: Welcome message!\n");

        /*
        createUser() kullanmadım, kullanacaksak ya main'de olacak ya da setNickname()'den önce
         */
        User user = new User();
        Scanner scanner =new Scanner(System.in);

        // Set a nickname for the user
        System.out.print("Please enter a nickname: ");
        String nickname = scanner.nextLine();
        user.setNickname(nickname);
        System.out.println("Nickname set to: " + nickname + "\n");

        // Set a class for the user
        System.out.println("WIP: Class introduction..");
        System.out.println("Available classes: Warrior, Wizard, Ranger, BattleMage");
        System.out.print("Please select a class from available classes: ");
        String className = scanner.nextLine();
        boolean setClass = false;
        while (!setClass) {
            switch (className.toLowerCase()) {
            /*
            setclass biraz garip oldu, object yarıtılınca zaten set'leniyor aslında
            */
                case "warrior" -> {
                    Warrior warrior = new Warrior("Warrior");
                    warrior.setclassWarrior();
                    System.out.println("Selected class: Warrior\n");
                    setClass = true;
                }
                case "wizard" -> {
                    Wizard wizard = new Wizard("Wizard");
                    wizard.setclassWizard();
                    System.out.println("Selected class: Wizard\n");
                    setClass = true;
                }
                case "ranger" -> {
                    Ranger ranger = new Ranger("Ranger");
                    ranger.setclassRanger();
                    System.out.println("Selected class: Ranger\n");
                    setClass = true;
                }
                case "battlemage" -> {
                    BattleMage battleMage = new BattleMage("BattleMage");
                    battleMage.setclassBattleMage();
                    System.out.println("Selected class: BattleMage\n");
                    setClass = true;
                }
                default -> {
                    System.out.println("\nInvalid input!");
                    System.out.println("Available classes: Warrior, Wizard, Ranger, BattleMage");
                    System.out.print("Please select a class from available classes: ");
                    className = scanner.nextLine();
                }
            }
        }
        user.setClass(className);
        String[] returnUser = new String[2];
        returnUser[0] = className;
        returnUser[1] = nickname;
        user.showStats();
        return returnUser;
	}
	
	public static void mainMenu(String[] s) {
		
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
	                }
	                case "inventory" -> {
	                    System.out.println("\nWIP: Switch to inventory menu\n");
	                    selectMenu = "main";
	                }
	                case "shop" -> {
	                    System.out.println("\nWIP: Switch to shop menu\n");
	                    selectMenu = "main";
	                }
	                case "craft" -> {
	                    System.out.println("\nWIP: Switch to craft menu\n");
	                    selectMenu = "main";
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
