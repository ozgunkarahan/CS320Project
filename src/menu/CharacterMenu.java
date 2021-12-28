package menu;

import character.User;
import java.util.Scanner;

public class CharacterMenu {

	public static void characterMenu(User player) {
		showCharacterMenu(player);
		int index = getIndex();
		checkIndexAndUsePotion(player, index);
	}

	public static void showCharacterMenu(User player) {
		System.out.println("1. Small Health Potion | amount: "+player.inventory[4]);
		System.out.println("2. Medium Health Potion| amount: "+player.inventory[5]);
		System.out.println("3. Large Health Potion | amount: "+player.inventory[6]);
	}

	public static int getIndex() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose which item you want to use: ");
		int selection;
		while(true) {
			selection = scan.nextInt();
			if(selection == 1 || selection == 2 || selection ==3) {
				break;
			}
			else System.out.println("Invalid choice type again.");
		}
		return selection;
	}
	
	public static void checkIndexAndUsePotion(User player, int index) {
		if(player.inventory[index+3]>0) {
			if(index==1) {
				player.hitPoints = player.hitPoints+25;
				if(player.hitPoints>player.maxHitPoints)
					player.hitPoints = player.maxHitPoints;
				player.inventory[index+3]--;
				System.out.println("Used small health potion.");
			}
			else if(index==2) {
				player.hitPoints = player.hitPoints+50;
				if(player.hitPoints>player.maxHitPoints);
					player.hitPoints = player.maxHitPoints;
				player.inventory[index+3]--;
				System.out.println("Used medium health potion.");
			}
			else {
				player.hitPoints = player.maxHitPoints;
				player.inventory[index+3]--;
				System.out.println("Used large health potion, healed to full HP.");
			}
		}
		else System.out.println("You don't have enough potions!");
	}
}