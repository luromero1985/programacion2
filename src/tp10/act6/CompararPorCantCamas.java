package tp10.act6;

import java.util.Comparator;

public class CompararPorCantCamas implements Comparator<Habitacion>{

	
	public int compare(Habitacion h1, Habitacion h2) {
		return Integer.compare(h1.getCantCamas(), h2.getCantCamas());
	}
}
