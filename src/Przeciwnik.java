import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Przeciwnik extends JPanel {
	
	JPanel[] polaPrzeciwnika = new JPanel[100];
	int[] polozeniePolaPrzeciwnika = new int[100];
	public Color c = new Color(0,179,0);
	Color traf = new Color(179,0,0);
	
	
	public void changeColor(){
		c = traf;
		
	}
	
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(c);
		g2d.fillRect(0, 0, 24, 24);
		
		
		
	
	}
	

}
