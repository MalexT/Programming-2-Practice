package ispisivac;

public class Ispisivac {

	public static void ispisiVertikalno(String[] niz) {
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < niz.length) {
				if (i < niz[j].length())
					System.out.print(niz[j].charAt(i));
				else
					System.out.print(" ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
