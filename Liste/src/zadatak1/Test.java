package zadatak1;

public class Test {

	public static void main(String[] args) {

		Komisija k = new Komisija();
		
		ClanKomosije ck1 = new ClanKomosije();
		ck1.setImePrezime("Petar Petrovic");
		ck1.setFunkcija("predsednik");
		
		ClanKomosije ck2 = new ClanKomosije();
		
		ck2.setImePrezime("Marko Markovic");
		
		k.unosClana(ck1);
		k.unosClana(ck2);
		k.ispis();
		System.out.println();
		k.izbaciClana(ck2);
		k.ispis();
	}

}
