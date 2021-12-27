package combat;

import character.User;

public class Minotaur extends Enemy {
	public Minotaur(User player) {
		this.attackDamage = 5;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Minotaur";
		this.blockRate = 10;
		this.dodgeChance = 0;
		this.armor = 10;
		this.hitPoints = 50;
		this.magicResist = 10;
	}

}
