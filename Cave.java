import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Cave extends JPanel {
    public Player doe = Singleton.getInstance();
    public Creature cave = new Creature(2);
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.GREEN);
        g.setColor(Color.WHITE);
        g.fillRect(10, 10, 370, 380);
        g.fillRect(390, 10, 370, 380);
        g.setColor(Color.BLACK);
        //Player
        g.drawString(doe.getNa(), 20, 30);
        g.drawString(doe.getHp()+"/"+doe.getMahp(), 30, 50);
        JButton melee = new JButton("Melee Attack");
        melee.setBounds(30, 75, 320, 50);
        add(melee);
        MeAt atk = new MeAt();
        melee.addActionListener(atk);
        JButton magic = new JButton("Magic Attack");
        magic.setBounds(30, 150, 320, 50);
        add(magic);
        MaAt mag = new MaAt();
        magic.addActionListener(mag);
        //Creature
        g.drawString(cave.getNa(), 400, 30);
        g.drawString(cave.getHp()+"/"+cave.getMahp(), 410, 50);
    }
    private class MeAt implements ActionListener{
        public void actionPerformed(ActionEvent y){
            cave.hit(doe.getSt());
            if(cave.getHp() <= 0){
                doe.level((int)((cave.getAt()+cave.getMahp())/10));
                doe.changeGo((int)((cave.getAt()+cave.getMahp())/5));
                JFrame h = new JFrame("Fight");
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Fight h1 = new Fight();
                h.add(h1);
                h.setSize(800, 500);
                h.setVisible(true);
            }
            else{
                doe.hit(cave.getAt());
            }
            removeAll();
            revalidate();
            repaint();
        } 
    }
    private class MaAt implements ActionListener{
        public void actionPerformed(ActionEvent y){
            cave.hit(doe.getIn());
            if(cave.getHp() <= 0){
                doe.level((int)((cave.getAt()+cave.getMahp())/10));
                doe.changeGo((int)((cave.getAt()+cave.getMahp())/5));
                JFrame h = new JFrame("Fight");
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Fight h1 = new Fight();
                h.add(h1);
                h.setSize(800, 500);
                h.setVisible(true);
            }
            else{
                doe.hit(cave.getAt());
            }
            removeAll();
            revalidate();
            repaint();
        } 
    }
}
