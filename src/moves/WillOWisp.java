package moves;
import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, 85);
    }
    protected void applyOppEffects(Pokemon pok) {
        Effect.burn(pok);
    }
    protected String describe() {
        return "поджигает";
    }
}
