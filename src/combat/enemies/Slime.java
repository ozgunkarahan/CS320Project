package combat.enemies;

import character.User;
import combat.Enemy;

public class Slime extends Enemy {

	public Slime(User player) {

		this.attackDamage = 5;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Slime";
		this.blockRate = 0;
		this.dodgeChance = 20;
		this.armor = 0;
		this.hitPoints = 30;
		this.magicResist = 25;
	}
}