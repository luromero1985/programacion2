package Final15Diciembre2023;

public class FiltroGastoMax {
	private int gasto;

	public FiltroGastoMax(int i){
		this.gasto=i;
	}

	public boolean cumple(Comando c){
		return c.getGasto()<this.gasto;
	}
}