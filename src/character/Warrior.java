package character;
import java.util.ArrayList;
import java.lang.String;

public class Warrior extends User {
    ArrayList<String> spellListWarrior;
    public Warrior(String name,String classname){
}  
    public Warrior() {
    	this.hitPoints = 100;
    	this.maxHitPoints = 100;
    	this.magicRate = 0;
    	this.armor = 10;
    	this.blockRate = 10;
    	this.className = "Warrior";
    	this.physicalDamage = 10;
    	
    }
     public void setclassWarrior(String nickname){
    	 this.nickname = nickname;
       
    }
}
