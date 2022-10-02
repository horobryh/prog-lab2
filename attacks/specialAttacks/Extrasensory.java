package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove{
	public Extrasensory() {
		super(Type.PSYCHIC, 80, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect effect = new Effect().chance(0.1);
		effect.flinch(p);
	}
	
	@Override
	protected String describe() {
		return "использует атаку Extrasensory";
	}
}