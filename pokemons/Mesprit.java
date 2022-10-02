package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttacks.*;
import attacks.specialAttacks.*;
import attacks.statusAttacks.*;

public class Mesprit extends Pokemon {
	public Mesprit(String name, int level) {
		super(name, level);
		this.addType(Type.PSYCHIC);
		this.setStats(80, 105, 105, 105, 105, 80);
		this.addMove(new Confide());
		this.addMove(new Extrasensory());
		this.addMove(new IceBeam());
		this.addMove(new Psychic());
	}
}