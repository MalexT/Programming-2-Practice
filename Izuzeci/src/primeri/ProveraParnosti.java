package primeri;

public class ProveraParnosti {

	public static boolean proveraParnosti(int broj) throws Exception{

		
		if(broj == 0)
			throw new Exception();

		if(broj%2==0)
			return true;
		return false;
		
	}
}
