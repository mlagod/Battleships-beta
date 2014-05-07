import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;



public class Ships extends JPanel {
	
	BufferedImage ship;
	JPanel[] polaGracza = new JPanel[100];
	JPanel[] polaPrzeciwnika = new JPanel[100];
	
	int[] polozeniePolaGracza = new int[100];
	int[] polozeniePolaPrzeciwnika = new int[100];
	
	boolean[] czyJestStatek = new boolean[100];
	
	
	public Ships(){
		
		super();	
		File shipImg = new File("/Users/mateuszlagod/Documents/workspace/Battleships/src/statek.jpg");
		
		
		try{
			ship = ImageIO.read(shipImg);
			
		}catch (IOException e) {
			
			System.err.println("Nie mozna otworzyc obrazka");
			e.printStackTrace();
		}
		
		Dimension dimension = new Dimension(ship.getWidth(), ship.getHeight());
		setPreferredSize(dimension);
	}
	
	
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
	//	g2d.setBackground(Color.red);
		g2d.drawImage(ship,0,0,this);
		
		
	}
	
	
	public void setShips(){
		
		// Statki rozmieszczone "na sztywno"
		
		
		
		
		
	}
		
}
	


