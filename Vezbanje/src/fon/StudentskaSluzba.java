package fon;

import java.util.GregorianCalendar;

import fon.studenti.Student;

public class StudentskaSluzba {

	Student[] studenti;
	
	public StudentskaSluzba(int brojStudenata) {
		if(brojStudenata<0){
			studenti = new Student[700];
		}
		studenti = new Student[brojStudenata];
	}
	
	public void unesiStudenta(Student s) {
		if(s==null) {
			System.out.println("S je null");
			return;
		}
		for (int i = 0; i < studenti.length; i++) {
			if(studenti[i]==null) {
				studenti[i]=s;
				return;
			}
		}
		System.out.println("Niz je pun");
	}
	
	public void ispisiStudente() {
		for (int i = 0; i < studenti.length; i++) {
			if (studenti[i].getS().equals(Smer.MGMT) && studenti[i].getDatumRodjenja().get(GregorianCalendar.YEAR) == 1998) {
				System.out.println(studenti[i]);
			}
		}
	}
	
	public Student[] najveciProsek() {
		
		Student[] np = new Student[5];
		int brojac=0;
		for (int i = 0; i < studenti.length-1; i++) {
			for (int j = 0; j < studenti.length; j++) {
				if(studenti[i]!=null && studenti[j] !=null && studenti[j].prosek() > studenti[i].prosek()) {
					Student pom;
					pom = studenti[i];
					studenti[i] = studenti[j];
					studenti[j]=studenti[i];
				}
			}
		}
		
		for (int i = 0; i < studenti.length; i++) {
			if(studenti[i]!=null) {
				np[brojac]= studenti[i];
				brojac++;
				if(brojac==5)break;
			}
		}
			return np;	
	}
	
	
	
	
}
