package character;
public class Stats {
    int level;
    double experience;
    double currency;
    double enemyDefeatCount;
    String className;
    public Stats(){
      
       this.level=1;
       this.experience=0;
       this.currency=0;
       this.enemyDefeatCount=0;
    }
    public void gainLevel(){
       this.level=level+1;
    }
    public void increaseEnemyDefeat(){
        this.enemyDefeatCount= enemyDefeatCount +1;
    }
    public void addCurrency(){
        
    }       
    public void removeCurrency(){
        
    }        
    public void gainExperience(){
        
    }
    public void showStats(){
        System.out.println("--------Example Stats Screen--------");
        System.out.println("Level :" + this.level +
                "\nExperience: " + this.experience +
                "\nCurrency: " + this.currency);
        System.out.println("------------------------------------");
    } 
    public int getLevel() {
    	return this.level;
    }
}
