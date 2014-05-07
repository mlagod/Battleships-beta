import java.awt.Color;

import javax.swing.*;



public class Window {
	


	public void setup(){

		
	JFrame okno = new JFrame("Battleships");	
	JPanel board = new Board();

	board.setLayout(null);
	okno.add(board);
	

	okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	okno.setSize(640, 480);
	okno.setResizable(false);
	okno.setVisible(true);
	
	
	
	}
	
}
