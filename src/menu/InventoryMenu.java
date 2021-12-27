package menu;

import java.util.Scanner;

import character.User;

public class InventoryMenu {//will be used in main menu and combatmenu will contain healing potions

	
	
	public static void inventoryMenu(User player) {
		showInventoryMenu(player);
		int index =getIndex();
		checkIndexAndUsePotion(player,index);
		
	}
	public static void showInventoryMenu(User player) {
		System.out.println("1. Small Health Potion | amount: "+player.inventory[4]);
		System.out.println("2. Medium Health Potion| amount: "+player.inventory[5]);
		System.out.println("3. Large Health Potion | amount: "+player.inventory[6]);
	}
	
	
	public static int getIndex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose what you want to use" );
		int selection;
		while(true) {
			selection = scan.nextInt();
			if(selection == 1 || selection == 2 || selection ==3) {
				break;
				
			}
			else {
				System.out.println("Invalid choice type again");
			}
			
		}
		return selection;
	}
	
	public static void checkIndexAndUsePotion(User player, int index) {
		if(player.inventory[index+3]>0) {
			if(index==1) {
				player.hitPoints = player.hitPoints+25;
				player.inventory[index+3]--;
				System.out.println("Used small health potion");
				
			}
			else if(index==2) {
				player.hitPoints = player.hitPoints+50;
				player.inventory[index+3]--;
				System.out.println("Used medium health potion");
			}
			else {
				player.hitPoints = player.maxHitPoints;
				player.inventory[index+3]--;
				System.out.println("Used large health potion, healed to full hp");
				
			}
		
			
		}
		else
			System.out.println("You don't have enough potions");
		
		
		
	}
}
