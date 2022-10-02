import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();

		Mesprit p1 = new Mesprit("Mesprit", 1);
		Sentret p2 = new Sentret("Sentret", 1);
		Furret p3 = new Furret("Furret", 1);
		Litwick p4 = new Litwick("Litwick", 1);
		Lampent p5 = new Lampent("Lampent", 1);
		Chandelure p6 = new Chandelure("Chandelure", 1);

		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);

		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		
		b.go();
	}
}