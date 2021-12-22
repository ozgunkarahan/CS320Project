package character;
import java.lang.String;
import java.util.ArrayList;

public class User extends Stats  {
    String nickname;
    public  double hitPoints;
    public double maxHitPoints;
    public double physicalDamage;
    public double magicRate;// magic damage
    public double blockRate;
    public double dodgeChance;
    public int armor;
    public int magicResist;
    public ArrayList<String> inventory; 
    public String className;
    public Stats statistics;

    
    public User(String name,String className){
       this.nickname=name;
       this.className=className;
       double hitPoints;
       double physicalDamage;
       double magicRate;
       double blockRate;        
       double dodgeChance;
       ArrayList<String> inventory;
       this.statistics= new Stats();
    }
    public User(double hp, double pd, double md, double br, double dc){
    	this.hitPoints = hp;
    	this.physicalDamage = pd;
    	this.magicRate = md;
    	this.blockRate = br;
    	this.dodgeChance = dc;
        ArrayList<String> inventory;
        this.statistics= new Stats();
     }
    
    public User(){
    	
    }
    public String getNickname(){
        return this.nickname;
    }
    public String setNickname(String name){
        this.nickname=name;
        return nickname;
    }
    public String setClass(String name){
        this.className=name;
        return className;
    }
    public Stats getStats(){
        return this.statistics;
    }
    public String getClass_name(){
        return this.className;
    }
    public void deleteClass(String s){ // object mi yoksa string mi silecek?
        
    }
    public void createUser(){// main de olması daha mantıklı olablir
        
    }
    public void print() {
    	System.out.println("Hp: "+this.hitPoints+" PD: "+this.physicalDamage);
    }
}
