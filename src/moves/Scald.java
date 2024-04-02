package moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(
                (new Effect()).chance(0.3).condition(Status.BURN));
    }

}
    // Has a 30% chance to burn the target.
