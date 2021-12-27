	package menu;
	
	import java.util.Scanner;

import character.User;
	
	public class ShopMenu {
		
		
		public static final int COST_OF_SWORD 	= 10; 
		public static final int COST_OF_ARMOR 	= 10; 
		public static final int COST_OF_SHIELD 	= 10; 
		public static final int COST_OF_STAFF 	= 10;
		public static final int COST_OF_SHP 	= 10;
		public static final int COST_OF_MHP 	= 10; 
		public static final int COST_OF_LHP 	= 10; 
		
		
		
		public static void Shop(User player) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("You have "+player.currency +"$");
			System.out.println("1 - Sword piece: "+COST_OF_SWORD+"$");
			System.out.println("2 - Armor piece: "+COST_OF_ARMOR+"$"); 
			System.out.println("3 - Shield piece: "+COST_OF_SHIELD+"$"); 
			System.out.println("4 - Staff piece: "+COST_OF_STAFF+"$");
			System.out.println("5 - Small health potion: "+COST_OF_SHP+"$");
			System.out.println("6 - Medium health potion: "+COST_OF_MHP+"$");
			System.out.println("7 - Large health potion: "+COST_OF_LHP+"$");
			System.out.println("Pick an item to buy: ");
			String choice = scanner.nextLine();
			
			boolean run = true;
	        while (run) {
	            switch (choice) {
	                case "1" -> {
	                    if (player.currency >= COST_OF_SWORD) {
	                    	player.inventory[0] = player.inventory[0]+1;
	                        player.currency = player.currency - COST_OF_SWORD;
	
	                    } else {
	                        System.out.println("You don't have enough currency.");
	                    }
	                    run = false;
	                }
	                case "2" -> {
	                    if (player.currency >= COST_OF_ARMOR) {
	                    	player.inventory[1] = player.inventory[1]+1;
	                        player.currency = player.currency - COST_OF_ARMOR;
	
	                    } else {
	                        System.out.println("You don't have enough currency.");
	                    }
	                    run = false;
	                }
	                case "3" -> {
	                    
	                        if (player.currency >= COST_OF_SHIELD) {
	                        	player.inventory[2] = player.inventory[2]+1;
	                            player.currency = player.currency - COST_OF_SHIELD;
	
	                        } else {
	                            System.out.println("You don't have enough currency.");
	                        }
	                    
	                    run = false;
	                }
	                case "4" -> {
	                    if(player.currency >= COST_OF_STAFF) {
	                    	player.inventory[3] = player.inventory[3]+1;
	                        player.currency = player.currency - COST_OF_STAFF;
	
	                    }else {
	                        System.out.println("You don't have enough currency.");
	                    }
	                    run = false;
	                }
	                case "5" -> {
	                    if(player.currency >= COST_OF_SHP) {
	                    	player.inventory[4] = player.inventory[4]+1;
	                        player.currency = player.currency - COST_OF_SHP;
	
	                    }else {
	                        System.out.println("You don't have enough currency.");
	                    }
	                    run = false;
	                }
	                case "6" -> {
	                    if(player.currency >= COST_OF_MHP) {
	                    	player.inventory[5] = player.inventory[5]+1;
	                        player.currency = player.currency - COST_OF_MHP;
	
	                    }else {
	                        System.out.println("You don't have enough currency.");
	                    }
	                    run = false;
	                }
	                case "7" -> {
	                    if(player.currency >= COST_OF_LHP) {
	                    	player.inventory[6] = player.inventory[6]+1;
	                        player.currency = player.currency - COST_OF_LHP;
	
	                    }else {
	                        System.out.println("You don't have enough currency.");
	                    }
	                    run = false;
	                }
	                default -> {
	                    System.out.println("Pick a valid number.");
	                    choice = scanner.nextLine();
	                }
	            }
	        }
			}
		
	
		
	}


		
