package Prefinal1_12_23;

public class FiltroPorCantDias extends Filtro {

	private int cantidad;
	public FiltroPorCantDias(int c){
		this.cantidad=c;
	}
	
	public boolean cumple(Presupuesto p){
		return p.getCantEmpleados()<this.cantidad;
	}
}
