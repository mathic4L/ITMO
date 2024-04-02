package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Oshawott extends Pokemon{

    public Oshawott (String name, int level) {
        super(name, level); 
        setType(Type.WATER);
        setStats(55, 55, 45, 63, 45, 45);
        setMove(new Thunder(), new Swagger());
    }
    
}
