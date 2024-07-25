package Prefinal1_12_23;

public class FiltroAND extends Filtro{

	private Filtro f1, f2;
	
	public FiltroAND(Filtro f1, Filtro f2){
		this.f1=f1;
		this.f2=f2;
	}
	
	public boolean cumple(Presupuesto p){
		return f1.cumple(p) && f2.cumple(p);
	}
}
