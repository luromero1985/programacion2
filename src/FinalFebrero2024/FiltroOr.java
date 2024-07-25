package FinalFebrero2024;

public class FiltroOr extends Filtro{
private Filtro f1;
private Filtro f2;
public FiltroOr(Filtro f1, Filtro f2 ) {
	this.f1=f1;
	this.f2=f2;
}

public boolean cumple(Elemento e) {
	return f1.cumple(e)|| f2.cumple(e);
}
}
