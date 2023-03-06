package DecoratorPattern;

public class RingHP extends ClasaDecorator{
	private final Clasa clasa;

	public RingHP(Clasa clasa) {
		this.clasa=clasa;
	}
	
	public String getDescription() {
		return clasa.getDescription()+", Ring HP (+0 ATK,+0 DEF,+20% HP)";
	}
	
	public int getATK() {
		return clasa.getATK()+0;
	}
	public int getDEF() {
		return clasa.getDEF()+0;
	}
	//cast la int
	public int getHP() {
		return (int) (clasa.getHP()+clasa.getHP()*0.20);
	}
}
