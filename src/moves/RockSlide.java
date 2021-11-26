package moves;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }
    private boolean flag;
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.flinch(p);
        else flag = false;
    }
    protected String describe() {
        if(flag)
        return "вызывает камнепад,заставляя содрогнуться";
        else return "вызывает камнепад";
    }
}


