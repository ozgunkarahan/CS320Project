package combat.enemies;

import character.User;
import combat.Enemy;

public class Minotaur extends Enemy {

	public Minotaur(User player) {

		this.attackDamage = 12;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Minotaur";
		this.blockRate = 0;
		this.dodgeChance = 0;
		this.armor = 15;
		this.hitPoints = 65;
		this.magicResist = 0;
	}
}