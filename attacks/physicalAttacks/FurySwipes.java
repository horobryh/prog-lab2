package attacks.physicalAttacks;

import ru.ifmo.se.pokemon.*;
import static java.lang.Math.*;

public class FurySwipes extends PhysicalMove {
	public FurySwipes() {
		super(Type.NORMAL, 18, 80);
		this.hits = (int) round(random() * 3 + 5 - 3);
	}

	@Override
	protected void applySelfEffects(Pokemon p) {
		this.hits = (int) round(random() * 3 + 5 - 3);
	}

	@Override
	protected String describe() {
		return "использует атаку FurySwipes";
	}
}