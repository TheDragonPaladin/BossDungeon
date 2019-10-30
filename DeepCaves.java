import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class DeepCaves extends JPanel {
    public Player doe = Singleton.getInstance();
    public Creature deepCave = new Creature(6);
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
        g.drawString(deepCave.getNa(), 400, 30);
        g.drawString(deepCave.getHp()+"/"+deepCave.getMahp(), 410, 50);
    }
    private class MeAt implements ActionListener{
        public void actionPerformed(ActionEvent y){
            deepCave.hit(doe.getSt());
            if(deepCave.getHp() <= 0){
                doe.level((int)((deepCave.getAt()+deepCave.getMahp())/10));
                doe.changeGo((int)((deepCave.getAt()+deepCave.getMahp())/5));
                JFrame h = new JFrame("Fight");
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Fight h1 = new Fight();
                h.add(h1);
                h.setSize(800, 500);
                h.setVisible(true);
            }
            else{
                doe.hit(deepCave.getAt());
            }
            removeAll();
            revalidate();
            repaint();
        } 
    }
    private class MaAt implements ActionListener{
        public void actionPerformed(ActionEvent y){
            deepCave.hit(doe.getIn());
            if(deepCave.getHp() <= 0){
                doe.level((int)((deepCave.getAt()+deepCave.getMahp())/10));
                doe.changeGo((int)((deepCave.getAt()+deepCave.getMahp())/5));
                JFrame h = new JFrame("Fight");
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Fight h1 = new Fight();
                h.add(h1);
                h.setSize(800, 500);
                h.setVisible(true);
            }
            else{
                doe.hit(deepCave.getAt());
            }
            removeAll();
            revalidate();
            repaint();
        } 
    }
}
