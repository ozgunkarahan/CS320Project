package combat.enemies;

import character.User;
import combat.Enemy;

public class Harpy extends Enemy {

	public Harpy(User player) {

		this.attackDamage = 6;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Harpy";
		this.blockRate = 0;
		this.dodgeChance = 35;
		this.armor = 0;
		this.hitPoints = 25;
		this.magicResist = 35;
	}
}