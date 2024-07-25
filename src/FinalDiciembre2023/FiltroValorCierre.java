package FinalDiciembre2023;

public class FiltroValorCierre extends Filtro{
	private int min;
	
	public FiltroValorCierre (int min){
		this.min=min;
	}
	
	public boolean cumple(Inversion i){
		return i.tengoMayorValor(this.min);
	}

}
