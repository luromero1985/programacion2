package Final15Diciembre2023;

public class FiltroNot {
	private Filtro f1;

	public FiltroNot(Filtro f1){
		this.f1=f1;
	}

	public boolean cumple(Comando c){
		return !f1.cumple(c);
	}
}
