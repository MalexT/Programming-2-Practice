package ispravke;

import java.util.List;

public class Ispravka1 {

	public static void ispisiParalelogram(List<String> lista) {
		System.out.println("*" + lista.get(0) + "*");
		String s = " ";
		for (int i = 0; i < lista.get(0).length(); i++) {
			System.out.print(s + lista.get(1).charAt(i));
			for (int j = 0; j < lista.get(0).length(); j++)
				System.out.print(" ");
			System.out.println(lista.get(2).charAt(i));
			s = s + " ";

		}
		System.out.println(s + "*" + lista.get(3) + "*");
	}
}
