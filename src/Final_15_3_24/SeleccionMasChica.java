package Final_15_3_24;

import java.util.ArrayList;

public class SeleccionMasChica extends Seleccion{

	public int nroSubCola(ArrayList<Estructura>estructuras){
		int pos=0;

		for(int i=0; i<estructuras.size(); i++){
			if(estructuras.get(i).cantTotalElementos()<
					estructuras.get(pos).cantTotalElementos()){
				pos=i;
			}
		}
		return pos;
	}

}





