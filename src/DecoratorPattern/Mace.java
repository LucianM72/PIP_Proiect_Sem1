package DecoratorPattern;

public class Mace extends ClasaDecorator {
	private final Clasa clasa;

	public Mace(Clasa clasa) {
		this.clasa=clasa;
	}

	public String getDescription() {
		return clasa.getDescription() + ", Mace (+150 ATK,+10 DEF,+0 HP)";
	}

	public int getATK() {
		return clasa.getATK() + 150;
	}

	public int getDEF() {
		return clasa.getDEF() + 10;
	}

	public int getHP() {
		return clasa.getHP() + 0;
	}
}
