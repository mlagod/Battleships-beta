import java.awt.Color;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class Rozgrywka {
	
	//Przeciwnik p = new Przeciwnik();
	boolean atakCpu[] = new boolean[100];
	

	

	
	private void zajmijPolaCzteroPoziomoGora(int pole, boolean zuzytePola[]){
		
		if(pole == 0){	
			for(int i = pole; i < 15; i++){
				zuzytePola[i]=true;	
				if(i == 4){
					i = 9;
				}	
			}	
		}else if(pole < 10){
			
			for(int i = pole-1; i < pole+15; i++){
				zuzytePola[i] = true;
				
				if(i == pole+4){  
					i = pole+8;
				}
			}
			
		}else if(pole == 90){
			
			for(int i = pole+4; i > 79; i--){
				zuzytePola[i] = true;
				
				if(i == 90){
					i=85;
				}
			}
			
		}else if(pole > 90){
			
			for(int i = pole+4; i > pole-12; i--){
				zuzytePola[i] = true;
				
				if(i == pole-1){
					i = pole-5;
				}
			}
		
		}else if(pole % 10 == 0){
			
			for(int i = pole-10; i < pole +15 ;i++){
				zuzytePola[i] = true;
				
				if(i == pole-6){
					i = pole-1;
				}
				if(i == pole+4){
					i = pole+9;
				}
			}
			
		}else{
			
			for(int i = pole-11; i < pole + 15; i++){
				zuzytePola[i] = true;
				
				if(i == pole-6){
					i= pole-2;
				}
				if(i == pole+4){
					i = pole+8;
				}
			}
		}
	}
	
	private void zajmijPolaCzteroPoziomoDol(int pole, boolean zuzytePola[]){
		
		if(pole == 9){
			
			for(int i = pole-4; i < 11; i++){
				zuzytePola[i] = true;
				
				if(i == 9){
					i = 5;
				}
			}
		}else if(pole < 10){
			
			for(int i = pole-4; i < pole+12; i++){
				zuzytePola[i] = true;
				
				if(i == pole+1){
					i = pole+5;
				}
			}
		}else if(pole == 99){
			
			for(int i = pole; i > pole - 15; i--){
				zuzytePola[i] = true;
				
				if(i == pole-4){
					i = pole-9;
				}
			}
		}else if(pole > 89){
			
			for(int i = pole +1; i > pole - 15;i--){
				zuzytePola[i] = true;
				
				if(i == pole-4){
					i = pole-8;
				}
			}
			
		}else if(pole % 10 == 9){
			
			for(int i = pole-14; i < pole+11; i++){
				zuzytePola[i] = true;
				
				if(i == pole-10){
					i = pole-5;
				}
				if(i == pole){
					i = pole+5;
				}
			}
			
		}else{
			
			for(int i = pole-14; i < pole+12; i++){
				zuzytePola[i] = true;
				
				if(i == pole-9){
					i = pole-5;
				}
				if(i == pole+1){
					i= pole+5;
				}
			}
		}
	}
	
	private void zajmijPolaCzteroPionowoGora(int pole, boolean zuzytePola[]){
		
		if(pole == 0){			
			for(int i = pole; i < 42; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}	
			
		}else if(pole ==9){
			for(int i = pole; i < 50; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i-1] = true;
			}
		
		}else if(pole < 10){
			for(int i = pole; i < pole+42; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1]= true;
			}
		
		}else if(pole % 10 == 0){
			for(int i = pole-10; i < pole+42; i+= 10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
			
		}else if(pole % 10 == 9){
			for(int i = pole-10; i< pole+41; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else{
			
			for(int i = pole-10; i < pole+42; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
						
			}
		}
	}
	
	private void zajmijPolaCzteroPionowoDol(int pole, boolean zuzytePola[]){
		
		if(pole == 90){
			
			for(int i = pole; i > 59; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole == 99){
		
			for(int i = pole; i > 57; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i-1] = true;
			}
		}else if(pole > 89){
			
			for(int i = pole; i > pole-42; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 0){
			
			for(int i = pole+10; i > pole-41; i-= 10){  
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
			
		}else if(pole % 10 == 9){
			
			for(int i = pole+10; i > pole-42;i-=10){
				zuzytePola[i] = true;
				zuzytePola[i-1] = true;
			}
		}else{
			
			for(int i = pole+10; i > pole-42; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}
	
	}
	//----------------- zajete pola trzymasztowcow 
	
	private void zajmijPolaTrzyPoziomLewo(int pole, boolean zuzytePola[]){
		
		if(pole == 0){
			for(int i = pole; i < 14; i++){
				zuzytePola[i] = true;
				
				if(i == 3){
					i = 9;
				}
			}
		}else if(pole < 10){
			for(int i = pole-1; i < pole+14; i++){
				zuzytePola[i] = true;
				if(i == pole+3){
					i = pole+8;
				}	
			}
		}else if(pole == 90){
			for(int i = pole+3; i > 79; i--){
				zuzytePola[i] = true;
				if(i == pole){
					i = pole-6;
				}
			}
		}else if(pole > 90){
			for(int i = pole+3; i > pole-12;i--){
				zuzytePola[i] = true;
				if(i == pole-1){
					i = pole-6;
				}
			}
		}else if(pole % 10 == 0){
			for(int i = pole-10; i < pole+14;i++){
				zuzytePola[i] = true;
				if(i == pole-7){
					i = pole-1;
				}
				if(i == pole+3){
					i = pole+9;				}
			}
		}else{
			for(int i = pole-11; i < pole+14;i++){
				zuzytePola[i] = true;
				if(i == pole-7){
					i = pole-2;
				}
				if(i == pole+3){
					i = pole+8;
				}
			}
		}
		
	}
	
	private void zajmijPolaTrzyPoziomPrawo(int pole, boolean zuzytePola[]){
		
		if(pole == 9){
			for(int i = pole-3; i < 20; i++){
				zuzytePola[i] = true;
				if(i == pole){
					i = 15;
				}
			}
		}else if(pole < 10){
			for(int i = pole-3; i < pole+12; i++){
				zuzytePola[i] = true;
				if(i == pole+1){
					i = pole+6;
				}
			}
		
		}else if(pole == 99){
			for(int i = pole; i > 85; i--){
				zuzytePola[i] = true;
				if(i == 96){
					i=90;
				}
			}
		}else if(pole > 89){
			for(int i = pole+1; i > pole-14; i--){
				zuzytePola[i] = true;
				if(i == pole-3){
					i = pole-8;
				}
			}
		}else if(pole % 10 == 9){
			for(int i = pole+10; i > pole-14; i--){
				zuzytePola[i] = true;
				if(i == pole+7){
					i = pole+1;
				}
				if(i == pole-3){
					i = pole-9;
				}
			}
		}else{
			for(int i = pole-13; i < pole+12; i++){
				zuzytePola[i] = true;
				if(i == pole-9){
					i = pole-4;
				}
				if(i == pole+1){
					i= pole+6;
				}
			}
		}
	}
	
	private void zajmijPolaTrzyPionGora(int pole, boolean zuzytePola[]){
		
		if(pole == 0){
			for(int i = pole; i < 32; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
				
			}
		}else if(pole == 9){
			for(int i = pole; i < 40; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else if(pole < 10){
			for(int i = pole; i < pole+32; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 0){
			for(int i = pole-10; i < pole+32; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 9){
			for(int i = pole - 10; i < pole+32; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else{
			for(int i = pole - 10; i < pole+32; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}
	}
	
	private void zajmijPolaTrzyPionDol(int pole, boolean zuzytePola[]){
		
		if(pole == 90){
			for(int i = pole; i > pole - 31; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole == 99){
			for(int i = pole; i > pole-32; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i-1] = true;
			}
		}else if(pole > 89){
			for(int i = pole; i > pole-32; i-=10){
				zuzytePola[i-1]= true;
				zuzytePola[i]= true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 0){
			for(int i = pole+10; i > pole-31; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 9){
			for(int i = pole+10; i > pole-32; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i-1] = true;
			}
		}else{
			for(int i = pole+10; i > pole - 32; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}
	}
	
	private void zajmijPolaDwuPoziomLewo(int pole, boolean zuzytePola[]){
		
		if(pole == 0){
			for(int i = pole; i < pole+13; i++){
				zuzytePola[i] = true;
				if(i == pole+2){
					i= pole+9;
				}
			}
		}else if(pole < 10){
			for(int i = pole-1; i < pole+13;i++){
				zuzytePola[i] = true;
				if(i == pole+2){
					i = pole+8;
				}
			}
		}else if(pole == 90){
			for(int i = pole+2; i > pole-11;i--){
				zuzytePola[i] = true;
				if(i == pole){
					i = pole-7;
				}
			}
		}else if(pole > 90){
			for(int i = pole+2; i > pole-12; i--){
				zuzytePola[i] = true;
				if(i == pole-1){
					i=pole-7;
				}
			}
		}else if(pole % 10 == 0){
			for(int i = pole-10; i < pole+13;i++){
				zuzytePola[i] = true;
				if(i == pole-8){
					i = pole-1;
				}
				if(i == pole+2){
					i = pole+9;
				}
			}
		}else{
			for(int i = pole-11; i < pole+13; i++){
				zuzytePola[i] = true;
				if(i == pole-8){
					i = pole-2;
				}
				if(i == pole+2){
					i = pole+8;
				}
			}
		}
	}
	
	private void zajmijPolaDwuPoziomPrawo(int pole, boolean zuzytePola[]){
		
		if( pole == 9){
			for(int i = pole-2; i < pole+11; i++){
				zuzytePola[i] = true;
				if(i == pole){
					i = pole-7;
				}
			}
		}else if( pole < 10){
			for(int i = pole-2; i < pole+12;i++){
				zuzytePola[i] = true;
				if(i == pole+1){
					i= pole+7;
				}
			}
		}else if(pole == 99){
			for(int i = pole; i > pole-13; i--){
				zuzytePola[i] = true;
				if(i == pole-2){
					i=pole-9;
				}
			}
		}else if(pole > 89){
			for(int i = pole+1; i > pole-13;i--){
				zuzytePola[i] = true;
				if(i == pole-2){
					i=pole-8;
				}
			}
		}else if(pole % 10 == 9){
			for(int i = pole+10; i > pole-13;i--){
				zuzytePola[i] = true;
				if(i == pole+8){
					i = pole+1;
				}
				if(i == pole-2){
					i = pole-9;
				}
			}
		}else{
			for(int i = pole-12; i < pole+12;i++){
				zuzytePola[i] = true;
				if(i == pole-9){
					i = pole-3;
				}
				if(i == pole+1){
					i = pole+7;
				}
			}
		}
	}
	
	private void zajmijPolaDwuPionGora(int pole, boolean zuzytePola[]){
		
		if(pole == 0){
			for(int i = pole; i < pole+22;i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole == 9){
			for(int i = pole; i < pole+21;i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else if(pole < 10){
			for(int i = pole; i < pole+22;i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if( pole % 10 == 0){
			for(int i = pole-10; i < pole+22; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 9){
			for(int i = pole-10; i < pole+21; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else{
			for(int i = pole-10; i < pole+22; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}
	}
	
	private void zajmijPolaDwuPionDol(int pole, boolean zuzytePola[]){
		
		if( pole == 90){
			for(int i = pole; i > pole-21; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole == 99){
			for(int i = pole; i > pole-22; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i-1] = true;
			}
		}else if(pole > 89){
			for(int i = pole; i > pole-22; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 0){
			for(int i = pole+10; i > pole-21; i-= 10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 9){
			for(int i = pole+10; i > pole-22; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else{
			for(int i = pole+10; i > pole-22; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}
	}
	
	private void zajmijPolaJednomasztowiec(int pole, boolean zuzytePola[]){
		
		if(pole == 0){
			for(int i = pole; i < pole +12; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole == 9){
			for(int i = pole; i < pole+11; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else if(pole == 90){
			for(int i = pole; i > pole-11; i-=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole == 99){
			for(int i = pole; i > pole-12; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else if(pole < 10){
			for(int i = pole; i < pole+12; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole > 89){
			for( int i = pole; i > pole-12; i-=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 0){
			for(int i = pole-10; i < pole+12; i+=10){
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}else if(pole % 10 == 9){
			for(int i = pole-10; i < pole+11; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
			}
		}else{
			for(int i = pole-10; i < pole+12; i+=10){
				zuzytePola[i-1] = true;
				zuzytePola[i] = true;
				zuzytePola[i+1] = true;
			}
		}
	}
	
	public void ustawStatki(boolean[] czyJestStatek, boolean zuzytePola[]){
	
		boolean poziom;
		boolean pion;
		
		Random r = new Random(); 
		
		// czteromasztowiec--------------------------------------------------------------------------------
		// losowanie kierunku
		
		int kierunek = r.nextInt(20);
		
		if(kierunek % 2 == 0){
			poziom = true;
			pion = false;
		}else{
			poziom = false;
			pion = true;
		}
		
		// losowanie pola poczatku
		
		int pole = r.nextInt(100);
		

		//jezeli kierunek poziomy
		if(poziom = true && pion == false){
		
		if(pole % 10 == 0 || pole % 10 == 1 || pole % 10 == 2 || pole % 10 == 3){
		
			czyJestStatek[pole] = true;
			czyJestStatek[pole+1] = true;
			czyJestStatek[pole+2] = true;
			czyJestStatek[pole+3] = true;
		
			this.zajmijPolaCzteroPoziomoGora(pole, zuzytePola);
			
		}else{
		
			czyJestStatek[pole] = true;
			czyJestStatek[pole-1] = true;
			czyJestStatek[pole-2] = true;
			czyJestStatek[pole-3] = true;
			
			this.zajmijPolaCzteroPoziomoDol(pole, zuzytePola);
		}
		
		}
		//jezeli kierunek pionowy
		
		if(poziom == false && pion == true){
			
			if(pole < 40){
				
				czyJestStatek[pole] = true;
				czyJestStatek[pole+10] = true;
				czyJestStatek[pole+20] = true;
				czyJestStatek[pole+30] = true;
				
				//--------------------- zajete pola
				this.zajmijPolaCzteroPionowoGora(pole, zuzytePola);
			
			}else{
				
				czyJestStatek[pole] = true;
				czyJestStatek[pole-10] = true;
				czyJestStatek[pole-20] = true;
				czyJestStatek[pole-30] = true;
				
				this.zajmijPolaCzteroPionowoDol(pole, zuzytePola);

			}
		}
		
		// 2 trzymasztowce -----------------------------------------------------------------------------
	
		System.out.println("#dbg4 : " + pole);
		
		int liczbaTrzymasztowcow = 0;
		
		while(liczbaTrzymasztowcow < 2){
		
		kierunek = r.nextInt(20);
		
		if(kierunek % 2 == 0){
			poziom = true;
			pion = false;
		}else{
			poziom = false;
			pion = true;
		}
		
		// losowanie pola poczatku
		
	     pole = r.nextInt(100); 
	     System.out.println("dbg 3." + liczbaTrzymasztowcow + " : " + pole);
	     //jezeli kierunek poziomy
	     if(poziom == true && pion == false){
	    	 
	    	 if(pole % 10 == 0 || pole % 10 == 1 || pole % 10 == 2){ // lewa strona planszy
	    		 
	    		 if(zuzytePola[pole] == true || zuzytePola[pole+1] == true || zuzytePola[pole+2] == true){
	    			 continue;
	    		 }else{
	    			 czyJestStatek[pole] = true;
	    			 czyJestStatek[pole+1] = true;
	    			 czyJestStatek[pole+2] = true;
	    			 
	    			this.zajmijPolaTrzyPoziomLewo(pole, zuzytePola);
	    			
	    			 liczbaTrzymasztowcow++;
	    		 }
	    	 }else{ // prawa strona planszy
	    		 
	    		 if(zuzytePola[pole] == true || zuzytePola[pole-1] == true || zuzytePola[pole-2] == true){
	    			 continue;
	    		 }else{
	    			 czyJestStatek[pole] = true;
	    			 czyJestStatek[pole-1] = true;
	    			 czyJestStatek[pole-2] = true;
	    			 
	    			 //  zajete pola trzymasztowca poziomo prawo
	    			 this.zajmijPolaTrzyPoziomPrawo(pole, zuzytePola);
	    			 
	    			 liczbaTrzymasztowcow++;
	    		 }
	    	 }
	     }
		 // jezeli kierunek pionowy
	     if(poziom == false && pion == true){
	    	 
	    	 if(pole < 30){ // dodawanie w dol
	    		 
	    		 if(zuzytePola[pole] == true || zuzytePola[pole+10] == true || zuzytePola[pole+20] == true){
	    			 continue;
	    		 }else{
	    			 czyJestStatek[pole] = true;
	    			 czyJestStatek[pole+10] = true;
	    			 czyJestStatek[pole+20] = true;
	    			 
	    			 //zajete pola trzymasztowca pionowo gora
	    			 this.zajmijPolaTrzyPionGora(pole, zuzytePola);
	    			 
	    			 liczbaTrzymasztowcow++;
	    		 }
	    	 }else{ // dodawanie w gore
	    		 
	    		 if(zuzytePola[pole] == true || zuzytePola[pole-10] == true || zuzytePola[pole-20] == true){
	    			 continue;
	    		 }else{
	    			 czyJestStatek[pole] = true;
	    			 czyJestStatek[pole-10] = true;
	    			 czyJestStatek[pole-20] = true;
	    			 
	    			 //todo: zajete pola trzymasztowca pionowo dol
	    			 this.zajmijPolaTrzyPionDol(pole, zuzytePola);
	    			 
	    			 liczbaTrzymasztowcow++;
	    		 }
	    	 }
	     }
	     
		} // koniec while trzymasztowcow 
		
		//----------------- trzy dwumasztowce
		
		int liczbaDwumasztowcow = 0;
		
		while(liczbaDwumasztowcow < 3){
			
			kierunek = r.nextInt(20);
			
			if(kierunek % 2 == 0){
				poziom = true;
				pion = false;
			}else{
				poziom = false;
				pion = true;
			}
			
			pole = r.nextInt(100); // losowanie nowego pola
		     System.out.println("dbg 2." + liczbaDwumasztowcow + " : " + pole);
		     
		     if(poziom == true && pion == false){ // kierunek poziomy
		    	 
		    	 if(pole % 10 == 0 || pole % 10 == 1){ // lewa strona planszy
		    		 
		    		 if(zuzytePola[pole] == true || zuzytePola[pole+1] == true){
		    			 continue;
		    			 
		    		 }else{
		    			 czyJestStatek[pole] = true;
		    			 czyJestStatek[pole+1] = true;
		    			 
		    			 // zuzyte pola dwumasztowiec poziomo lewo
		    			 this.zajmijPolaDwuPoziomLewo(pole, zuzytePola);
		    			 
		    			 liczbaDwumasztowcow++;
		    		 }
		    	 }else{		// prawa strona planszy
		    		 
		    		 if(zuzytePola[pole] == true || zuzytePola[pole-1] == true){
		    			 continue;
		    			 
		    		 }else{
		    			 
		    			 czyJestStatek[pole] = true;
		    			 czyJestStatek[pole-1] = true;
		    			 
		    			 // zuzyte pola dwumasztowiec poziom prawo
		    			 this.zajmijPolaDwuPoziomPrawo(pole, zuzytePola);
		    			 
		    			 liczbaDwumasztowcow++;
		    		 }
		    	 }
		     }
		     
		     //kierunek pionowy
		     if(poziom == false && pion == true){
		    	 
		    	 if(pole < 20){
		    		 
		    		 if(zuzytePola[pole] == true || zuzytePola[pole+10] == true){
		    			 continue;
		    		 }else{
		    			 czyJestStatek[pole] = true;
		    			 czyJestStatek[pole+10] = true;
		    			 
		    			 // zuzyte pola dwumasztowiec pion gora
		    			 this.zajmijPolaDwuPionGora(pole, zuzytePola);
		    			 
		    			 liczbaDwumasztowcow++;
		    		 }
		    	 }else{
		    		 
		    		 if(zuzytePola[pole] == true || zuzytePola[pole-10] == true){
		    			 continue;
		    		 }else{
		    			 czyJestStatek[pole] = true;
		    			 czyJestStatek[pole-10] = true;
		    			 
		    			 // zuzyte pola dwumasztowiec pion dol
		    			 this.zajmijPolaDwuPionDol(pole, zuzytePola);
		    			 
		    			 liczbaDwumasztowcow++;
		    		 }
		    	 }
		     }
		}// koniec while dwumasztowcow
		
		//--------------------------dodawanie 4 jednomasztowcow
		int liczbaJednomasztowcow = 0;
		
		while(liczbaJednomasztowcow < 4){
			
			pole = r.nextInt(100); // losowanie nowego pola
		     System.out.println("dbg 1." + liczbaJednomasztowcow + " : " + pole);
		     
		    if(zuzytePola[pole] == true){
		    	continue;
		    }else{
		    	czyJestStatek[pole] = true;
		    	// zuzyte pola jednomasztowca
		    	this.zajmijPolaJednomasztowiec(pole, zuzytePola);
		    	
		    	liczbaJednomasztowcow++;
		    }
			
		} // koniec while jednomasztowcow
		
		
	}
	
	public void cpuMove(boolean statkiGracza[], JPanel polaGracza[], boolean statkiGraczaZabite[]){
		
		Random r = new Random();
		
		int strzal = 0;
		
		boolean oddanoStrzal = false;
		
		while(oddanoStrzal == false){
			
			 strzal = r.nextInt(100);
			
			if(atakCpu[strzal] == true){
				continue;
			}else{
				atakCpu[strzal] = true;
				oddanoStrzal = true;
			}
		}
		
		if(statkiGracza[strzal] == true){	// trafil
		
		int kierunekStrzalu = r.nextInt(20);
	
		if(kierunekStrzalu % 2 == 0){	//kierunek poziomy
			
			while(statkiGracza[strzal] == true){
				
				polaGracza[strzal].setBackground(Color.red);
				statkiGraczaZabite[strzal] = false; //opcja
				
				System.out.println("#dbg: komputer, poziom - trafiony, pole: " + strzal);
			
				
				if(strzal < 99){
					strzal++;
				}else{
					strzal--;
				}
			}
			
			if(statkiGracza[strzal] == false){
				polaGracza[strzal].setBackground(new Color(153,255,0));
				System.out.println("#dbg: komputer - pudlo po ataku poziomym, pole:" + strzal);
			}
			
		}else{	// kierunek pionowy
			
			while(statkiGracza[strzal] == true){
				polaGracza[strzal].setBackground(Color.red);
				statkiGraczaZabite[strzal] = false;	//opcja
				System.out.println("#dbg: komputer, pion - trafiony, pole: " + strzal);
				
		
				if(strzal < 90){
					strzal+=10;
				}else{
					strzal-=10;
				}
			}
			
			if(statkiGracza[strzal] == false){
				polaGracza[strzal].setBackground(new Color(153,255,0));
				System.out.println("#dbg: komputer - pudlo po ataku poziomym, pole:" + strzal);
			}
			
		}
		}else{		//nie trafil
			
			polaGracza[strzal].setBackground(new Color(153,255,0));
			System.out.println("#dbg: komputer - pudlo, pole:" + strzal);
			
		}
	}

	public void koniecGry(boolean[] tablicaStatkowGracza,boolean[] tablicaStatkowPrzeciwnika){
		
		boolean czyWszystkieZabite = true;
		Popup p = new Popup();
		
		for(int i = 0; i < 100; i++){
			
			if(tablicaStatkowGracza[i] == true){
				
				czyWszystkieZabite = false;
			}
		}
		
		if(czyWszystkieZabite == true){
			
			p.wynik = new JLabel("Przegra³eœ :(");
			p.pop();
		}
		
		for(int i = 0; i < 100; i++){
			
			if(tablicaStatkowPrzeciwnika[i] == true){
				
				czyWszystkieZabite = false;
			}
		}
		
		if(czyWszystkieZabite == true){
			
			p.wynik = new JLabel("Wygrales !!! :)");
			p.pop();
		}
	}
	
}
