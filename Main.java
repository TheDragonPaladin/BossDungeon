import javax.swing.*;
public class Main {
	public static void main(String[] args){
 	  JFrame a = new JFrame("Boss Dungeon Reborn");
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartPage b = new StartPage();
		a.add(b);
		a.setSize(800, 500);
		a.setVisible(true);
	}
}