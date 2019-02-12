package zadatak4;

public class Test {

	public static void main(String[] args) {

		Racun r = new Racun();

		try {
			r.setBroj(-24);
		} catch (Exception e) {
			System.out.println("GRESKA " + e.getMessage());
		}
		r.setIznos(100.0);
		System.out.println(r);
	}
}
