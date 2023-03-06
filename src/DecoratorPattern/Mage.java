package DecoratorPattern;

public class Mage implements Clasa {
	public String getDescription() {
		return "Mage: ATK 500, DEF 60, HP 400";
	}
	
	public int getATK() {
		return 500;
	}
	public int getDEF() {
		return 60;
	}
	public int getHP() {
		return 400;
	}
}