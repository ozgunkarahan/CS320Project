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
    public int[] inventory = new int[4];
    //inventory[0] sword piece
    //inventory[1] armor piece
    //inventory[2] shield piece
    //inventory[3] staff piece
    public String className;
    public Stats statistics;

    
    public User(String name,String className){
       this.nickname=name;
       this.className=className;
       this.hitPoints = 0;
       this.physicalDamage= 0;
       this.magicRate= 0;
       this.blockRate= 0;        
       this.dodgeChance= 0;
       this.maxHitPoints = 0;
       //ArrayList<Integer> inventory = new ArrayList<Integer>(); 
       this.statistics= new Stats();
    }
    public User(double hitPoints, double pDamage, double mDamage, double bRate, double dChance, int armor ){
    	this.hitPoints = hitPoints;
    	this.physicalDamage = pDamage;
    	this.magicRate = mDamage;
    	this.blockRate = bRate;
    	this.dodgeChance = dChance;
    	//ArrayList<Integer> inventory = new ArrayList<Integer>(); 
        this.statistics= new Stats();
        this.armor = armor;
       
     }
    public void showInventory() {
    	System.out.println(this.inventory[0] +" sword piece");
		System.out.println(this.inventory[1] +" armor piece");
		System.out.println(this.inventory[2] +" shield piece");
		System.out.println(this.inventory[3] +" staff piece");
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
    public void deleteClass(User s){
    	// object mi yoksa string mi silecek?
        s = null;
    }
    public void createUser(){// main de olması daha mantıklı olablir
        
    }
    public void print() {
    	System.out.println("Your class : "+this.className);
    	System.out.println("Your hp : "+ this.hitPoints +"\n"+ "Your physical damage: "+this.physicalDamage+"\n"+ "Your magical damage : "+this.magicRate+"\n"+
    	"Block rate : %"+this.blockRate + " Armor: "+this.armor + "\n"+"Dodge chance: %"+this.dodgeChance);
    }
}
