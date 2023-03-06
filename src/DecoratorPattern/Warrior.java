package DecoratorPattern;

public class Warrior implements Clasa {
	public String getDescription() {
		return "Warrior: ATK 200, DEF 150, HP 700";
	}
	
	public int getATK() {
		return 200;
	}
	public int getDEF() {
		return 150;
	}
	public int getHP() {
		return 700;
	}
}
