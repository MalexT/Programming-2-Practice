package zadatak2;

public class Test {

	public static void main(String[] args) {
		
		IspitnaLsita il = new IspitnaLsita();
		
		Student s1 = new Student();
		s1.setBrojIndeksa("0123/2018");
		s1.setIme("Marina");
		s1.setPrezime("Marinovic");
		s1.setOcena(9);
		Student s2 = new Student();
		s2.setBrojIndeksa("0101/2013");
		s2.setIme("Djordje");
		s2.setPrezime("Djordjevic");
		s2.setOcena(7);
		Student s3 = new Student();
		s3.setBrojIndeksa("0021/2019");
		s3.setIme("Jovana");
		s3.setPrezime("Jovanovic");
		s3.setOcena(10);
		
		il.dodajNaKraj(s1);
		il.dodajNaKraj(s2);
		il.dodajNaPocetak(s3);
		il.ispisi();
		
		System.out.println("Prosecna ocena je: "+il.prosecnaOcenaNaIspitu());
		
		System.out.println("Stari studenti su: ");
		il.upisali2013();
	}
}
