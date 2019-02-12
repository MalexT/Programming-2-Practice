package primeri;

public class Test {

	public static void main(String[] args) {

		Grupa g = new Grupa();
		Osoba o = new Osoba();
		o.setIme("Aleksa");
		o.setPrezime("Markovic");
		Osoba p = new Osoba();
		p.setIme("Gordan");
		p.setPrezime("Markovic");
		Osoba q = new Osoba();
		q.setIme("Danica");
		q.setPrezime("Markovic");
		g.unosUListu(o);
		g.unosUListu(p);
		g.unosUListu(q);
//		g.ispis();
		g.serijalizacija();
//		g.ispis();
		g.deserijalizacija();
//		g.ispis();
		
	}

}
