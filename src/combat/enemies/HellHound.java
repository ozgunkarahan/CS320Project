package combat.enemies;

import character.User;
import combat.Enemy;

public class HellHound extends Enemy {

	public HellHound(User player) {

		this.attackDamage = 9;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Hell Hound";
		this.blockRate = 20;
		this.dodgeChance = 15;
		this.armor = 0;
		this.hitPoints = 50;
		this.magicResist = 0;
	}
}