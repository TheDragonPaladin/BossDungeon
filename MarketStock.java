import java.util.*;
class MarketStock {
    public int pow;
    public int powtyp;
    public int val;
    public String rar;
    public String text;
    public MarketStock(int lvl){
        Random random = new Random();
        powtyp = random.nextInt(3) + 1;
        if(powtyp == 1){ //Physical Attack Item
            pow = (int)(((random.nextInt(70)+31)*lvl)/5);
        }
        else if(powtyp == 2){ //Magic Attack Item
            pow = (int)(((random.nextInt(100)+11)*lvl)/5);
        }
        else if(powtyp == 3){ //Health Item
            pow = (int)(((random.nextInt(70)+31)*lvl)*9/10);
        }
        if(powtyp == 1){
            if(pow <= 12*lvl){rar = "Common"; val = (int)(random.nextInt(10)+1)*2*(pow/lvl);}
            else if(pow > 12*lvl && pow <= 17*lvl){rar = "Rare"; val = (int)(random.nextInt(15)+1)*4*(pow/lvl);}
            else if(pow > 17*lvl && pow <= 19*lvl){rar = "Epic"; val = (int)(random.nextInt(20)+1)*6*(pow/lvl);}
            else if(pow > 19*lvl){rar = "Legendary"; val = (int)(random.nextInt(25)+1)*10*(pow/lvl);}
        }
        if(powtyp == 2){
            if(pow <= 14*lvl){rar = "Common"; val = (int)(random.nextInt(10)+1)*2*(pow/lvl);}
            else if(pow > 14*lvl && pow <= 18*lvl){rar = "Rare"; val = (int)(random.nextInt(15)+1)*4*(pow/lvl);}
            else if(pow > 18*lvl && pow <= 21*lvl){rar = "Epic"; val = (int)(random.nextInt(20)+1)*6*(pow/lvl);}
            else if(pow > 21*lvl){rar = "Legendary"; val = (int)(random.nextInt(25)+1)*10*(pow/lvl);}
        }
        if(powtyp == 3){
            if(pow <= 55*lvl){rar = "Common"; val = (int)(random.nextInt(10)+1)*(pow/lvl)/5;}
            else if(pow > 55*lvl && pow <= 75*lvl){rar = "Rare"; val = (int)(random.nextInt(15)+1)*(pow/lvl)/5;}
            else if(pow > 75*lvl && pow <= 88*lvl){rar = "Epic"; val = (int)(random.nextInt(20)+1)*(pow/lvl)/3;}
            else if(pow > 88*lvl){rar = "Legendary"; val = (int)(random.nextInt(25)+1)*(pow/lvl)/2;}
        }
    }
    public String toText(){
        if(powtyp == 1){text = rar+" Melee Item: "+pow+" Cost: "+val;}
        else if(powtyp == 2){text = rar+" Magic Item: "+pow+" Cost: "+val;}
        else if(powtyp ==3){text = rar+" Armor: "+pow+" Cost: "+val;}
        return text;
    }
    public int getVal(){return val;}
    public int getPow(){return pow;}
    public int getPowtyp(){return powtyp;}
}
