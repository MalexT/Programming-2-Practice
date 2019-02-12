package ispravka_koda;

public class Ispisivac3 {

	static void ispisiKvadrat() {
		  int i=1;
		  while(i <= 25){
			if (i<6 || i>21 || i%5==1 || i%5==0) 
				System.out.print('0');
			else 
				System.out.print(' ');
			if (i%5==0) 
				System.out.println();
			i++;
		}
	  }
}
