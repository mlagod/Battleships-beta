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

/**
 * 
 * @author Mat
 * 
 * Klasa przechowujaca wszystkie elementy gracza
 *
 */

public class Gracz extends JPanel {
	
	BufferedImage ship;
	JPanel[] polaGracza = new JPanel[100];
	int[] polozeniePolaGracza = new int[100];
	boolean[] statkiGracza = new boolean[100];
	boolean[] zuzytePolaGracza = new boolean[100];
	boolean[] statkiGraczaZabite = new boolean[100];
	
	
	
	public Gracz(){
		this.setBackground(new Color(204,204,255));
	}

	
}
	


