package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttacks.*;
import attacks.specialAttacks.*;
import attacks.statusAttacks.*;

public class Lampent extends Litwick {
	public Lampent(String name, int level) {
		super(name, level);
		this.setStats(60, 40, 60, 95, 60, 55);
		this.addMove(new Minimize());
	}
}