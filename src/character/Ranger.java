package character;
import java.util.ArrayList;
import java.lang.String;

public class Ranger extends User {
   ArrayList<String> spellListRanger;
   public Ranger(String nickname) {
   	this.hitPoints = 100;
   	this.maxHitPoints = 100;
   	this.magicRate = 0;
   	this.armor = 0;
   	this.dodgeChance = 10;
   	this.className = "Warrior";
   	this.physicalDamage = 10;
   	this.nickname = nickname;
   	
   }
     public void setclassRanger(){
        
    }
}
