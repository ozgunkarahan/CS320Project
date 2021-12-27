package character;

import combat.Enemy;

public class Stats {
    int level;
    double experience;
   public double currency;
    double enemyDefeatCount;
    String className;
    public Stats(){
      
       this.level=1;
       this.experience=0;
       this.currency=0;
       this.enemyDefeatCount=0;
    }
    public void gainLevel(){
       if(Math.sqrt(this.experience)==this.level||Math.sqrt(this.experience)>this.level)
    	   this.level=(int) Math.sqrt(this.experience);
    }
    public void increaseEnemyDefeat(){
        this.enemyDefeatCount= enemyDefeatCount +1;
    }
    public void addCurrency(Enemy enemy){
    	this.currency = this.currency +enemy.rewardCurrency;
        
    }       
    public void removeCurrency(){
        
    }        
    public void gainExperience(Enemy enemy){
    	this.experience = this.experience+enemy.rewardExperience;
    	
        
    }
    public void updateStats(Enemy enemy) {
    	gainExperience(enemy);
    	addCurrency(enemy);
    	increaseEnemyDefeat();
    	gainLevel();
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
