package tp10.act5;

public class FiltroValorAcordado extends Filtro{
private int valor;

public FiltroValorAcordado(int valor){
	this.valor=valor;
}

public boolean cumple(Carga c){
	return c.getCostoEnvio()<c.getSeguro()*this.valor;
}
}
