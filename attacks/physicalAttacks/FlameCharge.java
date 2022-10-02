package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
	public FlameCharge() {
		super(Type.FIRE, 50, 100);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		Effect effect = new Effect().stat(Stat.SPEED, 1);
		p.addEffect(effect);
	}

	@Override
	protected String describe() {
		return "использует атаку FlameCharge";
	}
}