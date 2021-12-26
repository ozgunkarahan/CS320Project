package character;
import java.lang.String;
import java.util.ArrayList;


public class BattleMage extends User {
    ArrayList<String> spellListBattleMage;
   
    public BattleMage (String nickname) {
    	this.hitPoints = 100;
    	this.maxHitPoints = 100;
    	this.magicRate = 10;
    	this.armor = 10;
    	this.blockRate = 10;
    	this.className = "BattleMage";
    	this.physicalDamage = 10;
    	this.dodgeChance = 10;
    	this.nickname = nickname;
    	
    }
     public void setclassBattleMage(){
        
    }
}
