import java.util.*;
public class Creature{
    public int mahp;
    public int hp;
    public int at;
    public String na;
    public Creature(int location){
        Random ra = new Random();
        int diff = ra.nextInt(4);
        switch(location){
            case 1 :switch(diff){
                case 0 : na = "Boar"; mahp = (-1*ra.nextInt(20))+ra.nextInt(20)+41; at = (-1*ra.nextInt(3))+ra.nextInt(3)+7; break;
                case 1 : na = "Boar"; mahp = (-1*ra.nextInt(20))+ra.nextInt(20)+41; at = (-1*ra.nextInt(3))+ra.nextInt(3)+7; break;
                case 2 : na = "Wolf"; mahp = (-1*ra.nextInt(20))+ra.nextInt(20)+51; at = (-1*ra.nextInt(8))+ra.nextInt(8)+9; break;
                case 3 : na = "Bear"; mahp = (-1*ra.nextInt(30))+ra.nextInt(30)+61; at = (-1*ra.nextInt(8))+ra.nextInt(8)+9; break;
            }
            break;
            case 2 :switch(diff){
                case 0 : na = "Bear"; mahp = (-1*ra.nextInt(30))+ra.nextInt(30)+61; at = (-1*ra.nextInt(8))+ra.nextInt(8)+9; break;
                case 1 : na = "Skeleton"; mahp = (-1*ra.nextInt(20))+ra.nextInt(20)+41; at = (-1*ra.nextInt(3))+ra.nextInt(3)+21; break;
                case 2 : na = "Goblin"; mahp = (-1*ra.nextInt(15))+ra.nextInt(15)+61; at = (-1*ra.nextInt(10))+ra.nextInt(10)+11; break;
                case 3 : na = "Goblin Cheiftan"; mahp = (-1*ra.nextInt(20))+ra.nextInt(20)+81; at = (-1*ra.nextInt(15))+ra.nextInt(15)+16; break;
            }
            break;
            case 3 :switch(diff){
                case 0 : na = "Thief"; mahp = (-1*ra.nextInt(71))+ra.nextInt(71)+70; at = (-1*ra.nextInt(20))+ra.nextInt(20)+21; break;
                case 1 : na = "Ooze"; mahp = (-1*ra.nextInt(51))+ra.nextInt(51)+250; at = (-1*ra.nextInt(8))+ra.nextInt(8)+9; break;
                case 2 : na = "Bandit"; mahp = (-1*ra.nextInt(11))+ra.nextInt(11)+70; at = (-1*ra.nextInt(10))+ra.nextInt(10)+16; break;
                case 3 : na = "Mob Boss"; mahp = (-1*ra.nextInt(41))+ra.nextInt(41)+100; at = (-1*ra.nextInt(15))+ra.nextInt(15)+31; break;
            }
            break;
            case 4 :switch(diff){
                case 0 : na = "Ogre"; mahp = (-1*ra.nextInt(51))+ra.nextInt(51)+300; at = (-1*ra.nextInt(20))+ra.nextInt(20)+31; break;
                case 1 : na = "Goblin Chief"; mahp = (-1*ra.nextInt(91))+ra.nextInt(91)+100; at = (-1*ra.nextInt(20))+ra.nextInt(20)+21; break;
                case 2 : na = "Dark Elf"; mahp = (-1*ra.nextInt(11))+ra.nextInt(11)+150; at = (-1*ra.nextInt(10))+ra.nextInt(10)+16; break;
                case 3 : na = "Beast"; mahp = (-1*ra.nextInt(81))+ra.nextInt(81)+400; at = (-1*ra.nextInt(15))+ra.nextInt(15)+31; break;
            }
            break;
            case 5 :switch(diff){
                case 0 : na = "Steel Golem"; mahp = (-1*ra.nextInt(100))+ra.nextInt(100)+701; at = (-1*ra.nextInt(25))+ra.nextInt(25)+76; break;
                case 1 : na = "Young Dragon"; mahp = (-1*ra.nextInt(75))+ra.nextInt(75)+201; at = (-1*ra.nextInt(50))+ra.nextInt(50)+101; break;
                case 2 : na = "Stone Golem"; mahp = (-1*ra.nextInt(150))+ra.nextInt(150)+501; at = (-1*ra.nextInt(20))+ra.nextInt(20)+51; break;
                case 3 : na = "Stone Giant"; mahp = (-1*ra.nextInt(50))+ra.nextInt(50)+901; at = (-1*ra.nextInt(25))+ra.nextInt(25)+101; break;
            }
            break;
            case 6 :switch(diff){
                case 0 : na = "Adult Dragon"; mahp = (-1*ra.nextInt(500))+ra.nextInt(500)+1501; at = (-1*ra.nextInt(50))+ra.nextInt(50)+151; break;
                case 1 : na = "Young Dragon"; mahp = (-1*ra.nextInt(75))+ra.nextInt(75)+201; at = (-1*ra.nextInt(50))+ra.nextInt(50)+101; break;
                case 2 : na = "Elder Dragon"; mahp = (-1*ra.nextInt(2000))+ra.nextInt(2000)+5001; at = (-1*ra.nextInt(100))+ra.nextInt(100)+301; break;
                case 3 : na = "Illithid"; mahp = (-1*ra.nextInt(100))+ra.nextInt(100)+901; at = (-1*ra.nextInt(100))+ra.nextInt(100)+401; break;
            }
            break;
            case 7 :switch(diff){
                case 0 : na = "Grand Wizard"; mahp = (-1*ra.nextInt(100))+ra.nextInt(100)+901; at = (-1*ra.nextInt(200))+ra.nextInt(200)+501; break;
                case 1 : na = "Elder Dragon"; mahp = (-1*ra.nextInt(2000))+ra.nextInt(2000)+5001; at = (-1*ra.nextInt(100))+ra.nextInt(100)+301; break;
                case 2 : na = "Storm Giant"; mahp = (-1*ra.nextInt(150))+ra.nextInt(150)+501; at = (-1*ra.nextInt(20))+ra.nextInt(20)+51; break;
                case 3 : na = "Hydra"; mahp = (-1*ra.nextInt(500))+ra.nextInt(500)+1501; at = (-1*ra.nextInt(100))+ra.nextInt(100)+501; break;
            }
            break;
        }
        hp = mahp;
    }
    public Creature(String bna, String ranking){
        na = ranking + " minion of " + bna;
        mahp = 10000;
        hp = mahp;
        at = 20;
    }
    public int getMahp(){return mahp;}
    public int getHp(){return hp;}
    public int getAt(){return at;}
    public String getNa(){return na;}
    public void hit(int damage){hp -= damage;}
}
