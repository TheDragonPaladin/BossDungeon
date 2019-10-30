import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Inventory extends JPanel{
    public Player doe = Singleton.getInstance();
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
        g.drawString("Armor: " + doe.getIthp(), 75, 65);
        g.drawString("Melee Weapon: "+ doe.getItst(), 75, 190);
        g.drawString("Magic Weapon: "+doe.getItin(), 75, 315);
        JButton back = new JButton("Back");
        back.setBounds(50, 420, 100, 25);
        add(back);
        InventoryMenu Back = new InventoryMenu();
        back.addActionListener(Back);
    }
    private class InventoryMenu implements ActionListener{
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