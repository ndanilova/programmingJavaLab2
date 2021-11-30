package pokemons;


import moves.Confide;
import moves.DoubleTeam;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Eevee extends Pokemon {
    public Eevee(String name, int lvl) {
        super(name, lvl);
        setStats(55, 55, 50, 45, 65, 55);
        setType(Type.NORMAL);
        setMove(new Swagger(), new Confide(), new DoubleTeam());
    }
}
