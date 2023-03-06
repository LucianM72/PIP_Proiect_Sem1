package DecoratorPattern;

public class RingATK extends ClasaDecorator{
	private final Clasa clasa;

	public RingATK(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Ring ATK (+10% ATK,+0 DEF,+ HP)";
	}
	
	//cast la int
	public int getATK() {
		return (int) (clasa.getATK()+clasa.getATK()*0.10);
	}
	public int getDEF() {
		return clasa.getDEF()+0;
	}
	public int getHP() {
		return clasa.getHP()+0;
	}
}
