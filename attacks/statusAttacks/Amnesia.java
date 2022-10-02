package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {
	public Amnesia() {
		super(Type.PSYCHIC, 0, 100);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.SPECIAL_ATTACK, 2);	}

	@Override
	protected String describe() {
		return "использует атаку Amnesia";
	}
}