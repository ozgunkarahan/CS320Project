package combat.enemies;

import character.User;
import combat.Enemy;

public class HellHound extends Enemy {

	public HellHound(User player) {

		this.attackDamage = 5;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Hell Hound";
		this.blockRate = 10;
		this.dodgeChance = 0;
		this.armor = 10;
		this.hitPoints = 50;
		this.magicResist = 10;
	}
}