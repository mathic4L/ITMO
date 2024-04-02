package moves;

import ru.ifmo.se.pokemon.*;

public class MetalSound extends StatusMove {
    public MetalSound() {
        super(Type.STEEL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -2);
    }
}
