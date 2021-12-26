package menu;

import character.User;
import combat.Enemy;
import combat.DamageCalculation;

public class CombatMenu {

    public static void CombatMenu(User player, Enemy enemy) {

        System.out.println("\nWIP: Combat Menu");
        String select = "main";
        DamageCalculation dmgCal = new DamageCalculation();
        boolean combatActive = true;
        boolean playerTurn = true;
        boolean enemyAlive = true;
        boolean playerAlive = true;
        boolean flee = false;
        int playerHP = 100; // temporary HP for player
        int enemyHP = 100; // temporary HP for enemy
        while (combatActive) {
            // Player turn
            while (playerTurn) {
                switch (select.toLowerCase()) {
                    case "attack" -> {
                        System.out.println("WIP: Basic attack");
                        dmgCal.calculatePhysicalDamage(player, enemy);
                        select = "main";
                        playerTurn = false;
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
                if (enemyHP <= 0) enemyAlive = false;
            }
            if (flee) combatActive = false;

            // Enemy turn
            else if (enemyAlive) {
                dmgCal.calculateDamageTaken(player,enemy);
                if (playerHP <= 0) playerAlive = false;
            }
            else System.out.println("WIP: Player won. (rewards need to be added)");

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