import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * 
 * @author Mat
 *
 *Klasa wyswietlajaca popup z wynikiem gry
 */

public class Popup implements ActionListener {

	public JLabel wynik;
	
	public void pop(){
		
		JFrame f = new JFrame("Koniec");
		JLabel l = new JLabel("Koniec gry.");
		
		JButton b = new JButton("Jeszcze raz");
		JPanel p = new JPanel();
		
		
		p.add(l);
		p.add(wynik);
		p.add(b);
		
		p.setVisible(true);
		f.add(p);
		
		
		f.setSize(200,100);
		f.setVisible(true);
		
		b.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Window w = new Window();
		w.setup();
		
	}
}
