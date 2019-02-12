package zadatak2;

import java.util.*;

public class IspitnaLsita {

	List<Student> studenti;

	public IspitnaLsita() {
		studenti = new LinkedList<>();
	}

	public boolean pronadji(Student s) {
		return studenti.contains(s);
	}

	public void dodajNaKraj(Student s) {

		if (s == null && studenti.contains(s)) {
			System.out.println("GRESKA");
			return;
		} else
			studenti.add(s);
	}

	public void dodajNaPocetak(Student s) {
		if (s != null && !studenti.contains(s))
			studenti.add(0, s);
		else
			System.out.println("GRESKA");
	}

	public void unesiNaZadatiIndeks(Student s, int redniBroj) {

		if (s != null && redniBroj >= 0 && redniBroj <= (studenti.size() - 1) && !studenti.contains(s))
			studenti.add(redniBroj, s);
		else
			System.out.println("GRESKA");
	}

	public void izbrisiStudenta(Student s) {
		if (s != null && pronadji(s))
			studenti.remove(s);
		else
			System.out.println("GRESKA");
	}

	public void izbrisiPrvogStudenta() {
		if (studenti.size() > 0)
			studenti.remove(0);
		else
			System.out.println("GRESKA");
	}

	public void izbrisiPoslednjeg() {

		if (studenti.size() > 0) {
			Iterator<Student> iterator = studenti.iterator();
			int i = 0;

			while (iterator.hasNext()) {
				Student s = (Student) iterator.next();
				if (i == studenti.size() - 1)
					iterator.remove();
				i++;
			}
		} else {
			System.out.println("GRESKA");
		}
	}

	public void izbrisiStudentaSaPoziciji(int rbr) {

		if (studenti.size() > 0 && rbr >= 0 && rbr <= studenti.size()) {
			int i = 0;

			Iterator<Student> iterator = studenti.iterator();

			while (iterator.hasNext()) {

				Student s = (Student) iterator.next(); // Zasto je ova linija koda potrebna? da li ona sluzi kao sto ima
														// u C da prebaci na sledeci (kao inkrement)?
				if (i == rbr) {
					iterator.remove();
					break;
				}
				i++;
			}
		} else {
			System.out.println("GRESKA");
		}
	}

	public void brisiSveIzListe() {
		studenti.clear();
	}
	
	public void ispisiPodatkePrvog() {
		if(studenti.size()>0)
			System.out.println(studenti.get(0));
		else
			System.out.println("GRESKA");
	}
	
	public void ispisiPoslednjeg() {// Pogledaj mozda je ovde greska!
		if(studenti.isEmpty())
			System.out.println("GRESKA");
		else
		{
			Iterator<Student> iterator = studenti.iterator();
			
			while (iterator.hasNext()) {
				Student s = (Student)iterator.next();
				
				if(!iterator.hasNext())
					System.out.println(s);
			}
		}
	}
	
	public void ispisi() {
		for (Student student : studenti) {
			System.out.println(student);
		}
	}
	
	public void ispis() {
		for (Student student : studenti) {
			if(student.getOcena()==10)
				System.out.println(student);
		}
	}
	
	public double prosecnaOcenaNaIspitu() {
		
		double suma = 0;
		int brojac = 0;
		for (Student student : studenti) {
			suma = suma+ student.getOcena();
			brojac++;
		}
		return suma/brojac;
	}
	
	public void upisali2013() {
		for (Student student : studenti) {
			if(student.getBrojIndeksa().endsWith("2013"))
				System.out.println(student);
		}
	}
}
