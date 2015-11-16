/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW30 -- Ye Olde Role Playing Game, Expanded
   2015-11-15 */

public class Mage extends Character {

    public Mage() {
	name = "Jaina";
	HP = 75;
	strength = 120;
	defense = 15;
	atkRating = 0.6;
    }
    public Mage(String newName) {
	this();
	name = newName;
    }
    
    public void specialize(){ // Spading required.
	defense -= 5;
	atkRating += 0.2;
    }

    public void normalize(){
	atkRating = 0.6;
	defense = 15;
    }

    public String about(){
	return "The Magical Mystery Mage is waiting to zap you away. " +
	       "The mage attacks using its extensive arsenel of spells. " + 
	       "Its spells are much stronger than any sword or dagger, but it takes more damage due to a lack of armor. " + 
	       "It's pretty hard to read a spell book when you're bogged down by a few pounds of armor.";
    }
}
