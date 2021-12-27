package combat;

import character.Warrior;
import character.Wizard;
import character.BattleMage;
import character.Ranger;
import character.User;
import java.util.*;

public class DamageCalculation {
	
	public static double diceRoll6(String name) {
		Random rand = new Random(); 
		double diceRoll6 = rand.nextInt(6)+1;
		System.out.println(name +" rolling the dice "+diceRoll6);
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
		double diceMultiplier = diceRoll6(player.getNickname());
		int dodgeRoll = diceRoll100();
		int blockRoll = diceRoll100(); 
		double trueDamage;
		if((dodgeRoll - enemy.dodgeChance)<0 || blockRoll - enemy.blockRate<0) {
			trueDamage = 0;
			System.out.println("Enemy recieved no damage");
		}
			
		else 
			trueDamage = player.physicalDamage * (1-(enemy.armor/100))*diceMultiplier; 
			
		System.out.println("You've dealt "+trueDamage +" damage.");
		enemy.hitPoints = enemy.hitPoints - trueDamage;
			
		
		 
	}
	public static void calculateDamageTaken(User player, Enemy enemy) {//this will be used in loop
		
		double diceMultiplier = diceRoll6(enemy.name);
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
		double diceMultiplier = diceRoll6(enemy.name);
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
	public static String getSpellIndex(User player) {
		Scanner scan = new Scanner(System.in);
		player.showSpells();
		String choice;
		while(true) {
			
			System.out.println("Select which skill you want to use");
			choice = scan.nextLine();
			if(choice.equals("1")||choice.equals("2"))
				break;
			else
				System.out.println("Enter a valid option");
			

			
		}
		return choice;
	}
	public static boolean useSpell(User player,  Enemy enemy) {
		String index = getSpellIndex(player);
		int realIndex = Integer.parseInt(index)-1;
		if(player.cooldownArray[realIndex]<=0) {
			System.out.println("You've used "+player.spellArray[realIndex]);
			calculateSpellDamage(player, enemy,realIndex);
			player.cooldownArray[realIndex]= player.cooldownArray[realIndex]+3;
			
			
			
			return false;
		}
		else {
			System.out.println(player.spellArray[realIndex] +" is on cooldown for "+player.cooldownArray[realIndex]+" rounds.");
			return true;
		}
			
		
		
	}
	public static void calculateSpellDamage(User player, Enemy enemy, int realIndex) {
		double diceMultiplier = diceRoll6(player.getNickname());
		int dodgeRoll = diceRoll100();
		int blockRoll = diceRoll100(); 
		double trueDamage;
		if(dodgeRoll-enemy.dodgeChance>0) {
			trueDamage = calculateSpellMult(player,realIndex)*diceMultiplier*(1-(enemy.magicResist/100))*player.magicRate;
			enemy.hitPoints = enemy.hitPoints - trueDamage;
			System.out.println("You've dealt "+trueDamage + "damage to "+enemy.name);
			
		}
			
			
		else
			System.out.println("Enemy dodged the "+player.spellArray[realIndex]);
	}
	
	public static double calculateSpellMult(User player,int index) {
		double mult = 1;
		if(player.spellArray[index].equals("Riposte"))
			mult = 1.2;
		else if(player.spellArray[index].equals("Slash"))
			mult = 1.1;
		else if(player.spellArray[index].equals("Fireball"))
			mult=1.5;
		else if(player.spellArray[index].equals("Frostbite"))
			mult=1.1;
		return mult;

	}
	
}
