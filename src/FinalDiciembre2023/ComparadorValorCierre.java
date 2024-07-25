package FinalDiciembre2023;

import java.util.Comparator;

public class ComparadorValorCierre implements Comparator<Inversion>{
public int compare(Inversion i1,Inversion i2){
	return i1.getUltimoCierre().compareTo(i2.getUltimoCierre());
}
}
