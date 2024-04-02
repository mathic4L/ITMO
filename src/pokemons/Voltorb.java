package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Voltorb extends Pokemon {
    public Voltorb(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(40, 30, 50, 55, 55, 100);
        setMove(new Confide(), new Swagger(), new SludgeBomb());
    }
}
