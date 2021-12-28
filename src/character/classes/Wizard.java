package character.classes;

import character.User;

public class Wizard extends User {

    public Wizard(String nickname){
    	this.nickname=nickname;
        this.className="Wizard";
        this.hitPoints = 85;
        this.armor = 0;
        this.physicalDamage= 7;
        this.magicRate= 15;
        this.blockRate= 0;        
        this.dodgeChance= 0;
        this.maxHitPoints = 85;
        this.cooldownArray[0] = 0;
        this.spellArray[0]="Fireball";
        this.spellArray[1]="Frostbite";
        this.cooldownArray[1] = 0;
    }
}