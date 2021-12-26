package combat;

import character.Warrior;
import character.Wizard;
import character.BattleMage;
import character.Ranger;
import character.User;
import java.util.*;

public class DamageCalculation {
	
	public static double diceRoll6() {
		Random rand = new Random(); 
		double diceRoll6 = rand.nextInt(6)+1;
		System.out.println("Rolling the dice "+diceRoll6);
		if(diceRoll6 == 1)
			diceRoll6 = 0.5;
		else if (diceRoll6 == 2 || diceRoll6 == 3 || diceRoll6 == 4)
			diceRoll6 = 1;
		else if (diceRoll6 == 5)
			diceRoll6 = 1.5;
		else
			diceRoll6 = 2;
		return diceRoll6;
	}
	public static int diceRoll100() {
		Random rand = new Random();
		return rand.nextInt(101);
	}
	
	public static void calculatePhysicalDamage(User player, Enemy enemy) { //this will be used in loop
		double diceMultiplier = diceRoll6();
		int dodgeRoll = diceRoll100();
		int blockRoll = diceRoll100(); 
		double trueDamage;
		if((dodgeRoll - enemy.dodgeChance)<0 || blockRoll - enemy.blockRate<0)
			trueDamage = 0;
		else 
			trueDamage = player.physicalDamage * (1-(enemy.armor/100))*diceMultiplier; 
			
		System.out.println("You've dealt "+trueDamage +" damage.");
		enemy.hitPoints = enemy.hitPoints - trueDamage;
			
		
		 
	}
	public static void calculateDamageTaken(User player, Enemy enemy) {//this will be used in loop
		
		double diceMultiplier = diceRoll6();
		int dodgeRoll = diceRoll100();
		int blockRoll = diceRoll100();
		double trueDamage;
		if((dodgeRoll - player.dodgeChance)<0) {
			System.out.println("You dodged the attack");
			trueDamage = 0;
		}
		else if(blockRoll - player.blockRate<0) {
			System.out.println("You blocked the attack");
			trueDamage = 0;
		}
			
		else 
			trueDamage = enemy.attackDamage * (1-(player.armor/100))*diceMultiplier; 
			
		System.out.println(enemy.name+" dealt "+trueDamage +" damage to you.");
		player.hitPoints = player.hitPoints - trueDamage;
				 
	
	}
	public static void defend(User player, Enemy enemy) {
		System.out.println("You now take %75 reduced damage on next round");
		double diceMultiplier = diceRoll6();
		int dodgeRoll = diceRoll100();
		int blockRoll = diceRoll100();
		double trueDamage;
		if((dodgeRoll - player.dodgeChance)<0) {
			System.out.println("You dodged the attack");
			trueDamage = 0;
		}
		else if(blockRoll - player.blockRate<0) {
			System.out.println("You blocked the attack");
			trueDamage = 0;
		}
			
		else 
			trueDamage = 0.25*(enemy.attackDamage * (1-(player.armor/100))*diceMultiplier); 
			
		System.out.println(enemy.name+" dealt "+trueDamage +" damage to you.");
		player.hitPoints = player.hitPoints - trueDamage;
				 
		
	}
	
	

}
