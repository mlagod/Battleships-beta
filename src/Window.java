import java.awt.Color;

import javax.swing.*;

/**
 * 
 * @author Mat
 * 
 * Klasa tworzaca okno gry
 *
 */

public class Window {
	
JFrame okno;

	public void setup(){

		
	 okno = new JFrame("Battleships");	
	JPanel board = new Board();

	board.setLayout(null);
	okno.add(board);
	

	okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	okno.setSize(620, 400);
	okno.setResizable(false);
	okno.setVisible(true);
	
	
	
	}
	
}
