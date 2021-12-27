package combat;

import character.User;

public class Slime extends Enemy {
	public Slime(User player) {
		this.attackDamage = 5;
		this.attackDamage = this.attackDamage+(this.attackDamage*player.getLevel()*1/10);
		this.name = "Slime";
		this.blockRate = 10;
		this.dodgeChance = 0;
		this.armor = 10;
		this.hitPoints = 50;
		this.magicResist = 10;
	}


}
