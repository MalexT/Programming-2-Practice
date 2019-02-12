package zadatak3;

public class Djak {

	private String name;
	private String surname;
	private int grade;

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getGrade() {
		return grade;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
		else
			throw new RuntimeException("Ime ne moze biti null");
	}

	public void setSurname(String surname) {
		if (surname != null)
			this.surname = surname;
		else
			throw new RuntimeException("Prezime ne moze biti null");
	}

	public void setGrade(int grade) {
		if (grade >= 1 && grade <= 5)
			this.grade = grade;
		else
			throw new RuntimeException("Ocena nije u odgovarajucem rasponu");
	}

	@Override
	public String toString() {
		String s = (this.name+" " + this.surname+" " + this.grade);
		return s.toUpperCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Djak)) {
			throw new RuntimeException("Objekat nije klase djak");
		}
		Djak other = (Djak) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

}
