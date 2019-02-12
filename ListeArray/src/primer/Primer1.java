package primer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Primer1 {

	public static void main(String[] args) {

		List<String>voceNaPijaci = new ArrayList<>();
		
		voceNaPijaci.add("Jabuka");
		voceNaPijaci.add("banana");
		voceNaPijaci.add("kruska");
		
		voceNaPijaci.add(1, "Dinja");
		
		Iterator<String> iterator = voceNaPijaci.iterator();
		
		while(iterator.hasNext()) {
			String vnp = (String) iterator.next();
			
			if(vnp.equals("banana"))
				iterator.remove();
		}
		
//		voceNaPijaci.remove("banana");
		
		for (int i = 0; i < voceNaPijaci.size(); i++) {
			System.out.println(voceNaPijaci.get(i));
		}
	}
}
