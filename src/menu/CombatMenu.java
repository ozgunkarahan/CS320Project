package menu;

import character.User;
import combat.*;
import combat.enemies.Boss;

import java.util.Random;
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
                    System.out.print("""
       
							COMBAT MENU
							Available commands: Attack, Spell, Item, Defend, Flee
							Please enter a command:\s""");
                    select = scanner.nextLine();
                }
                    case "attack" -> {
                        System.out.println("Using Basic attack.\n");
                        DamageCalculation.calculatePhysicalDamage(player, enemy);
                        //DamageCalculation.calculateDamageTaken(player, enemy);
                        select = "main";
                        playerTurn = false;
                        enemy.printEnemy();
                    }
                    case "spell" -> {
                        select = "main";
                        playerTurn = DamageCalculation.useSpell(player,enemy);
                        enemy.printEnemy();
                    }
                    case "item" -> {
                        CharacterMenu.characterMenu(player);
                        select = "main";
                        playerTurn = false;
                        enemy.printEnemy();
                    }
                    case "defend" -> {
                        System.out.println("Using defend.\n");
                        dmgCal.defend(player, enemy);
                        select = "main";
                        playerTurn = true;
                        enemy.printEnemy();
                    }
                    case "flee" -> {
                        Random rand = new Random();
                        int fleeRoll = rand.nextInt(101);
                        if (fleeRoll <= 25) {
                            System.out.println("Flee failed.\n");
                            playerTurn = false;
                            select = "main";
                        }
                        else {
                            System.out.println("Flee successful.\n");
                            playerTurn = false;
                            flee = true;
                        }
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
            	System.out.println("You won!");
            	combatActive = false;
            	player.updateStats(enemy);
            	player.InventoryReward(enemy);
            	player.showStats();
            }

            if (playerAlive) playerTurn = true;

            else {
                System.out.println("You lost! The game will end and your character's final statistics will be displayed.");
                player.showStats();
                System.exit(0);
                combatActive = false;
            }
        }
        if (enemy.isBoss == false) System.out.println("Combat ended. Returning to main menu.");
        else {
            System.out.println("Congrats! You have beaten the game.");
            player.showStats();
            System.exit(0);
        }
    }
}