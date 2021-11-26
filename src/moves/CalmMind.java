package moves;
import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }
    protected void applySelfEffects (Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    protected String describe() {
        return "на чилле";
    }
}
