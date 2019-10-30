import java.util.*;
public class Boss {
    public int mahp;
    public int hp;
    public int at;
    public String na;
    public Boss(String lord, int mh, int a){
        mahp = mh;
        hp = mh;
        at = a;
        na = lord;
    }
    public int at(){return at;}
    public int hp(){return hp;}
    public int mahp(){return mahp;}
}
