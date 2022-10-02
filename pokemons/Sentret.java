package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttacks.*;
import attacks.specialAttacks.*;
import attacks.statusAttacks.*;

public class Sentret extends Pokemon {
	public Sentret(String name, int level) {
		super(name, level);
		this.addType(Type.NORMAL);
		this.setStats(35, 46, 34, 35, 45, 20);
		this.addMove(new Amnesia());
		this.addMove(new Scratch());
		this.addMove(new FurySwipes());

	}
}