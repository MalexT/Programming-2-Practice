package zadatak2;

public class Test {

	public static void main(String[] args) {

		Biblioteka b = new Biblioteka();
		
		b.unosKnjige1();
		b.unosKnjige1();
		b.unosKnjige1();
		b.serijalizuj();
		b.ispisi();
		System.out.println("+++++++++++++++++++++");
		b.deserijalizuj();
		b.ispisi();
	}

}
