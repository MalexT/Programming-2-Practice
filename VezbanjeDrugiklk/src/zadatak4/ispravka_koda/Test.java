package zadatak4.ispravka_koda;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> lista = new LinkedList<>();
		
		lista.add("Pera");
		lista.add("Mika");
		lista.add("Zika");
		lista.add("Pera");
		lista.add("Pera");
		lista.add("Mika");
		lista.add("Zika");
		lista.add("Mika");
		lista.add("Zika");
		lista.add("Pera");
		lista.add("Mika");
		lista.add("Zika");
		lista.add("Pera");
		lista.add("Pera");
		lista.add("Mika");
		lista.add("Zika");
		lista.add("Mika");
		lista.add("Zika");
		
		
		StringOperacije.izbaciDuplikate(lista);
	}
}
