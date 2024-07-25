package Final1deMarzo2024;

public class FiltroTipo extends Filtro{
private String tipo;

public FiltroTipo(String tipo){
	this.tipo=tipo;
}
public boolean cumple(Comida c){
	return c.getTipo().equals(this.tipo);
}
}
