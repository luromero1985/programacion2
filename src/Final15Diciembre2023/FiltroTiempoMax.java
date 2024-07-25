package Final15Diciembre2023;

public class FiltroTiempoMax {
	private int tiempo;

	public FiltroTiempoMax(int i){
		this.tiempo=i;
	}

	public boolean cumple(Comando c){
		return c.getTiempo()<this.tiempo;
	}
}
