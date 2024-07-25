package Final_15_3_24;

import java.util.ArrayList;

public class SeleccionAzar extends Seleccion{
	
	public int nroSubCola(ArrayList<Estructura>estructuras){
		int pos=estructuras.size();
		return (int) Math. random()*pos;
		
	}
}

