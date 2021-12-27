/*
CS320 Project - Path of Adventurer
Ozgun Karahan, Mert Tan, Nursen Yildirim, Anil Uzel
 */

import character.*;

public class main {

    public static void main(String[] args) {

        User player;
        String[] playerData;

        playerData = menu.Menu.startGame();

        // Creates a player class object based on the class chosen by the user
        player = switch (playerData[0]) {
            case "warrior" -> new Warrior(playerData[1]);
            case "wizard" -> new Wizard(playerData[1]);
            case "ranger" -> new Ranger(playerData[1]);
            case "battlemage" -> new BattleMage(playerData[1]);
            default -> null;
        };

        menu.Menu.mainMenu(player);
    }
}
    

