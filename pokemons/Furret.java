package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.physicalAttacks.*;
import attacks.specialAttacks.*;
import attacks.statusAttacks.*;

public class Furret extends Sentret {
	public Furret(String name, int level) {
		super(name, level);
		this.setStats(85, 76, 64, 45, 55, 90);
		this.addMove(new Thunder());
	}
}