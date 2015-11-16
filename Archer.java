/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW30 -- Ye Olde Role Playing Game, Expanded
   2015-11-15 */

public class Archer extends Character {

    public Archer() {
	name = "Legolas";
	HP = 50;
	strength = 80;
	defense = 20;
	atkRating = 0.5;
    }
    public Archer(String newName) {
	this();
	name = newName;
    }
    
    public void specialize(){ // Spading required.
	defense += 3;
	atkRating -= 0.1;
    }

    public void normalize(){
	atkRating = 0.5;
	defense = 20;
    }

    public String about(){
	return "This archer is the most skilled in his field. " + 
	       "No one else in the land can 100% guarantee that he will always hit a bullseye in target practice. " + 
	       "He can also recharge very quickly, so his attack speed is faster than his allies. " + 
	       "However, he doesn't visit the gym very often so he's a frail young man with significantly less health than the other classes.";
    }
}
