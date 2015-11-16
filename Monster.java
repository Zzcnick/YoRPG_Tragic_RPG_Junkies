/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW29 -- Ye Olde Role Playing Game, Improved
   2015-11-12 */

public class Monster extends Character{

    public Monster(){
	HP = 150;
	strength = ((int)(Math.random() * 45) + 20);
	defense = 20;
	atkRating = 1;
	name = "Monster";
    }
    public void normalize() {;}
    public void specialize() {;}

    public String about() {
	return "Blargh! I am a monster! Fear me!";
    }
}
