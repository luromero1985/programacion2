package FinalFebrero2024;

public class FiltroNot extends Filtro{
private Filtro filtro;

public FiltroNot(Filtro filtro) {
	this.filtro=filtro;
}

public boolean cumple(Elemento e) {
	return !filtro.cumple(e);
}
}
