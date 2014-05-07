import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class Board extends JPanel implements MouseListener {
	
	int panelCounter = 0;
	Ships ships =  new Ships();
	
	String[] letters = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J"};
	String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	

	
	
	
	
	
	Board(){
		
		
		for(int j = 0; j < 10; j++){
			
			for(int i = 0; i < 10; i++){
				
				ships.polaGracza[panelCounter]=new Ships();	
				ships.polaPrzeciwnika[panelCounter] = new Ships();
				
				//przypisanie numerow pol do tablicy
				ships.polozeniePolaGracza[panelCounter] = panelCounter;
				ships.polozeniePolaPrzeciwnika[panelCounter] = panelCounter;
				
				ships.czyJestStatek[panelCounter] = true;
				
		        ships.polaGracza[panelCounter].setBounds(32+25*i,32+25*j,22,22);
		        ships.polaPrzeciwnika[panelCounter].setBounds(322+25*i,32+25*j,22,22);
		        
		       // ships.polaGracz[panelCounter].repaint();
		       
		        ships.polaPrzeciwnika[panelCounter].setOpaque(false);
		        
		        add(ships.polaGracza[panelCounter]);
		        add(ships.polaPrzeciwnika[panelCounter]);
		        
		      
		        
		        
		        panelCounter++;
			}
		}
		
		
	}
	
	
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Color background = new Color(0,179,255);
		setBackground(background);
		
		
		
		
			// Rysowanie planszy
		
			for(int i = 30; i < 280; i+=25){
			
				for(int j = 30; j < 280; j+=25){
				
					g2d.drawRect(j,i,25,25);
					
					// g2d.drawImage(ships.ship,i,j,ships);
			
				
			}
		}
			///////////////
			
			 
		
		for(int i = 30; i < 280; i+=25){
			
			for(int j = 320; j < 570; j+=25)
				
				g2d.drawRect(j, i, 25, 25);
		}

		
		// Rysowanie liter przy planszy
		
		int pozycjaLiteryA = 40;
		int pozycjaliteryB = 330;
		
		for(int i = 0; i < 10; i++){
			
			g2d.drawString(letters[i], pozycjaLiteryA, 25);
			g2d.drawString(letters[i], pozycjaliteryB, 25);
			
			pozycjaLiteryA += 25;
			pozycjaliteryB += 25;
			
		}
		
		// Rysowanie numerkow przy planszy
		
		int pozycjaNum = 47;
		
		
		for(int i = 0; i < 10; i++){
			
			g2d.drawString(numbers[i], 15, pozycjaNum);
			g2d.drawString(numbers[i], 305, pozycjaNum);
			
			pozycjaNum += 25;
			
		}
		
		 for(int i=0; i<100; i++){
		       ships.polaGracza[i].addMouseListener(this);
		       ships.polaPrzeciwnika[i].addMouseListener(this);
		 }
		
	}

	


	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		Object o = e.getSource();
		
		for(int i = 0; i < 100; i++){
			
			if(o == ships.polaPrzeciwnika[i]){
				
				
				System.out.println("Atak na pole " + ships.polozeniePolaPrzeciwnika[i]);
				if(ships.czyJestStatek[i] == true){
					
					System.out.println("Trafiony !");
				}else{
					System.out.println("Pudlo !");
				}
			}
		
		}
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		
	
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
