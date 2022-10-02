package attacks.statusAttacks;

import ru.ifmo.se.pokemon.*;

public class Minimize extends StatusMove {
	public Minimize() {
		super(Type.NORMAL, 0, 100);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		p.setMod(Stat.EVASION, 2);
	}

	@Override
	protected String describe() {
		return "использует атаку Minimize";
	}
}