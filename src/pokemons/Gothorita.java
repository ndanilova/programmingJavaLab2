package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Gothorita extends Gothita {
    public Gothorita(String name, int lvl) {
        super(name,lvl);
        setStats(60,45,70,75,85,55);
        setType(Type.PSYCHIC);
        setMove(new CalmMind());
    }
}
