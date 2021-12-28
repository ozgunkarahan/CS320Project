package character.classes;

import character.User;

import java.util.ArrayList;

public class Ranger extends User {

	ArrayList<String> spellListRanger;

	public Ranger(String nickname) {
		this.hitPoints = 100;
		this.maxHitPoints = 100;
		this.magicRate = 0;
		this.armor = 0;
		this.blockRate = 10;
		this.dodgeChance = 10;
		this.className = "Warrior";
		this.physicalDamage = 10;
		this.nickname = nickname;
   }
}