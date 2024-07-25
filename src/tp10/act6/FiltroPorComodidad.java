package tp10.act6;

public class FiltroPorComodidad extends Filtro{
private String comodidad;

public FiltroPorComodidad(String c) {
	this.comodidad=c;
}

public boolean cumple(Habitacion h) {
	return h.tieneLaComodidad(this.comodidad);
}

}
