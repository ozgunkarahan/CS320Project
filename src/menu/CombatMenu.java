package menu;

import java.util.Scanner;

import character.User;
import combat.DamageCalculation;
import combat.Enemy;

public class CombatMenu {

   
	public static void CombatMenu(User player) {
		Scanner scanner =new Scanner(System.in);
    	Enemy enemy = new Enemy(100,10);
        System.out.println("\nWIP: Combat Menu");
        String select = "main";
        DamageCalculation dmgCal = new DamageCalculation();
        boolean combatActive = true;
        boolean playerTurn = true;
        boolean enemyAlive = true;
        boolean playerAlive = true;
        boolean flee = false;
        //int playerHP = 100; // temporary HP for player
        //int enemyHP = 100; // temporary HP for enemy
        while (combatActive) {
            
            while (playerTurn) {
            	
                switch (select.toLowerCase()) {
                case "main" -> {
                    System.out.println("WIP: Display main menu and selections etc.");
                    System.out.print("WIP: Select an option: ");
                    select = scanner.nextLine();
                }
                    case "attack" -> {
                        System.out.println("WIP: Basic attack");
                        dmgCal.calculatePhysicalDamage(player, enemy);
                        select = "main";
                        playerTurn = false;
                        System.out.println("-----------------" +enemy.hitPoints);
                    }
                    case "spell" -> {
                        System.out.println("\nWIP: Use spell\n");
                        select = "main";
                        playerTurn = false;
                    }
                    case "item" -> {
                        System.out.println("\nWIP: Use item\n");
                        select = "main";
                        playerTurn = false;
                    }
                    case "defend" -> {
                        System.out.println("\nWIP: Use defend\n");
                        dmgCal.defend(player, enemy);
                        select = "main";
                        playerTurn = false;
                    }
                    case "flee" -> {
                        System.out.println("\nWIP: Flee combat\n");
                        flee = true;
                    }
                    default -> {
                        System.out.println("Invalid input!\n");
                        select = "main";
                    }
                }
                if (enemy.hitPoints <= 0) enemyAlive = false;
            }
            if (flee) combatActive = false;

            // Enemy turn
            else if (enemyAlive) {
                dmgCal.calculateDamageTaken(player,enemy);
                if (player.hitPoints <= 0) playerAlive = false;
            }
            else {
            	System.out.println("WIP: Player won. (rewards need to be added)");
            	combatActive = false;
            }

            if (playerAlive) playerTurn = true;

            else {
                // WIP Game over
                System.out.println("WIP: Player lost. (returning to main menu for now)");
                combatActive = false;
            }
        }
        System.out.println("WIP: Combat ended. Returning to main menu.");
    }
}