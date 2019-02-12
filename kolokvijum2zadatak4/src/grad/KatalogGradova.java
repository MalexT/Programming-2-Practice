package grad;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import grad.exception.GradException;

public class KatalogGradova implements Demografija {

	@Override
	public void dodajGrad(Grad g) {
		if(!gradovi.contains(g)) {
			
			boolean unet = false;
			
			for (int i = 0; i < gradovi.size(); i++) {
				if(gradovi.get(i).getBrojStanovnika()<g.getBrojStanovnika()) {
					gradovi.add(i,g);
					unet = true;
					break;
				}
			}
			if(!unet){
				gradovi.add(gradovi.size(), g);
			}
		}else {
			throw new GradException("Grad vec postoji u katalogu");
		}
	}

	
	
	
	@Override
	public void upisiGradoveUKategorije() throws Exception {
		for (Grad grad : gradovi) {
			if(grad.getBrojStanovnika()<100000) {
				try(FileOutputStream fos = new FileOutputStream("mali_gradovi.out");
					BufferedOutputStream bos = new BufferedOutputStream(fos);
						ObjectOutputStream oos = new ObjectOutputStream(bos)){
					oos.writeObject(grad);
				}catch(Exception e) {
					throw new GradException("Grad nije mogao da se upise");
				}
			}
			if(grad.getBrojStanovnika()<=1000000) {
				try(FileOutputStream fos = new FileOutputStream("srednji_gradovi.out");
						BufferedOutputStream bos = new BufferedOutputStream(fos);
							ObjectOutputStream oos = new ObjectOutputStream(bos)){
						oos.writeObject(grad);
					}catch(Exception e) {
						throw new GradException("Grad nije mogao da se upise");
					}
			}
			if(grad.getBrojStanovnika()>1000000) {
				try(FileOutputStream fos = new FileOutputStream("veliki_gradovi.out");
						BufferedOutputStream bos = new BufferedOutputStream(fos);
							ObjectOutputStream oos = new ObjectOutputStream(bos)){
						oos.writeObject(grad);
					}catch(Exception e) {
						throw new GradException("Grad nije mogao da se upise");
					}
			}
		}
	}
	
	private List<Grad>gradovi = new LinkedList<>();
	
}
