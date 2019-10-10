import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StartPage extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.RED);
		g.fillRect(175, 200, 400, 100);
		g.setColor(Color.WHITE);
		g.fillRect(200, 210, 350, 80);
		JButton start = new JButton("Boss Dungeon Reborn");
		start.setBounds(220, 225, 300, 50);
		add(start);
		Thing welcome = new Thing();
		start.addActionListener(welcome);
	}
	private class Thing implements ActionListener{
		public void actionPerformed(ActionEvent y){
   		        JFrame sta = new JFrame("MakeCharacter");
			sta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			MakeChar begin = new MakeChar();
			sta.add(begin);
			sta.setSize(800, 500);
			sta.setVisible(true);
                }  
	}
}