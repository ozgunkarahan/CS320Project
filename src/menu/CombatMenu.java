package menu;

import character.User;
import combat.*;
import combat.enemies.Boss;

import java.util.Scanner;

public class CombatMenu {

	public static void CombatMenu(User player) {

		Scanner scanner =new Scanner(System.in);
        Enemy enemy = null;
        if (player.getLevel() == 6) {
            enemy = new Boss(player);
        }
        else enemy = EnemyGeneration.generateEnemy(player);

    	enemy.printEnemy();

        System.out.println("\nWIP: Combat Menu");
        String select = "main";
        DamageCalculation dmgCal = new DamageCalculation();
        boolean combatActive = true;
        boolean playerTurn = true;
        boolean enemyAlive = true;
        boolean playerAlive = true;
        boolean flee = false;

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
                        DamageCalculation.calculatePhysicalDamage(player, enemy);
                        //DamageCalculation.calculateDamageTaken(player, enemy);
                        select = "main";
                        playerTurn = false;
                        enemy.printEnemy();
                    }
                    case "spell" -> {
                        System.out.println("\nWIP: Use spell\n");
                        
                        select = "main";
                        playerTurn =DamageCalculation.useSpell(player,enemy);
                        enemy.printEnemy();
                    }
                    case "item" -> {
                        System.out.println("\nWIP: Use item\n");
                        CharacterMenu.characterMenu(player);
                        
                        select = "main";
                        playerTurn = false;
                        enemy.printEnemy();
                    }
                    case "defend" -> {
                        System.out.println("\nWIP: Use defend\n");
                        dmgCal.defend(player, enemy);
                        select = "main";
                        playerTurn = true;
                        enemy.printEnemy();
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
                DamageCalculation.calculateDamageTaken(player,enemy);
                player.print();
                for(int i = 0; i<3;i++) {
                	if(player.cooldownArray[i]<=0) {
                		player.cooldownArray[i]=0;
                	}
                	else
                		player.cooldownArray[i]--;
                }
                if (player.hitPoints <= 0) playerAlive = false;
            }
            else {
            	System.out.println("WIP: Player won. (rewards need to be added)");
            	combatActive = false;
            	player.updateStats(enemy);
            	player.InventoryReward(enemy);
            	player.showStats();
            }

            if (playerAlive) playerTurn = true;

            else {
                // WIP Game over
                System.out.println("WIP: Player lost. (returning to main menu for now)");
                System.exit(0);
                combatActive = false;
            }
        }
        if (enemy.isBoss == false) System.out.println("WIP: Combat ended. Returning to main menu.");
        else {
            System.out.println("You have beaten the game!");
            System.exit(0);
        }
    }
}