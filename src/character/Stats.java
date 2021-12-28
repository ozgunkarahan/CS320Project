package character;

import combat.Enemy;

public class Stats {

    int level;
    double experience;
    public double currency;
    double enemyDefeatCount;

    public Stats(){
      
       this.level=1;
       this.experience=0;
       this.currency=0;
       this.enemyDefeatCount=0;
    }
    public void gainLevel(){

       if(this.experience>0 && this.experience<4) 
    	   this.level = 1;
       else if(this.experience>=4 && this.experience<9) 
    	   this.level = 2;
       else if(this.experience>=9 && this.experience<16)
    	   this.level=3;
       else if(this.experience>=16 && this.experience<25)
    	   this.level=4;
       else if(this.experience>=25 && this.experience<36)
    	   this.level=5;
       else this.level=6;
    }

    public void increaseEnemyDefeat(){
        this.enemyDefeatCount= enemyDefeatCount +1;
    }

    public void addCurrency(Enemy enemy) {
        this.currency = this.currency +enemy.rewardCurrency;
    }

    public void gainExperience(Enemy enemy) {
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