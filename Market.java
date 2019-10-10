import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Market extends JPanel{
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
        g.drawString("Armor", 75, 65);
        g.drawString("Light", 90, 90);
        g.drawString("Heavy", 140, 90);
        g.drawString("Standard Weapons", 75, 190);
        g.drawString("Melee", 90, 215);
        g.drawString("Magic", 140, 215);
        g.drawString("Magic Weapons", 75, 315);
        g.drawString("Melee", 90, 340);
        g.drawString("Magic", 140, 340);
        JButton back = new JButton("Back");
        back.setBounds(50, 420, 100, 25);
        add(back);
        MarketMenu Back = new MarketMenu();
        back.addActionListener(Back);
    }
    private class MarketMenu implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame f = new JFrame("Main Menu");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MainMenu f1 = new MainMenu();
            f.add(f1);
            f.setSize(800, 500);
            f.setVisible(true);
        }  
    }
}