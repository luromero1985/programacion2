package FinalDiciembre2023;

public class FiltroPorNombre extends Filtro{
private String nombre;


public FiltroPorNombre(String n){
	this.nombre=n;
}


public boolean cumple(Inversion i){
	return i.getNombre().contains(nombre);
}
}
