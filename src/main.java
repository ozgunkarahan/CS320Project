import character.*;

public class main {

    public static void main(String[] args) {

        User player;
        String[] playerData;

        playerData = menu.Menu.startGame();

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
    

