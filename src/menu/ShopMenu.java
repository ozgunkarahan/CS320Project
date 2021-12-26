package menu;

import java.util.Scanner;

public class ShopMenu {
	
	public static void Shop() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Sword piece: 10$");
		System.out.println("2 - Armor piece: 10$"); 
		System.out.println("3 - Shield piece: 10$"); 
		System.out.println("4 - Staff piece: 10$");
		System.out.println("Pick an inventory to buy: ");
		int choice = scanner.nextInt();
		
		/*if (choice == 1 ) {
			if(player.currency >= 10) {
				inventory.add(inventory[0]);
				player.currency = player.currency - 10;
				
			}else {
				System.out.println("You don't have enough currency.");
			}
		if (choice == 2 ) {
			if(player.currency >= 10) {
			    inventory.add(inventory[1]);
			    player.currency = player.currency - 10;
					
			}else {
				System.out.println("You don't have enough currency.");
			}
		}
		if (choice == 3 ) {
			if(player.currency >= 10) {
				inventory.add(inventory[2]);
				player.currency = player.currency - 10;
					
			}else {
				System.out.println("You don't have enough currency.");
			}
		}
		if (choice == 4 ) {
			if(player.currency >= 10) {
				inventory.add(inventory[3]);
				player.currency = player.currency - 10;
					
			}else {
				System.out.println("You don't have enough currency.");
			}
		}
		}else {
			System.out.println("Pick a valid number.");
		}*/
		
	}

}
		
