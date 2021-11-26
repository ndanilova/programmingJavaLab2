package moves;

import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {
        super(Type.FIGHTING, 65, 100);
    }
    protected void applyOppEffects(Pokemon pok){
        pok.setMod(Stat.SPEED,-1);
    }
    protected String describe() {
        return "подло сделал подсечку";
    }
}
