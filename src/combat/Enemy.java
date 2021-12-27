package combat;

import character.User;

public class Enemy {
	public double hitPoints;
	public double attackDamage;
	public double blockRate;
	public double dodgeChance;
	public String name;
	public int armor;
	public int magicResist;
	public double playerLevelMultiplier;
	
	
	public double adjustAttackDamage(User player) {
		this.playerLevelMultiplier = this.attackDamage*(player.getLevel()*1/10);
		return this.attackDamage*this.playerLevelMultiplier;
	}
	
	public void printEnemy() {
		System.out.println("Enemy name: "+this.name+"\n"+" Remaining HP: "+this.hitPoints + "AD: "+this.attackDamage);
	}
	

}
