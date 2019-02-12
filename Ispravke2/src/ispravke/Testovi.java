package ispravke;

import java.util.LinkedList;
import java.util.List;

public class Testovi {

	public static void main(String[] args) {
		
		List<String> lista = new LinkedList<>();
		
		lista.add("Pera");
		lista.add("Mika");
		lista.add("Zika");
		lista.add("Pera");
		lista.add("Pera");
		
//		Ispravka1.ispisiParalelogram(lista);
		
		String[] niz = {"BELO", "CRNO", "ZUTO", "SIVO"};
		
//		Ispravka2.ispisiKvadrat(niz);
//		Ispravka3.izbaciDuplikate(lista);
		UpisivanjeUTXTFajl.upisiProsteBrojeve();
		
	}
}
