package zadatak2.ispravka_koda;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> lista	= new LinkedList<>();
		lista.add("BELO");	
		lista.add("CRNO");
		lista.add("ZUTO");
		lista.add("SIVO");
		
		StringIspisivac.ispisiParalelogram(lista);
	}

}
