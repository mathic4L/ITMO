package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Electrode extends Voltorb {

    public Electrode(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(60, 50, 70, 80, 80, 150);
        setMove(new Confide(), new Swagger(), new SludgeBomb(), new EnergyBall());
    }
    
}
