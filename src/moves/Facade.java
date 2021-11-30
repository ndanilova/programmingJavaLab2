package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    private boolean flag;

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    protected void applyOppDamage(Pokemon pok, double damage) {
        Status cond = pok.getCondition();
        flag = true;
        if (cond.equals(Status.POISON) || cond.equals(Status.PARALYZE) || cond.equals(Status.BURN)) {
            pok.setMod(Stat.HP, (int) (-2 * Math.round(damage)));
        } else flag = false;
    }

    protected String describe() {
        if (flag) return "раскулачивает в двойном размере";
        else return "раскулачивает";
    }
}
