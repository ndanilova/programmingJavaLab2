package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class TapuLele extends Pokemon {
    public TapuLele(String name, int lvl) {
        super(name,lvl);
        setStats(70,85, 75, 130, 115, 95);
        setType(Type.PSYCHIC, Type.FAIRY);
        setMove(new Scratch(), new LowSweep(), new WillOWisp(), new Facade());
    }

}
