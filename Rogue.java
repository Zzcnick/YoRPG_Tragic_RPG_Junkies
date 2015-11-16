/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW29 -- Ye Olde Role Playing Game, Improved
   2015-11-12 */

public class Rogue extends Character {

    public Rogue() {
	name = "Valeera";
	HP = 100;
	strength = 110;
	defense = 25;
	atkRating = 0.5;
    }
    public Rogue(String newName) {
	this();
	name = newName;
    }
    
    public void specialize(){ // Spading required.
	atkRating += defense / 100.;
	defense = 0;
    }

    public void normalize(){
	atkRating = 0.5;
	defense = 25;
    }
    public String about(){
	return "The rogue fights with a dagger in hand and sand in her pocket. " + 
	       "She relies on devastating blows to end her opponent's lives. " + 
	    "She has a very powerful special attack.";
    }
}
