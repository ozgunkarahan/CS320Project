package character.classes;

import character.User;

public class BattleMage extends User {

    public BattleMage (String nickname) {
    	this.hitPoints = 100;
    	this.maxHitPoints = 100;
    	this.magicRate = 12;
    	this.armor = 15;
    	this.blockRate = 10;
    	this.className = "BattleMage";
    	this.physicalDamage = 11;
    	this.dodgeChance = 5;
    	this.nickname = nickname;
		this.spellArray[0]="Absolution";
		this.cooldownArray[0]=0;
		this.spellArray[1]="Smite";
		this.cooldownArray[1]=0;
    }
}