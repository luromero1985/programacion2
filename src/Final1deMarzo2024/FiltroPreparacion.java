package Final1deMarzo2024;

public class FiltroPreparacion extends Filtro {
private String preparacion;

public FiltroPreparacion(String preparacion){
	this.preparacion=preparacion;
}

public boolean cumple (Comida c){
	return c.getTipo().equals(this.preparacion);
}
}
