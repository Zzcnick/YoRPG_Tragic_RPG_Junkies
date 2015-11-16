/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW29 -- Ye Olde Role Playing Game, Improved
   2015-11-12 */

public class WonderWorker extends Character {

    public WonderWorker() {
	name = "OopaLoompa";
	HP = 130;
	strength = 50;
	defense = 17;
	atkRating = 0.4;
    }
    public WonderWorker(String newName) {
	this();
	name = newName;
    }
    
    public void specialize(){ // Spading required.
	HP -= 15;
	atkRating += 0.2;
    }

    public void normalize(){
	atkRating = 0.4;
	HP= 130;
    }
    public String about(){
	return "The wonderworker works wonders. He is tanky, and uses his health as a resource.";
    }
}
