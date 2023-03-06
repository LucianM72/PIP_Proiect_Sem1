package DecoratorPattern;

public class RingDEF extends ClasaDecorator{
	private final Clasa clasa;

	public RingDEF(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Ring DEF (+0 ATK,+15% DEF,+0 HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+0;
	}
	//cast la int
	public int getDEF() {
		return (int) (clasa.getDEF()+clasa.getDEF()*0.15);
	}
	public int getHP() {
		return clasa.getHP()+0;
	}
}
