package FinalFebrero2024;

public class FiltroPorAutor extends Filtro{
private Persona autor;

public FiltroPorAutor(Persona p) {
	this.autor=p;
}

public boolean cumple(Elemento e) {
	return e.getAutores().contains(this.autor);
}
}
