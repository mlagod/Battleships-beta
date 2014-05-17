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
	Gracz gracz =  new Gracz();
	Przeciwnik przeciwnik = new Przeciwnik();
	Rozgrywka rozgrywka = new Rozgrywka();
	
	String[] letters = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J"};
	String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	

	Board(){
		
		for(int j = 0; j < 10; j++){
			
			for(int i = 0; i < 10; i++){
				
				
				// pola gracza wypelnione statkami, przeciwnika PustePola
				gracz.polaGracza[panelCounter]=new Gracz();	
				przeciwnik.polaPrzeciwnika[panelCounter] = new Przeciwnik();
				
				//przypisanie numerow pol do tablicy
				gracz.polozeniePolaGracza[panelCounter] = panelCounter;
				przeciwnik.polozeniePolaPrzeciwnika[panelCounter] = panelCounter;
				
			// todo: rozgrywka
				
				
		        gracz.polaGracza[panelCounter].setBounds(32+25*i,32+25*j,22,22);
		        przeciwnik.polaPrzeciwnika[panelCounter].setBounds(322+25*i,32+25*j,22,22);
		        
		     
		        add(gracz.polaGracza[panelCounter]);
		        add(przeciwnik.polaPrzeciwnika[panelCounter]);
		      
		        panelCounter++;
			}
		}
		rozgrywka.ustawStatki();
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
			
			}
		}
			
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
		       gracz.polaGracza[i].addMouseListener(this);
		       przeciwnik.polaPrzeciwnika[i].addMouseListener(this);
		 }
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		Object o = e.getSource();
		
		for(int i = 0; i < 100; i++){
			
			if(o == przeciwnik.polaPrzeciwnika[i]){
				
				
				System.out.println("Atak na pole " + przeciwnik.polozeniePolaPrzeciwnika[i]);
				if(rozgrywka.czyJestStatek[i] == true){
					
					System.out.println("Trafiony !");
				
					//przeciwnik.polaPrzeciwnika[i].repaint();
					przeciwnik.c = new Color(179,0,0);
					
				}else{
					System.out.println("Pudlo !");
				}
				
				if(rozgrywka.zuzytePola[i] == true){
					
					System.out.println("TEST: Zuzyte pole");
				}else{
					System.out.println("TEST: Wolne");
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
