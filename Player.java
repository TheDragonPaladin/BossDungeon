class Player{
    public int hp;
    public int mahp;
    public int ithp;
    public int tohp;
    public int st;
    public int itst;
    public int tost;
    public int in;
    public int itin;
    public int toin;
    public String na;
    public int lv;
    public int go;
    public int ex;
    public int sp;
    public int ep;
    public Player(int hp, int st, int in){
        this.hp = hp;
        mahp = hp;
        this.st = st;
        this.in = in;
        na = "Saxon Foeman";
        lv = 1;
        go = 100;
        ex = 0;
        sp = 1;
        setStats();
    }
    public void setStats(){
        tohp = mahp + ithp;
        tost = st + itst;
        toin = in + itin;
    }
    public void inNew(int inc){itin = inc; setStats();}
    public void stNew(int inc){itst = inc; setStats();}
    public void hpNew(int inc){ithp = inc; setStats();}
    public int getHp(){return hp;}
    public int getIn(){return toin;}
    public int getSt(){return tost;}
    public int getLv(){return lv;}
    public String getNa(){return na;}
    public void setNa(String cr){na = cr;}
    public int getGo(){return go;}
    public int getSp(){return sp;}
    public int getMahp(){return tohp;}
    public void heal(){hp = tohp;}
    public void hit(int damage){hp -= damage;}
    public void changeHp(int change){mahp += change; setStats();}
    public void changeIn(int change){in += change; setStats();}
    public void changeSt(int change){st += change; setStats();}
    public void changeGo(int change){go += change;}
    public void changeSp(int change){sp += change;}
    public int level(int exp){
        ex += exp;
        while(ex >= lv*lv){lv++; ep++; ex -= lv*lv*lv;}
        return lv;
    }
    public int getItst(){return itst;}
    public int getItin(){return itin;}
    public int getIthp(){return ithp;}
}
