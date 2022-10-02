package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttacks.*;
import attacks.specialAttacks.*;
import attacks.statusAttacks.*;

public class Chandelure extends Lampent {
	public Chandelure(String name, int level) {
		super(name, level);
		this.setStats(60, 55, 90, 145, 90, 80);
		this.addMove(new Swagger());
	}
}