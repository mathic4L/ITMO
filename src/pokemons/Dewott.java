package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Dewott extends Oshawott {

    public Dewott(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(75, 75, 60, 83, 60, 60);
        setMove(new Thunder(), new Swagger(), new FoulPlay());
    }

}

