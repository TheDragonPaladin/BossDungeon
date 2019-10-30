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
        g.fillRect(50, 50, 200, 100);
        JButton forest = new JButton("Forest");
        forest.setBounds(60, 60, 180, 80);
        add(forest);
        TravelF For = new TravelF();
        forest.addActionListener(For);
        //Cave
        g.setColor(new Color(100, 100, 100));
        g.fillRect(50, 175, 200, 100);
        JButton cave = new JButton("Cave");
        cave.setBounds(60, 185, 180, 80);
        add(cave);
        TravelCa Cav = new TravelCa();
        cave.addActionListener(Cav);
        //City
        g.setColor(new Color(142, 158, 104));
        g.fillRect(50, 300, 200, 100);
        JButton city = new JButton("City");
        city.setBounds(60, 310, 180, 80);
        add(city);
        TravelCi Cit = new TravelCi();
        city.addActionListener(Cit);
        //DeepForest
        g.setColor(new Color(16, 111, 16));
        g.fillRect(260, 50, 200, 100);
        JButton dfor = new JButton("Deep Forest");
        dfor.setBounds(270, 60, 180, 80);
        add(dfor);
        TravelDF DFor = new TravelDF();
        dfor.addActionListener(DFor);
        //Mountain
        g.setColor(new Color(180, 170, 170));
        g.fillRect(260, 175, 200, 100);
        JButton mount = new JButton("Mountain");
        mount.setBounds(270, 185, 180, 80);
        add(mount);
        TravelMo Mou = new TravelMo();
        mount.addActionListener(Mou);
        //DeepCave
        g.setColor(new Color(88, 88, 88));
        g.fillRect(260, 300, 200, 100);
        JButton dcav = new JButton("Deep Cave");
        dcav.setBounds(270, 310, 180, 80);
        add(dcav);
        TravelDC DCav = new TravelDC();
        dcav.addActionListener(DCav);
        //MountainTop
        g.setColor(new Color(150, 130, 130));
        g.fillRect(470, 50, 200, 100);
        JButton mounT = new JButton("Mountain Top");
        mounT.setBounds(480, 60, 180, 80);
        add(mounT);
        TravelMT MoT = new TravelMT();
        mounT.addActionListener(MoT);
        //Back
        JButton back = new JButton("Back");
        back.setBounds(50, 420, 100, 25);
        add(back);
        MenuFight Back = new MenuFight();
        back.addActionListener(Back);
        repaint();
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
    private class TravelF implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame fo = new JFrame("Forest");
            fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Forest only = new Forest();
            fo.add(only);
            fo.setSize(800, 500);
            fo.setVisible(true);
        }
    }
    private class TravelCa implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame ca = new JFrame("Cave");
            ca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Cave only = new Cave();
            ca.add(only);
            ca.setSize(800, 500);
            ca.setVisible(true);
        }
    }
    private class TravelCi implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame ci = new JFrame("City");
            ci.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            City only = new City();
            ci.add(only);
            ci.setSize(800, 500);
            ci.setVisible(true);
        }
    }
    private class TravelMo implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame mo = new JFrame("Mountain");
            mo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Mountain only = new Mountain();
            mo.add(only);
            mo.setSize(800, 500);
            mo.setVisible(true);
        }
    }
    private class TravelDC implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame dc = new JFrame("Deep Cave");
            dc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DeepCaves only = new DeepCaves();
            dc.add(only);
            dc.setSize(800, 500);
            dc.setVisible(true);
        }
    }
    private class TravelDF implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame df = new JFrame("Deep Forest");
            df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            DeepForest only = new DeepForest();
            df.add(only);
            df.setSize(800, 500);
            df.setVisible(true);
        }
    }
    private class TravelMT implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame mt = new JFrame("Mountain Top");
            mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MountainTop only = new MountainTop();
            mt.add(only);
            mt.setSize(800, 500);
            mt.setVisible(true);
        }
    }
}