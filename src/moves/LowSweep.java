package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LowSweep extends PhysicalMove {
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        pok.setMod(Stat.SPEED, -1);
    }

    protected String describe() {
        return "подло сделал подсечку";
    }
}
