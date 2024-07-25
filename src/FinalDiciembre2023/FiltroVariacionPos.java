package FinalDiciembre2023;

public class FiltroVariacionPos extends Filtro {
	private double valor;
	
	public FiltroVariacionPos(double p){
		this.valor=p;
	}
	
	public boolean cumple(Inversion i){
		return i.getporcentajeVariacion()>this.valor;
	}

}
