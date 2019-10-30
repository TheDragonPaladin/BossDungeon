import java.util.*;
public class Dungeon {
    public Boss lord;
    public Creature first;
    public Creature second;
    public Creature third;
    public Creature fourth;
    public Dungeon(int lead){
        switch(lead){
            case 1 : lord = new Boss("Solomon, Master of Despair", 1, 1); //Tears of sorrow   curse
            first = new Creature("Solomon", "first");
            second = new Creature("Solomon", "second");
            third = new Creature("Solomon", "third");
            fourth = new Creature("Solomon","fourth");
            break;
            case 2 : lord = new Boss("Slyvester, the Golden Rogue", 1, 1);//Sly (luck or dex based)   steal
            first = new Creature("Slyvester", "first");
            second = new Creature("Slyvester", "second");
            third = new Creature("Slyvester", "third");
            fourth = new Creature("Slyvester","fourth");
            break;
            case 3 : lord = new Boss("Zion, Dark Magician of the Flayers", 1, 1);//Magic based     mag debuff
            first = new Creature("Zion", "first");
            second = new Creature("Zion", "second");
            third = new Creature("Zion", "third");
            fourth = new Creature("Zion","fourth");
            break;
            case 4 : lord = new Boss("Kleg, Goblin Warlord", 1, 1);//hordes of goblins      steal
            first = new Creature("Kleg", "first");
            second = new Creature("Kleg", "second");
            third = new Creature("Kleg", "third");
            fourth = new Creature("Kleg","fourth");
            break;
            case 5 : lord = new Boss("Garren, Sentinel of the Fey", 1, 1);//random natural creatures     curse
            first = new Creature("Garren", "first");
            second = new Creature("Garren", "second");
            third = new Creature("Garren", "third");
            fourth = new Creature("Garren","fourth");
            break;
            case 6 : lord = new Boss("Rimax, Creator of Chimera", 1, 1);//random unatural creatures      str debuff
            first = new Creature("Rimax", "first");
            second = new Creature("Rimax", "second");
            third = new Creature("Rimax", "third");
            fourth = new Creature("Rimax","fourth");
            break;
        }
    }
}
