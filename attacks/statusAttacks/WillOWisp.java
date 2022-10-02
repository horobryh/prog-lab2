package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
	public WillOWisp() {
		super(Type.FIRE, 0, 85);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect effect = new Effect().turns(-1);
		effect.burn(p);
	}

	@Override
	protected String describe() {
		return "использует атаку Will-O-Wisp";
	}
}