import moves.*;
import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class LabN2 {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Eevee p1 = new Eevee("Мохнатый пикачу",2);
        Sylveon p2 = new Sylveon("Стилевый пикачу", 3);
        TapuLele p3 = new TapuLele("Анимэшница",1);
        Gothita p4 = new Gothita("ГОТита",5);
        Gothorita p5 = new Gothorita("Шестерка ГОТиты",4);
        Gothitelle p6 = new Gothitelle("Ноунейм",6);
        battle.addAlly(p6);
        battle.addAlly(p5);
        battle.addAlly(p3);
        battle.addFoe(p4);
        battle.addFoe(p2);
        battle.addFoe(p1);
        battle.go();
    }
}
