package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class FireBlast extends SpecialMove {
    private boolean flag;

    public FireBlast() {
        super(Type.FIRE, 120, 85);
    }

    public void applyOppEffects(Pokemon pok) {
        if (Math.random() <= 0.3) {
            flag = true;
            Effect.burn(pok);
        }
    }

    protected String describe() {
        if (flag) return "дамажит и поджигает";
        else return "дамажит";
    }
}


