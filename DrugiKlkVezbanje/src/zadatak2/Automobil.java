package zadatak2;

public class Automobil extends Vozilo {

	@Override
	public boolean daLiIdePoKopnu() {
		return true;
	}

	@Override
	public boolean daLiIdePoVodi() {
		return false;
	}

	@Override
	public boolean daLiIdePoVazduhu() {
		return false;
	}

}
