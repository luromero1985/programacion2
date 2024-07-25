package Final1deMarzo2024;

public class FiltroTiempoMax extends Filtro{
	private int tiempo;
	
	public FiltroTiempoMax(int t){
		this.tiempo=t;
	}
	public boolean cumple(Comida c){
		return c.getTiempo()<this.tiempo;
	}

}
