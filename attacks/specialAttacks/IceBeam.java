package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove{
	public IceBeam() {
		super(Type.ICE, 90, 100);
	}

	@Override
	protected void applyOppEffects(Pokemon p) {
		Effect effect = new Effect().chance(0.1);
		effect.freeze(p);
	}
	
	@Override
	protected String describe() {
		return "использует атаку IceBeam";
	}
}