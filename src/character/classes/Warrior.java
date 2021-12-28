package character.classes;

import character.User;

import java.util.ArrayList;

public class Warrior extends User {

    ArrayList<String> spellListWarrior;

    public Warrior(String nickname) {
    	this.hitPoints = 100;
    	this.maxHitPoints = 100;
    	this.magicRate = 5;
    	this.armor = 10;
    	this.blockRate = 10;
    	this.className = "Warrior";
    	this.physicalDamage = 10;
    	this.nickname = nickname;
    	this.spellArray[0]="Slash";
    	this.cooldownArray[0]=0;
    	this.spellArray[1]="Riposte";
    	this.cooldownArray[1]=0;
    }
}