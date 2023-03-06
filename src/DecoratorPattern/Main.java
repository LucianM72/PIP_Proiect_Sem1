package DecoratorPattern;

import java.util.Scanner;

public class Main {
	
	public static void stats(Clasa clasa) {
		System.out.println(clasa.getDescription());
		System.out.println("Final stats:\nATK " + clasa.getATK() + "\nDEF " + clasa.getDEF() + "\nHP " + clasa.getHP());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Alegeti clasa: Warrior/Archer/Mage");
		String line = scan.nextLine();
		// citeste linia din consola pentru a selecta clasa
		
		// warrior
		while (line.equals("Warrior")) {
			Clasa clasa = new Warrior();
			System.out.println("Alegeti arma: Sword/Mace");

			// arma
			String a = scan.nextLine();
			if (a.equals("Sword"))
				clasa = new Sword(clasa);
			else if (a.equals("Mace"))
				clasa = new Mace(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			// armura
			System.out.println("Alegeti armura: Light/Heavy");
			a = scan.nextLine();
			if (a.equals("Light"))
				clasa = new LightArmor(clasa);
			else if (a.equals("Heavy"))
				clasa = new HeavyArmor(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			// inel
			System.out.println("Alegeti inelul: ATK/DEF/HP");
			a = scan.nextLine();
			if (a.equals("Atk"))
				clasa = new RingATK(clasa);
			else if (a.equals("Def"))
				clasa = new RingDEF(clasa);
			else if (a.equals("Hp"))
				clasa = new RingHP(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			stats(clasa);
			break;
		}
		
		// archer
		while (line.equals("Archer")) {
			Clasa clasa = new Archer();
			System.out.println("Alegeti arma: Bow/Crossbow");

			// arma
			String a = scan.nextLine();
			if (a.equals("Bow"))
				clasa = new Bow(clasa);
			else if (a.equals("Crossbow"))
				clasa = new Crossbow(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			// armura
			System.out.println("Alegeti armura: Light/Heavy");
			a = scan.nextLine();
			if (a.equals("Light"))
				clasa = new LightArmor(clasa);
			else if (a.equals("Heavy"))
				clasa = new HeavyArmor(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			// inel
			System.out.println("Alegeti inelul: ATK/DEF/HP");
			a = scan.nextLine();
			if (a.equals("Atk"))
				clasa = new RingATK(clasa);
			else if (a.equals("Def"))
				clasa = new RingDEF(clasa);
			else if (a.equals("Hp"))
				clasa = new RingHP(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			stats(clasa);
			break;
		}
		
		// mage
		while (line.equals("Mage")) {
			Clasa clasa = new Mage();
			System.out.println("Alegeti arma: Staff/Orb");

			// arma
			String a = scan.nextLine();
			if (a.equals("Staff"))
				clasa = new Staff(clasa);
			else if (a.equals("Orb"))
				clasa = new Orb(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			// armura
			System.out.println("Alegeti armura: Light/Heavy");
			a = scan.nextLine();
			if (a.equals("Light"))
				clasa = new LightArmor(clasa);
			else if (a.equals("Heavy"))
				clasa = new HeavyArmor(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			// inel
			System.out.println("Alegeti inelul: ATK/DEF/HP");
			a = scan.nextLine();
			if (a.equals("Atk"))
				clasa = new RingATK(clasa);
			else if (a.equals("Def"))
				clasa = new RingDEF(clasa);
			else if (a.equals("Hp"))
				clasa = new RingHP(clasa);
			else
				System.out.println("Nici o optiune aleasa");

			stats(clasa);
			break;
		}
		scan.close();

	}
}
