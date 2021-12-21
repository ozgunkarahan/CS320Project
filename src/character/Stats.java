package character;
public class Stats extends User {
    int level;
    double experience;
    double currency;
    double enemyDefeatCount;
    String class_name;
    public Stats(){
      
       this.level=0;
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
        System.out.println("*******************************");
        System.out.println("Level :"+ this.level+"\nExperience: "+
                this.experience+"\nCurrency: "+this.currency+
                "\nEnemy Defeat: "+this.enemyDefeatCount);
        System.out.println("*******************************");
    }         
}
