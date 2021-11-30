package pokemons;

import moves.DoubleTeam;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gothita extends Pokemon {
    public Gothita(String name, int lvl) {
        super(name, lvl);
        setStats(45, 30, 50, 55, 65, 45);
        setType(Type.PSYCHIC);
        setMove(new DoubleTeam(), new Swagger());
    }
}
