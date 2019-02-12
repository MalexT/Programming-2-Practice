package primeri;
import java.util.*;


public class Iterator1 {

	public static void main(String[] args) {
		
		List<String> voceNaPijaci = new LinkedList<>();
		
		voceNaPijaci.add("Jabuka");
		voceNaPijaci.add("Banana");
		voceNaPijaci.add("Dinja");
		voceNaPijaci.add("Kruska");
		
		Iterator<String> iterator = voceNaPijaci.iterator();
		
		while(iterator.hasNext()) {
			String voce = iterator.next();
			
			if(voce.startsWith("d"))
				System.out.println(voce);
			iterator.remove();
		}
		
		
	}
}
