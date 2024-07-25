package FinalDiciembre2023;

import java.util.Comparator;

public class ComparadorAnd implements Comparator<Inversion> {
private Comparator <Inversion> c1;
private Comparator <Inversion> c2;


public int compare(Inversion i1,Inversion i2){
	int aux =c1.compare(i1, i2);
	if(aux==0){
		aux= c2.compare(i1,i2);
	}
	return aux;
}
}
