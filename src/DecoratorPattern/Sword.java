package DecoratorPattern;

public class Sword extends ClasaDecorator {
	private final Clasa clasa;
	
	public Sword(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Sword (+100 ATK,+20 DEF,+0 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+100;
	}
	public int getDEF() {
		return clasa.getDEF()+20;
	}
	public int getHP() {
		return clasa.getHP()+0;
	}
	
}
