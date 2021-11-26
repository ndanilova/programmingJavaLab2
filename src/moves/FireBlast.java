package moves;
import ru.ifmo.se.pokemon.*;


    public class FireBlast extends SpecialMove{
        public FireBlast(){
            super(Type.FIRE, 120,85);
        }
        private boolean flag;
        public void applyOppEffects(Pokemon pok) {
            if (Math.random() <= 0.3) {
                flag = true;
                Effect.burn(pok);
            }
        }
        protected String describe(){
            if(flag) return "дамажит и поджигает";
            else return "дамажит";
        }
    }


