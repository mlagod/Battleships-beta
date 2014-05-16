import java.util.Random;


public class Rozgrywka {
	
	Przeciwnik p = new Przeciwnik();
	boolean[] czyJestStatek = new boolean[100];
	
	boolean[] zuzytePola = new boolean[100];
	
	public void ustawStatki(){
		
	
		
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
			
			//statek w pierwszym wierszu, pola, w ktorych nie moze stac nic innego
			//----
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
				
				for(int i = pole+4; pole > pole-12; i--){
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
			//-----
		}else{
		
			czyJestStatek[pole] = true;
			czyJestStatek[pole-1] = true;
			czyJestStatek[pole-2] = true;
			czyJestStatek[pole-3] = true;
			
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
		
		}
		//jezeli kierunek pionowy
		
		if(poziom == false && pion == true){
			
			if(pole < 30){
				
				czyJestStatek[pole] = true;
				czyJestStatek[pole+10] = true;
				czyJestStatek[pole+20] = true;
				czyJestStatek[pole+30] = true;
				
				//--------------------- zajete pola
				
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
				
			}else{
				
				czyJestStatek[pole] = true;
				czyJestStatek[pole-10] = true;
				czyJestStatek[pole-20] = true;
				czyJestStatek[pole-30] = true;
				
				//-----------
				//zuzyte pola
				
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
					
					for(int i = pole+10; i > pole-42;i-=10){
						zuzytePola[i-1] = true;
						zuzytePola[i] = true;
						zuzytePola[i+1] = true;
					}
				}
			
			
			}
		}
		
	/*	// 2 trzymasztowce -----------------------------------------------------------------------------
		//losowanie kierunku
		kierunek = r.nextInt(20);
		
		if(kierunek % 2 == 0){
			poziom = true;
			pion = false;
		}else{
			poziom = false;
			pion = true;
		}
		
		// losowanie pola poczatku
		
	     pole = r.nextInt(100); */
		
		System.out.println(pole);
	}

}
