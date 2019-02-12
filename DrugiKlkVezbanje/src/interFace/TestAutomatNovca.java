package interFace;

public class TestAutomatNovca {

	public static void main(String[] args) {

		AutomatNovca a = new AutomatNovca();
		NapredniAutomatNovca na = new NapredniAutomatNovca();
		
		a.uloziNovac(3000);
		na.podigninovac(9999.9);
		
		a.ispisi();
		na.ispisi();
	}

}
