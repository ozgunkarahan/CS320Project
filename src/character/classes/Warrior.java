package character.classes;

import character.User;

public class Warrior extends User {

    public Warrior(String nickname) {
    	this.hitPoints = 150;
    	this.maxHitPoints = 150;
    	this.magicRate = 10;
    	this.armor = 25;
    	this.blockRate = 15;
		this.dodgeChance = 0;
    	this.className = "Warrior";
    	this.physicalDamage = 10;
    	this.nickname = nickname;
    	this.spellArray[0]="Slash";
    	this.cooldownArray[0]=0;
    	this.spellArray[1]="Riposte";
    	this.cooldownArray[1]=0;
    }
}