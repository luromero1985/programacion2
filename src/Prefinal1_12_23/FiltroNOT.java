package Prefinal1_12_23;

public class FiltroNOT extends Filtro{
private Filtro f;

public FiltroNOT(Filtro f){
	this.f=f;
}

public boolean cumple(Presupuesto p){
	return !f.cumple(p);
}
}
