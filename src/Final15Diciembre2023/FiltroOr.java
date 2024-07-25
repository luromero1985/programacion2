package Final15Diciembre2023;

public class FiltroOr {
	private Filtro f1;
	private Filtro f2;

	public FiltroOr(Filtro f1,Filtro f2){
		this.f1=f1;
		this.f2=f2;
	}

	public boolean cumple(Comando c){
		return f1.cumple(c) || f2.cumple(c);
	}
}

