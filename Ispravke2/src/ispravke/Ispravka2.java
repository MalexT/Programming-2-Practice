package ispravke;

public class Ispravka2 {

	public static void ispisiKvadrat(String[] niz) {
		String prazno = "";
		int j = 0;
		System.out.println('*' + niz[0] + '*');
		while (j < niz[0].length()) {
			prazno = prazno + " ";
			j++;
		}
		for (int i = 0; i < niz[0].length(); i++)
			System.out.println(niz[1].charAt(i) + prazno + niz[2].charAt(i));

		System.out.println('*' + niz[3] + '*');
	}
}
