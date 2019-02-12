package eksponati.fotografije;

import eksponati.Eksponat;

public class Fotografija extends Eksponat {

	@Override
	public void ispisi() {
		super.ispisi();
		System.out.println("Fotografija");
	}
}
