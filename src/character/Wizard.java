package character;
import java.util.ArrayList;
import java.lang.String;

public class Wizard extends User {
    ArrayList<String> spellListWizard;
    
    public Wizard(String name,String classname){
    super(name,classname);
    double hitPoints=10;
    double physicalDamage=10;
    double magicRate=10;
    double blockRate=10;        
    double dodgeChance=10;   
    double cooldown=10;
    ArrayList<String> inventory;
    ArrayList<String> spellListBattleMage;
}
    public Wizard() {
        super(100, 10, 0, 20,0);
        this.className = "Wizard";

    }
    public void setclassWizard(){
        
    }
}
