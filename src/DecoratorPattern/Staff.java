package DecoratorPattern;

public class Staff extends ClasaDecorator{
	private final Clasa clasa;
	
	public Staff(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Staff (+120 ATK,+0 DEF,+50 HP))";
	}
	
	public int getATK() {
		return clasa.getATK()+120;
	}
	public int getDEF() {
		return clasa.getDEF()+0;
	}
	public int getHP() {
		return clasa.getHP()+50;
	}
}
