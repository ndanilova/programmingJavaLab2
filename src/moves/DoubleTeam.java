package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super();
        type = Type.NORMAL;
    }

    protected void applySelfEffects(Pokemon pok) {
        pok.setMod(Stat.EVASION, 1);
    }

    protected String describe() {
        return "опа, раздвоился";
    }
}
