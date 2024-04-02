package moves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(
                (new Effect()).chance(0.3).condition(Status.POISON));
    }

}
    // Has a 30% chance to poison the target.
