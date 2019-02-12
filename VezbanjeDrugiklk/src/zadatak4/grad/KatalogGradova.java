package zadatak4.grad;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import zadatak4.grad.exception.GradException;

public class KatalogGradova implements Demografija {

	@Override
	public void dodajGrad(Grad g) {
		int redniBrojGrada = 0;
		try {
			if (!(gradovi.contains(g))) {
				for (int i = 0; i < gradovi.size(); i++) {
					if (gradovi.get(i).getBrojStanovnika() < g.getBrojStanovnika()) {
						redniBrojGrada = i;
						break;
					}
				}
				gradovi.add(redniBrojGrada, g);
			} else
				throw new GradException("Grad vec postoji u listi.");
		} catch (Exception e) {
			throw new GradException("Greska " + e.getMessage());
		}
	}

	@Override
	public void upisiGradoveUKategorije() throws Exception {
		for (Grad grad : gradovi) {
			if (grad.getBrojStanovnika() < 100000) {
				try (ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream("mali_gradovi.out")))) {
					oos.writeObject(grad);
				} catch (Exception e) {
					throw new GradException("Greska prilikom upisivanja malog grada");
				}
			} else if (grad.getBrojStanovnika() > 100000 && grad.getBrojStanovnika() < 1000000) {
				try (ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream("srednji_gradovi.out")))) {
					oos.writeObject(grad);
				} catch (Exception e) {
					throw new GradException("Greska prilikom upisivanja srednjeg grada");
				}
			} else if (grad.getBrojStanovnika() > 1000000) {
				try (ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream("veliki_gradovi.out")))) {
					oos.writeObject(grad);
				} catch (Exception e) {
					throw new GradException("Greska prilikom upisivanja velikog grada");
				}
			}
		}

	}
	
	public void ispisiListu() {
		for (Grad grad : gradovi) {
			System.out.println(grad.getNaziv() + " "+ " "+ grad.getBrojStanovnika());
		}
	}

	private List<Grad> gradovi = new LinkedList<>();
}
