package moves;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect((new Effect()).condition(Status.BURN));
    }

}

    // Burns the target




//
//
//
//
//
//
//
//
//
