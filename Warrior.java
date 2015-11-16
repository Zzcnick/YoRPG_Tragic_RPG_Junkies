/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW29 -- Ye Olde Role Playing Game, Improved
   2015-11-12 */

public class Warrior extends Character {

    public Warrior() {
	name = "Garrosh";
	HP = 125;
	strength = 100;
	defense = 40;
	atkRating = 0.4;
    }
    public Warrior(String newName) {
	this();
	name = newName;
    }
    
    public void specialize(){ // Spading required.
	defense -= 10;
	atkRating += 0.2;
    }

    public void normalize(){
	strength = 100;
	atkRating = 0.4;
	defense = 40;
    }

    public String about(){
	return "No monster is too powerful for a warrior. " + 
	       "With his mighty axe and brolic arms, he's ready to fight anything. " + 
	    "The is a well-rounded class with decent stats for each attribute.";
    }
}
