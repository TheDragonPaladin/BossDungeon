import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Inn extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(new Color(171, 136, 66));
        g.setColor(new Color(125, 125, 125));
        g.fillRect(5, 5, 790, 440);
        g.setColor(new Color(171, 136, 66));
        g.fillRect(25, 25, 750, 400);
        g.setColor(Color.WHITE);
        g.fillRect(50, 200, 700, 100);
        g.setColor(Color.BLACK);
        g.drawString("You have rested and are back up to full hp.", 250, 250);
        JButton back = new JButton("Back");
        back.setBounds(50, 420, 100, 25);
        add(back);
        InnMenu Back = new InnMenu();
        back.addActionListener(Back);
    }
    private class InnMenu implements ActionListener{
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