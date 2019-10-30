import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Market extends JPanel{
    public Player doe = Singleton.getInstance();
    public MarketStock a = new MarketStock(doe.getLv());
    public MarketStock b = new MarketStock(doe.getLv());
    public MarketStock c = new MarketStock(doe.getLv());
    public MarketStock d = new MarketStock(doe.getLv());
    public MarketStock e = new MarketStock(doe.getLv());
    public MarketStock f = new MarketStock(doe.getLv());
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new Color(171, 136, 66));
        g.setColor(new Color(125, 125, 125));
        g.fillRect(5, 5, 770, 450);
        g.setColor(new Color(171, 136, 66));
        g.fillRect(25, 25, 730, 410);
        g.setColor(new Color(125, 125, 125));
        g.fillRect(40, 50, 700, 100);
        g.fillRect(40, 175, 700, 100);
        g.fillRect(40, 300, 700, 100);
        g.setColor(Color.BLACK);
        g.drawString("Gold: "+doe.getGo(), 25, 25);
        //a
        g.drawString(a.toText(), 50, 75);
        JButton a = new JButton("Buy");
        a.setBounds(200, 75, 100, 50);
        add(a);
        Buy1 first = new Buy1();
        a.addActionListener(first);
        //b
        g.drawString(b.toText(), 50, 200);
        JButton b = new JButton("Buy");
        b.setBounds(200, 200, 100, 50);
        add(b);
        Buy2 second = new Buy2();
        b.addActionListener(second);
        //c
        g.drawString(c.toText(), 50, 325);
        JButton c = new JButton("Buy");
        c.setBounds(200, 325, 100, 50);
        add(c);
        Buy3 third = new Buy3();
        c.addActionListener(third);
        //d
        g.drawString(d.toText(), 450, 75);
        JButton d = new JButton("Buy");
        d.setBounds(600, 75, 100, 50);
        add(d);
        Buy4 fourth = new Buy4();
        d.addActionListener(fourth);
        //e
        g.drawString(e.toText(), 450, 200);
        JButton e = new JButton("Buy");
        e.setBounds(600, 200, 100, 50);
        add(e);
        Buy5 fifth = new Buy5();
        e.addActionListener(fifth);
        //f
        g.drawString(f.toText(), 450, 325);
        JButton f = new JButton("Buy");
        f.setBounds(600, 325, 100, 50);
        add(f);
        Buy6 sixth = new Buy6();
        f.addActionListener(sixth);
        //back
        JButton back = new JButton("Back");
        back.setBounds(50, 420, 100, 25);
        add(back);
        MarketMenu Back = new MarketMenu();
        back.addActionListener(Back);
    }
    private class MarketMenu implements ActionListener{
        public void actionPerformed(ActionEvent y){
            Singleton.setInstance(doe);
            JFrame f = new JFrame("Main Menu");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MainMenu f1 = new MainMenu();
            f.add(f1);
            f.setSize(800, 500);
            f.setVisible(true);
        }  
    }
    private class Buy1 implements ActionListener{
        public void actionPerformed(ActionEvent y){
            if(doe.getGo() > a.getVal()){
                doe.changeGo(-1*(a.getVal()));
                if(a.getPowtyp() == 1){doe.stNew(a.getPow());}
                else if(a.getPowtyp() == 2){doe.inNew(a.getPow());}
                else if(a.getPowtyp() == 3){doe.hpNew(a.getPow());}
            }
            repaint();
        }
    }
    private class Buy2 implements ActionListener{
        public void actionPerformed(ActionEvent y){
            if(doe.getGo() > b.getVal()){
                doe.changeGo(-1*(b.getVal()));
                if(b.getPowtyp() == 1){doe.stNew(b.getPow());}
                else if(b.getPowtyp() == 2){doe.inNew(b.getPow());}
                else if(b.getPowtyp() == 3){doe.hpNew(b.getPow());}
            }
            repaint();
        }
    }
    private class Buy3 implements ActionListener{
        public void actionPerformed(ActionEvent y){
            if(doe.getGo() > c.getVal()){
                doe.changeGo(-1*(c.getVal()));
                if(c.getPowtyp() == 1){doe.stNew(c.getPow());}
                else if(c.getPowtyp() == 2){doe.inNew(c.getPow());}
                else if(c.getPowtyp() == 3){doe.hpNew(c.getPow());}
            }
            repaint();
        }
    }
    private class Buy4 implements ActionListener{
        public void actionPerformed(ActionEvent y){
            if(doe.getGo() > d.getVal()){
                doe.changeGo(-1*(d.getVal()));
                if(d.getPowtyp() == 1){doe.stNew(d.getPow());}
                else if(d.getPowtyp() == 2){doe.inNew(d.getPow());}
                else if(d.getPowtyp() == 3){doe.hpNew(d.getPow());}
            }
            repaint();
        }
    }
    private class Buy5 implements ActionListener{
        public void actionPerformed(ActionEvent y){
            if(doe.getGo() > e.getVal()){
                doe.changeGo(-1*(e.getVal()));
                if(e.getPowtyp() == 1){doe.stNew(e.getPow());}
                else if(e.getPowtyp() == 2){doe.inNew(e.getPow());}
                else if(e.getPowtyp() == 3){doe.hpNew(e.getPow());}
            }
            repaint();
        }
    }
    private class Buy6 implements ActionListener{
        public void actionPerformed(ActionEvent y){
            if(doe.getGo() > f.getVal()){
                doe.changeGo(-1*(f.getVal()));
                if(f.getPowtyp() == 1){doe.stNew(f.getPow());}
                else if(f.getPowtyp() == 2){doe.inNew(f.getPow());}
                else if(f.getPowtyp() == 3){doe.hpNew(f.getPow());}
            }
            repaint();
        }
    }
}