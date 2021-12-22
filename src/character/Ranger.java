package character;
import java.util.ArrayList;
import java.lang.String;

public class Ranger extends User {
   ArrayList<String> spellListRanger;
    public Ranger(String name,String classname){
    super(name,classname);
    double hitPoints;
    double physicalDamage;
    double magicRate;
    double blockRate;        
    double dodgeChance;   
    double cooldown;
    ArrayList<String> inventory;
    ArrayList<String> spellListRanger;
}
    public Ranger() {
        super(100, 10, 0, 20,0);
        this.className = "Ranger";

    }
     public void setclassRanger(){
        
    }
}
