package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Samurott extends Dewott {

    public Samurott(String name, int level) {
        super(name, level);
        setType(Type.WATER);
            setStats(95, 100, 85, 108, 70, 70);
            setType(Type.WATER);
            setMove(new Thunder(), new Swagger(), new FoulPlay(), new WillOWisp());

    }

}