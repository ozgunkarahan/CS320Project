package character;
import java.lang.String;
import java.util.ArrayList;

public class User  {
    private String nickname;
    double hitPoints;
    double physicalDamage;
    double magicRate;
    double blockRate;
    double dodgeChance;
    double cooldown;
    ArrayList<String> inventory; 
    String className;
    Stats statistics;
    public User(String name,String className){
       this.nickname=name;
       this.className=className;
       double hitPoints;
       double physicalDamage;
       double magicRate;
       double blockRate;        
       double dodgeChance;   
       double cooldown;
       ArrayList<String> inventory;
       this.statistics= new Stats();
    }
    public User(){}
    public String GetNickname(){
        return this.nickname;
    }
    public String setNickname(String name){
        this.nickname=name;
        return nickname;
    }
    public Stats Getstats(){
        return this.statistics;
    }
    public String getClass_name(){
        return this.className;
    }
    public void DeleteClass(String s){ // object mi yoksa string mi silecek?
        
    }
    public void createUser(){// main de olması daha mantıklı olablir
        
    }       
}
