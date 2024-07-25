package Prefinal1_12_23;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Presupuesto>{
private Comparator<Presupuesto>c1,c2;

public int compare(Presupuesto p1, Presupuesto p2){
	int aux=c1.compare(p1, p2);
	if(aux==0){
		aux=c2.compare(p1, p2);
	}
	return aux;
}
	
}

