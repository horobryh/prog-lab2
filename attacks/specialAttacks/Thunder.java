package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
	public Thunder() {
		super(Type.ELECTRIC, 110, 70);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect effect = new Effect().chance(0.3);
		effect.paralyze(p);
	}

	@Override
	protected String describe() {
		return "использует атаку Thunder";
	}
}