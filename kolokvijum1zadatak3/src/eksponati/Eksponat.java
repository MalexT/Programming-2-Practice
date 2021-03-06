package eksponati;

public class Eksponat {

	private String naziv;
	private String autor;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.equals(""))
			System.out.println("GRESKA");
		this.naziv = naziv;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if(autor==null || autor.equals("") || autor.length() < 5){
			System.out.println("GRESKA");
		}
		else
			this.autor = autor;
	}
	
	public void ispisi() {
		System.out.println();
		System.out.println("Naziv eksponata: ("+this.naziv + ")");
		System.out.println("Ime i prezime autora: "+this.autor);
	}
}
