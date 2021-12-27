package combat;
import java.util.*;

import character.User;

public class EnemyGeneration {
	
	public static Enemy generateEnemy(User player) {
		Enemy enemy = null;
		Random rand = new Random();
		int random = rand.nextInt(7);
		if(random==0) 
			enemy = new Skeleton(player);
		else if(random==1) 
			enemy = new Centaur(player);
		else if(random==2)
			enemy = new Harpy(player);
		else if(random==3)
			enemy = new HellHound(player);
		else if(random==4)
			enemy = new Minotaur(player);
		else if(random==5) 
			enemy = new Ogre(player);
		else
			enemy = new Slime(player);
		return enemy;
	}
	
	

}
