/* Tragic RPG Junkies - Adam McKoy, Matthew So, Zicheng Zhen
   APCS1 pd10
   HW29 -- Ye Olde Role Playing Game, Improved
   2015-11-12 */

public class Character {
    protected int HP;
    protected int strength;
    protected int defense;
    protected double atkRating;
    protected String name;

    public Character() {
	HP = 100;
	strength = 75;
	defense = 30;
	atkRating = 0.3;
    }
    
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }

    public boolean isAlive(){
	return HP > 0;
    }

    public void lowerHP(int damage){
	HP -= damage;
    }

    public int attack(Character c){
	int damage = (int)((strength * atkRating) - c.getDefense());
	if(damage < 0){
            damage = 0; 
	}	 
	c.lowerHP(damage);
	return damage;
    }
    public void specialize() { // To be overridden in each class's file
	atkRating *= 2;
	defense -= 20;
    }
    public void normalize() { // To be overridden in each class's file
	atkRating = 0.3;
	defense = 30;
    }
}
