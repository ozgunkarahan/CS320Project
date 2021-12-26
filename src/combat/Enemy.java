package combat;

public class Enemy {
	public double hitPoints;
	public double attackDamage;
	public double blockRate;
	public double dodgeChance;
	public String name;
	public int armor;
	public int magicResist;
	
	
	public Enemy(double hp,double ad) {
		this.hitPoints = hp;
		this.attackDamage = ad;
		
	}
	

}
