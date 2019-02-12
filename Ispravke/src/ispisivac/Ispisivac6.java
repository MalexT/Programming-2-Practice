package ispisivac;

public class Ispisivac6 {

	public static void ispisiPiramidu() {
		int prazno = 4, nula = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=prazno + nula; j++)
				if (j <= prazno)
					System.out.print(' ');
				else
					System.out.print('0');
			System.out.println();
			prazno--;
			nula+=2;
		}
	}
}
