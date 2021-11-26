package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Sylveon extends Eevee {
    public Sylveon(String name, int lvl) {
        super(name,lvl);
        setStats(95,65,65,110,130,60);
        setType(Type.FAIRY);
        setMove(new FireBlast());
    }
}
