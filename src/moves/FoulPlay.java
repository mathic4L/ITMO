package moves;

import ru.ifmo.se.pokemon.*;

public class FoulPlay extends PhysicalMove {
    public FoulPlay() {
        super(Type.DARK, 95, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        return pokemon1.getStat(Stat.ATTACK);
    }

}
    // Calculates damage with the target's attacking stat.
