package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getStat(Stat.ATTACK) <= 4) {
            pokemon.setMod(Stat.ATTACK, 2);
            pokemon.confuse();
        }
    }
}
