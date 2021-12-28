package character.classes;

import character.User;

public class Ranger extends User {

	public Ranger(String nickname) {
		this.hitPoints = 70;
		this.maxHitPoints = 70;
		this.magicRate = 13;
		this.armor = 0;
		this.blockRate = 0;
		this.dodgeChance = 30;
		this.className = "Ranger";
		this.physicalDamage = 13;
		this.nickname = nickname;
		this.spellArray[0]="Arrow Nova";
		this.cooldownArray[0]=0;
		this.spellArray[1]="Lightning Arrow";
		this.cooldownArray[1]=0;
   }
}