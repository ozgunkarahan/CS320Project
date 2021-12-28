package combat.enemies;

import character.User;
import combat.Enemy;

public class Centaur  extends Enemy {

	public Centaur(User player) {

		this.attackDamage = 11;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Centaur";
		this.blockRate = 10;
		this.dodgeChance = 0;
		this.armor = 0;
		this.hitPoints = 60;
		this.magicResist = 15;
	}
}