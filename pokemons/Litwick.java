package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttacks.*;
import attacks.specialAttacks.*;
import attacks.statusAttacks.*;

public class Litwick extends Pokemon {
	public Litwick(String name, int level) {
		super(name, level);
		this.setStats(50, 30, 55, 65, 55, 20);
		this.addType(Type.GHOST);
		this.addType(Type.FIRE);
		this.addMove(new WillOWisp());
		this.addMove(new FlameCharge());
	}
}