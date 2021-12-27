package character;
import java.util.ArrayList;
import java.lang.String;

public class Warrior extends User {
    ArrayList<String> spellListWarrior;

    public Warrior(String nickname) {
    	this.hitPoints = 100;
    	this.maxHitPoints = 100;
    	this.magicRate = 0;
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
     public void setclassWarrior() {
    	 
    }
}
