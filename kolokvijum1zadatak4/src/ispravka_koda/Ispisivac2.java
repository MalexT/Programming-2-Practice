package ispravka_koda;

public class Ispisivac2 {

	static void ispisiTrougao() {
		int i=5;
		while (i>=1){
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}
				System.out.println();
				i--;
		    }	
	}
	
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
	
	static void ispisiPiramidu() {
		int prazno=4, nula = 1;
		for (int i = 1; i <= 5; i++){
			for (int j=1;j<=prazno+nula;j++)
				if (j<=prazno)
					System.out.print(' ');
				else 
					System.out.print('0');
			System.out.println();
			prazno--;nula+=2;
		}
	   }
	
	static void ispisiTrougao1(){
		for (int i=1; i<=5; i++) {
			int j=1;
			while (j<=i) {
				j++;
				System.out.print('*');
			}
			System.out.println();
		}							
	}
	
	
}
