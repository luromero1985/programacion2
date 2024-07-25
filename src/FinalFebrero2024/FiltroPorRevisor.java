package FinalFebrero2024;

public class FiltroPorRevisor extends Filtro{
private Persona revisor;
public FiltroPorRevisor( Persona p) {
	this.revisor=p;
}

public boolean cumple(Elemento e) {
	return e.getRevisor().equals(revisor);
}
}
