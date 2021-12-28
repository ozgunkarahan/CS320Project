package combat.enemies;

import character.User;
import combat.Enemy;

public class Skeleton extends Enemy {

	public Skeleton(User player) {

		this.attackDamage = 7;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Skeleton";
		this.blockRate = 25;
		this.dodgeChance = 0;
		this.armor = 25;
		this.hitPoints = 45;
		this.magicResist = 0;
	}
}