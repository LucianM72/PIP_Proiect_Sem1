package DecoratorPattern;

public class Archer implements Clasa {
	public String getDescription() {
		return "Archer: ATK 300, DEF 100, HP 550";
	}
	
	public int getATK() {
		return 300;
	}
	public int getDEF() {
		return 100;
	}
	public int getHP() {
		return 550;
	}
}
