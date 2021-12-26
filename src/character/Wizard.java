package character;
import java.util.ArrayList;
import java.lang.String;

public class Wizard extends User {
    ArrayList<String> spellListWizard;
    
    public Wizard(String nickname){
    	this.nickname=nickname;
        this.className="Wizard";
        this.hitPoints = 80;
        this.physicalDamage= 0;
        this.magicRate= 20;
        this.blockRate= 0;        
        this.dodgeChance= 0;
        this.maxHitPoints = 80;

}

    public void setclassWizard(){
        
    }
}
