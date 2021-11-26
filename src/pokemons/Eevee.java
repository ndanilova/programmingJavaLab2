package pokemons;


import moves.*;
import ru.ifmo.se.pokemon.*;


public class Eevee extends Pokemon {
    public Eevee(String name, int lvl) {
        super(name,lvl);
        setStats(55,55,50,45,65,55);
        setType(Type.NORMAL);
        setMove(new Swagger(), new Confide(), new DoubleTeam());
    }
}
