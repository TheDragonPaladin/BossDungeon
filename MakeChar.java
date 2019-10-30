import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MakeChar extends JPanel{
    public Player doe = new Player(50,10,10);
    public JLabel strength = new JLabel();
    public JLabel intelligence = new JLabel();
    public JLabel health = new JLabel();
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        //Health
        JPanel hp = new JPanel();
        hp.setBounds(300, 75, 200, 75);
        hp.setBackground(Color.GREEN);
            JButton pohp = new JButton("+");
            hp.add(pohp);
            pohp.setVisible(true);
            JButton nehp = new JButton("-");
            hp.add(nehp);
            nehp.setVisible(true);
            health.setText(""+doe.getHp());
            hp.add(health);
            health.setVisible(true);
        add(hp);
        hp.setVisible(true);
        //Strength
        JPanel st = new JPanel();
        st.setBackground(Color.RED);
        st.setBounds(125, 225, 200, 75);
            JButton post = new JButton("+");
            st.add(post);
            post.setVisible(true);
            JButton nest = new JButton("-");
            st.add(nest);
            nest.setVisible(true);;
            strength.setText(""+doe.getSt());
            st.add(strength);
            strength.setVisible(true);
        add(st);
        st.setVisible(true);
        //Intelligence
        JPanel in = new JPanel();
        in.setBackground(Color.BLUE);
        in.setBounds(475, 225, 200, 75);
            JButton poin = new JButton("+");
            in.add(poin);
            poin.setVisible(true);
            JButton nein = new JButton("-");
            in.add(nein);
            nein.setVisible(true);
            intelligence.setText(""+doe.getIn());
            in.add(intelligence);
            intelligence.setVisible(true);
        add(in);
        in.setVisible(true);
        //Prepare player
        Singleton.setInstance(doe);
        //Finish
        JButton start = new JButton("Done");
        start.setBounds(350, 175, 100, 25);
        add(start);
        Begin welcome = new Begin();
        start.addActionListener(welcome);
    }
    private class Begin implements ActionListener{
        public void actionPerformed(ActionEvent y){
            JFrame sta = new JFrame("MainMenu");
            sta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MainMenu begin = new MainMenu();
            sta.add(begin);
            sta.setSize(800, 500);
            sta.setVisible(true);
                }  
    }
    private class POHP implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.changeHp(1);
            health.setText(""+doe.getHp());
            removeAll();
            repaint();
                }  
    }
    private class NEHP implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.changeHp(-1);
            health.setText(""+doe.getHp());
            removeAll();
            repaint();
                }  
    }
    private class POST implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.changeSt(1);
            strength.setText(""+doe.getSt());
            removeAll();
            repaint();
                }  
    }
    private class NEST implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.changeSt(-1);
            strength.setText(""+doe.getSt());
            removeAll();
            repaint();
                }  
    }
    private class POIN implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.changeIn(1);
            intelligence.setText(""+doe.getIn());
            removeAll();
            repaint();
                }  
    }
    private class NEIN implements ActionListener{
        public void actionPerformed(ActionEvent y){
            doe.changeIn(-1);
            intelligence.setText(""+doe.getIn());
            removeAll();
            repaint();
                }  
    }
}