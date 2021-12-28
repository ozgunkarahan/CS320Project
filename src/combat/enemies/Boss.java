package combat.enemies;

import character.User;
import combat.Enemy;

public class Boss extends Enemy {

	public Boss(User player) {
		this.isBoss = true;
		this.attackDamage = 15;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Tarsus the First One";
		this.blockRate = 25;
		this.dodgeChance = 10;
		this.armor = 25;
		this.hitPoints = 100;
		this.magicResist = 15;
	}
}