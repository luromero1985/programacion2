package tp10.act5;

public class FiltroPorSeguro extends Filtro {
private int precio;

public FiltroPorSeguro(int p){
	this.precio=p;
}

public boolean cumple(Carga b){
	if(b.getSeguro()>this.precio){
		return true;
	}
	else return false;
}
}
