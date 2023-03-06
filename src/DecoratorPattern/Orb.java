package DecoratorPattern;

public class Orb extends ClasaDecorator{
	private final Clasa clasa;
	
	public Orb(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Orb (+50 ATK,+50 DEF,+70 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+50;
	}
	public int getDEF() {
		return clasa.getDEF()+50;
	}
	public int getHP() {
		return clasa.getHP()+70;
	}
}
