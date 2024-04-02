import pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {

    public static void main(String[] args) {

        Battle battle = new Battle();
        Samurott samurott = new Samurott("samurott", 1);
        Dewott dewott = new Dewott("dewott", 1);
        Oshawott oshawott = new Oshawott("oshawott", 1);
        Electrode electrode = new Electrode("electrode", 1);
        Voltorb voltorb = new Voltorb("voltorb", 1);
        Mesprit mesprit = new Mesprit("mesprit", 1);

        battle.addAlly(samurott);
        battle.addAlly(dewott);
        battle.addAlly(oshawott);
        battle.addFoe(electrode);
        battle.addFoe(voltorb);
        battle.addFoe(mesprit);

        battle.go();

    }
}