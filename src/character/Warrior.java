package character;
import java.util.ArrayList;
import java.lang.String;

public class Warrior extends User {
    ArrayList<String> spellListWarrior;
    public Warrior(String name,String classname){
    super(name,classname);
    double hitPoints;
    double physicalDamage;
    double magicRate;
    double blockRate;        
    double dodgeChance;   
    double cooldown;
    ArrayList<String> inventory;
    ArrayList<String> spellListBattleMage;
}  
    public Warrior() {
    	super(100, 10, 0, 20,0);
    	this.className = "Warrior";
    	
    }
     public void setclassWarrior(){
        
    }
}
