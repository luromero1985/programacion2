package FinalDiciembre2023;

import java.util.Comparator;

public class ComparadotNombre implements Comparator<Inversion>{
	public int compare (Inversion i1, Inversion i2){
		return i1.getNombre().compareTo(i2.getNombre());
	}

}
