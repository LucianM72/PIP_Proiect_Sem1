package DecoratorPattern;

public class Bow extends ClasaDecorator{
	private final Clasa clasa;
	
	public Bow(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Bow (+30 ATK,+5 DEF,+0 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+30;
	}
	public int getDEF() {
		return clasa.getDEF()+5;
	}
	public int getHP() {
		return clasa.getHP()+0;
	}
}
