package combat.enemies;

import character.User;
import combat.Enemy;

public class Ogre extends Enemy {
	
	public Ogre(User player) {

		this.attackDamage = 10;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Ogre";
		this.blockRate = 0;
		this.dodgeChance = 0;
		this.armor = 15;
		this.hitPoints = 55;
		this.magicResist = 5;
	}
}