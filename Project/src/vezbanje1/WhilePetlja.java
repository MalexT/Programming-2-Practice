package vezbanje1;

public class WhilePetlja {

	static int najmanjiNtiStepen(int broj) {
		int rez = 1;
		while (rez<broj) {
			rez *=2;
		}
		return rez;
	}
	
	static int maxNstepen(int broj) {
		int rez = 1;
		while((rez<broj) && (rez*2<broj))
			rez*=2;
		return rez;
	}
	
	static int minNStepen(int A, int B) {
		while ((A<B)) A = A*2;
		return A;
	}
	
	static int minStepen(int Broj) {
		int brojac = 1;
		int rez = 1;
		while(rez*brojac < Broj) {
			rez *=2;
			brojac++;
		}
		return brojac;
	}
	
	static void prvih10() {
		int i = 1;
		int brojDeljivih = 0;
		while (brojDeljivih<10) {
			if(i%9==0 && i%6==0) {
				System.out.println(i);
				brojDeljivih++;
			}
			i++;
		}
	}
	
	static void deljiviSa5ili6(int N) {
		int i = 1;
		int brojDeljivih = 0;
		while (brojDeljivih < N) {
			if(i%5==0 || i%6==0) {
				System.out.println(i);
				brojDeljivih++;
			}
			i++;
		}
	}
}
