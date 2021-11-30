package pokemons;

import moves.Facade;
import moves.LowSweep;
import moves.Scratch;
import moves.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class TapuLele extends Pokemon {
    public TapuLele(String name, int lvl) {
        super(name, lvl);
        setStats(70, 85, 75, 130, 115, 95);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Scratch(), new LowSweep(), new WillOWisp(), new Facade());
    }

}
