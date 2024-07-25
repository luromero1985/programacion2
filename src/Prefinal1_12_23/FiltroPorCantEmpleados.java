package Prefinal1_12_23;

public class FiltroPorCantEmpleados extends Filtro{
private int cantidad;

public FiltroPorCantEmpleados(int c){
	this.cantidad=c;
}

public boolean cumple(Presupuesto p){
	return p.getCantEmpleados()<this.cantidad;
}
}
