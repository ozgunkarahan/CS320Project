import character.*;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
    	String temp[] = new String[2];
    	User player = null;
        temp = menu.Menu.startGame();
        System.out.println(temp[0] + " "+ temp[1]);
        if(temp[0].equals("warrior")) {
        	player = new Warrior(temp[1]);
        }
        else if (temp[0].equals("wizard")) {
        	player = new Wizard(temp[1]);
        }
        else if(temp[0].equals("ranger")) {
        	player = new Ranger(temp[1]);
        	
        }
        else {
        	player = new BattleMage(temp[1]);
        }
       
        menu.Menu.mainMenu(player);
  
    }
}
       
    

