package character;
import java.lang.String;
import java.util.ArrayList;


public class BattleMage extends User {
    ArrayList<String> spellListBattleMage;
   
    public BattleMage(String name,String classname){
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
    public BattleMage() {
        super(100, 10, 0, 20,0);
        this.className = "BattleMage";

    }
     public void setclassBattleMage(){
        
    }
}