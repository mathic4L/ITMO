package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Mesprit extends Pokemon {
    public Mesprit(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(80, 105, 105, 105, 105, 80);
        setMove(new MetalSound(), new Leer(), new Confide(), new Scald());
    }

}
