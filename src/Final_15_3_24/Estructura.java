package Final_15_3_24;

import java.util.Objects;

public abstract class Estructura {
	//consigna a
	public abstract int cantTotalElementos();
	//preguntar por el equals
	
	//consigna b
	public abstract Terminal colaConMasElementos();
	
	//consigna c
	public abstract int cantColasTerminales();

	//consigna d
	public abstract boolean tengoObjeto(Objects o);
	
	//consigna e
	public abstract Estructura copia();
	
	public abstract void addObjeto(Objects o);
	public abstract Objects recuperarObjeto();
}

