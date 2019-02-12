package interFace;

public class AutomatNovca implements InterFace {

	private double stanje = 5000;
	@Override
	public void uloziNovac(double iznos) {
		if(iznos>0)
			stanje+=iznos;
		else
			System.out.println("Greska");
	}

	@Override
	public void podigninovac(double iznosP) {
		if(iznosP>0 && stanje>iznosP)
			stanje-=iznosP;
		else
			System.out.println("Greska");
	}
	public void ispisi() {
		System.out.println("Na automatu ima jos:" +stanje);
	}
	
}
