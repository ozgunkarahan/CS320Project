package character;
import java.util.ArrayList;
import java.lang.String;

public class Wizard extends User {
    ArrayList<String> spellListWizard;
    public int cooldown;
    
    public Wizard(String nickname){
    	this.nickname=nickname;
        this.className="Wizard";
        this.hitPoints = 80;
        this.physicalDamage= 0;
        this.magicRate= 20;
        this.blockRate= 0;        
        this.dodgeChance= 0;
        this.maxHitPoints = 80;
        this.cooldown = 0;
        this.cooldownArray[0] = 0;
        this.spellArray[0]="Fireball";

}

    public void setclassWizard(){
        
    }
}
