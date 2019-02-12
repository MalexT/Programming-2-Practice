package zadatak1;

public class TestGeometrijskihTela {

	public static void main(String[] args) {

		Kocka k = new Kocka();
		Kvadar kv = new Kvadar();
		k.setDuzinaStranice(25.5);
		kv.setDuzina(20);
		kv.setSirina(10);
		kv.setVisina(30);
		
		System.out.println("Kocka");
		System.out.println("Povrsina: "+ k.getPovrsina());
		System.out.println("Zapremina: "+ k.getZapremina());
		System.out.println();
		System.out.println("Kvadar");
		System.out.println("Povrsina: "+ kv.getPovrsina());
		System.out.println("Zapremina: "+ kv.getZapremina());
	}

}
