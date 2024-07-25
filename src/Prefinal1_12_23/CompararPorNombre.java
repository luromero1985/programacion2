package Prefinal1_12_23;

import java.util.Comparator;

import FinalDiciembre2023.Inversion;

public class CompararPorNombre implements Comparator<Presupuesto>{

	public int compare(Presupuesto p1, Presupuesto p2){
		return p1.getNombre().compareTo(p2.getNombre());
	}
	
}
