import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Fight extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new Color(30, 126, 191));
        g.setColor(new Color(125, 125, 125));
        g.fillRect(5, 5, 790, 440);
        g.setColor(new Color(30, 126, 191));
        g.fillRect(25, 25, 750, 390);
        //Forest
        g.setColor(new Color(23, 140, 23));
        g.fillRect(50, 50, 600, 100);
        g.drawString("Forest", 75, 65);
        //Cave
        g.setColor(new Color(100, 100, 100));
        g.fillRect(50, 175, 600, 100);
        g.drawString("Cave", 75, 190);
        //City
        g.setColor(new Color(142, 158, 104));
        g.fillRect(50, 300, 600, 100);
        g.drawString("City", 75, 315);
        //Back
        JButton back = new JButton("Back");
        back.setBounds(50, 420, 100, 25);
        add(back);
        MenuFight Back = new MenuFight();
        back.addActionListener(Back);
    }
    private class MenuFight implements ActionListener{
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