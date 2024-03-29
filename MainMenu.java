import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
public class MainMenu extends JPanel{
    public Player doe = Singleton.getInstance();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.GREEN);
        //Button Background
        g.setColor(Color.GRAY);
        g.fillRect(5, 5, 240, 90);
        g.fillRect(5, 305, 240, 90);
        g.fillRect(555, 5, 240, 90);
        g.fillRect(555, 305, 240, 90);
        //Character Stats
        g.setColor(Color.WHITE);
        g.fillRect(280, 125, 240, 150);
        g.setColor(Color.BLACK);
        g.drawString("Name: " + doe.getNa(), 290, 145);
        g.drawString("Level: " + doe.getLv(), 290, 160);
        g.drawString("Health: " + doe.getHp() + "/" + doe.getMahp(), 290, 190);
        g.drawString("Strength: " + doe.getSt(), 290, 205);
        g.drawString("Intelligence: " + doe.getIn(), 290, 220);
        g.drawString("Gold : " + doe.getGo(), 290, 250);
        //Buttons
        JButton market = new JButton("Market");
        JButton inventory = new JButton("Inventory");
        JButton fight = new JButton("Fight");
        JButton inn = new JButton("Inn");
        market.setBounds(575, 340, 200, 25);
        inventory.setBounds(25, 340, 200, 25);
        fight.setBounds(25, 40, 200, 25);
        inn.setBounds(575, 40, 200, 25);
        add(market);
        add(inventory);
        add(fight);
        add(inn);
        Buy Market = new Buy();
        Search Inventory = new Search();
        Combat Fight = new Combat();
        Rest Inn = new Rest();
        market.addActionListener(Market);
        inventory.addActionListener(Inventory);
        fight.addActionListener(Fight);
        inn.addActionListener(Inn);
    }
    private class Rest implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.heal();
            Singleton.setInstance(doe);
            repaint();
            /*
             * public void paintComponent(Graphics g){
             * super.paintComponent(g);
             * this.setBackground(new Color(171, 136, 66));
             * g.setColor(new Color(125, 125, 125));
             * g.fillRect(5, 5, 790, 440);
             * g.setColor(new Color(171, 136, 66));
             * g.fillRect(25, 25, 750, 400);
             * g.setColor(Color.WHITE);
             * g.fillRect(50, 200, 700, 100);
             * g.setColor(Color.BLACK);
             * g.drawString("You have rested and are back up to full hp.", 250, 250);
            */
        }  
    }
    private class Combat implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame h = new JFrame("Fight");
            h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Fight h1 = new Fight();
            h.add(h1);
            h.setSize(800, 500);
            h.setVisible(true);
        }  
    }
    private class Search implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame d = new JFrame("Inventory");
            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Inventory d1 = new Inventory();
            d.add(d1);
            d.setSize(800, 500);
            d.setVisible(true);
        }  
    }
    private class Buy implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame a = new JFrame("Market");
            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Market a1 = new Market();
            a.add(a1);
            a.setSize(800, 500);
            a.setVisible(true);
        }  
    }
}