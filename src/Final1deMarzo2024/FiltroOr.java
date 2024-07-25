package Final1deMarzo2024;

public class FiltroOr extends Filtro{
	private Filtro f1;
	private Filtro f2;
	
	public FiltroOr(Filtro f1,Filtro f2){
		this.f1=f1;
		this.f2=f2;
		
	}
public boolean cumple(Comida c){
	return f1.cumple(c) || f2.cumple(c);
}
}
