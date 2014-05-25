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



public class Gracz extends JPanel {
	
	BufferedImage ship;
	JPanel[] polaGracza = new JPanel[100];
	int[] polozeniePolaGracza = new int[100];
	boolean[] statkiGracza = new boolean[100];
	boolean[] zuzytePolaGracza = new boolean[100];
	
	
	
	public Gracz(){
		this.setBackground(new Color(204,204,255));
	}
	
	/*
	public Gracz(){
		
		super();	
	//	File shipImg = new File("/Users/mateuszlagod/Documents/workspace/Battleships/src/statek.jpg"); // mac
		File shipImg = new File("C:\\Users\\Mat\\Documents\\GitHub\\Battleships-beta\\bin\\statek.jpg"); // windows
		
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
		
		
	} */
	
}
	


