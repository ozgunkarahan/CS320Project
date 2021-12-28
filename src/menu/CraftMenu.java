package menu;

import character.User;
import java.util.Scanner;

public class CraftMenu {
	
	public static boolean checkMaterials(User player, int index) {

		if(player.inventory[index] >=4) return true;
		else {
			System.out.println("You don't have enough materials!");
			return false;
		}
	}

	public static String getCraftInput(User player) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Crafting menu in order to craft an item you have to "
				+ "combine 4 pieces. You have: ");
		player.showInventory();
		System.out.println("Type what you want to combine (Type sword for combining sword pieces)");
		String input = null;

		boolean check = true;
		while(check) {
			input = scan.nextLine().toLowerCase();
			if(input.equals("sword")  ||input.equals("armor")||input.equals("shield")||input.equals("staff")) break;
			else
				System.out.println("You've typed invalid option try again");
		}
		return input;
	}

	public static void Craft(User player) {
		String craftString = getCraftInput(player);
		if(craftString.equals("sword")) {
			boolean mats = checkMaterials(player, 0);
			if(mats==true) {
				System.out.println("You've crafted sword gained +5 physical damage" );
				player.physicalDamage = player.physicalDamage + 5;
				player.inventory[0]=player.inventory[0]-4;
			}
		}
		else if(craftString.equals("armor")) {
			boolean mats = checkMaterials(player, 1);
			if(mats==true) {
				System.out.println("You've crafted armor gained +5 armor" );
				player.armor = player.armor + 5;
				player.inventory[1]=player.inventory[1]-4;
			}
		}
		else if(craftString.equals("shield")) {
			boolean mats = checkMaterials(player, 1);
			if(mats==true) {
				System.out.println("You've crafted shield gained +5 block rating" );
				player.armor = player.armor + 5;
				player.inventory[2]=player.inventory[2]-4;
			}
		}
		else if(craftString.equals("staff")) {
			boolean mats = checkMaterials(player, 1);
			if(mats==true) {
				System.out.println("You've crafted shield gained +5 magic damage" );
				player.magicRate = player.magicRate + 5;
				player.inventory[3]=player.inventory[3]-4;
			}
		}
	}
}