package eksponati;

public class Eksponat {

	private String naziv;
	private String autor;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv != null && !(naziv.equals("")))
			this.naziv = naziv;
		else
			System.out.println("GRESKA");
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null && !(autor.equals("")) && autor.length() > 5)
			this.autor = autor;
		else
			System.out.println("GRESKA");
	}

	public void ispisi() {
		System.out.println("Naziv:" + this.naziv + "\n" + "Autor: " + this.autor);
	}

}
