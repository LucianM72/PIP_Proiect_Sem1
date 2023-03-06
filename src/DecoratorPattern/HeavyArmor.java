package DecoratorPattern;

public class HeavyArmor extends ClasaDecorator{
	private final Clasa clasa;
	
	public HeavyArmor(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Heavy Armor (+0 ATK,+70 DEF,+0 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+0;
	}
	public int getDEF() {
		return clasa.getDEF()+70;
	}
	public int getHP() {
		return clasa.getHP()+0;
	}
}
