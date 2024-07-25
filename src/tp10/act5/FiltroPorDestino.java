package tp10.act5;

public class FiltroPorDestino extends Filtro {
private String destino;


public FiltroPorDestino(String destino){
	this.destino=destino;
}

public boolean cumple(Carga c){
	return c.getDestino().equals(this.destino);
}


}
