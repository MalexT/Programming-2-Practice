package interFace;

public class NapredniAutomatNovca implements InterFace {

	private double stanje = 20000;
	@Override
	public void uloziNovac(double iznos) {
		if(iznos>0 && iznos<=20000)
			stanje+=iznos;
		else if(iznos<0)
			System.out.println("Greska");
		else
			System.out.println("Maksimalan iznos uplate je 20000.0 dinara");
	}

	@Override
	public void podigninovac(double iznosP) {
		if(iznosP>0) {
			if(iznosP<=10000) {
				stanje-=iznosP;
			}else
				System.out.println("Maksimalan iznos koji se moze podiici je 10000");
		}else {
			System.out.println("Greska");
		}
	}

	public void ispisi() {
		System.out.println("U automatu trenutno ima:"+ stanje);
		System.out.println("Maksimalno se moze podici 10000");
		System.out.println("Maksimalno se moze uloziti 20000");
	}
}
