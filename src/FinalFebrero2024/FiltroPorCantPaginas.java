package FinalFebrero2024;

public class FiltroPorCantPaginas extends Filtro{
private int max;

public FiltroPorCantPaginas(int max) {
	this.max=max;
}
public boolean cumple(Elemento e) {
	return e.cantPaginas()<max;
}
}
