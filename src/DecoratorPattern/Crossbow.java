package DecoratorPattern;

public class Crossbow extends ClasaDecorator{
private final Clasa clasa;
	
	public Crossbow(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Crossbow (+70 ATK,+10 DEF,+0 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+70;
	}
	public int getDEF() {
		return clasa.getDEF()+10;
	}
	public int getHP() {
		return clasa.getHP()+0;
	}
}
