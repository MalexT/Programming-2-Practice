package zadatak1;

public class Test {

	public static void main(String[] args) {

		IspitniRok ir = new IspitniRok();

		Student s1 = new Student();
		s1.setImePrezime("Miloje Babojevic");
		s1.setPoeni(55);

		try {
			ir.serijalizacija(s1, "student.out");
			ir.unosPodataka("student2.out");

			ir.ucitajIzfajla("student.out", "student2.out");
			ir.prosek("student.out", "student2.out");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
