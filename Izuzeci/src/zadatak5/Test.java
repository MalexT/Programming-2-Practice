package zadatak5;

public class Test {

	public static void main(String[] args) {

		Proizvod p = new Proizvod();

		try {
			p.setSifra(12);
		} catch (ProizvodException e) {
			System.out.println("GRESKA " + e.getMessage());
		}

		try {
			p.setCena(500);
		} catch (ProizvodException e) {
			System.out.println("GRESKA " + e.getMessage());

		}

		try {
			p.setNaziv(null);
		} catch (ProizvodException e) {
			System.out.println("GRESKA " + e.getMessage());
		}
		System.out.println(p);
	}
}
