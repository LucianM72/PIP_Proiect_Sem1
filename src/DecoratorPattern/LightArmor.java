package DecoratorPattern;

public class LightArmor extends ClasaDecorator{
	private final Clasa clasa;
	
	public LightArmor(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Light Armor (+0 ATK,+30 DEF,+10 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+0;
	}
	public int getDEF() {
		return clasa.getDEF()+30;
	}
	public int getHP() {
		return clasa.getHP()+10;
	}
}
