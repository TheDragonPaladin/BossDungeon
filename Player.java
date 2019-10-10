class Player
{
    public int hp;
    public int mahp;
    public int st;
    public int in;
    public String na;
    public int lv;
    public int go;
    public int ex;
    public int sp;
    public Player(int hp, int st, int in){
        this.hp = hp;
        mahp = hp;
        this.st = st;
        this.in = in;
        na = "Saxon Foeman";
        lv = 1;
        go = 0;
        ex = 0;
        sp = 1;
    }
    public int getHp(){return hp;}
    public int getIn(){return in;}
    public int getSt(){return st;}
    public int getLv(){return lv;}
    public String getNa(){return na;}
    public void setNa(String cr){na = cr;}
    public int getGo(){return go;}
    public int getSp(){return sp;}
    public int getMahp(){return mahp;}
    public void changeHp(int change){hp += change;}
    public void changeIn(int change){in += change;}
    public void changeSt(int change){st += change;}
    public void changeGo(int change){go += change;}
    public void changeSp(int change){sp += change;}
    public int level(){
        while(ex >= lv*lv){lv++; ex -= lv*lv;}
        return lv;
    }
}
