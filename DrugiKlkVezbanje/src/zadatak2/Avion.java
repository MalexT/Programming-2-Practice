package zadatak2;

public class Avion extends Vozilo {

	@Override
	public boolean daLiIdePoKopnu() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean daLiIdePoVodi() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean daLiIdePoVazduhu() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void ispisi() {
		System.out.println();
		System.out.println("Avion");
		System.out.println("-------");
		System.out.println("Marka: "+getMarka());
		System.out.println("Model: " +getModel());
	}
}
