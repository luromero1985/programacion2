package tp10.act5;

public class FiltroNot extends Filtro {
private Filtro f;

public FiltroNot(Filtro f){
	this.f=f;
}

public boolean cumple(Carga c){
	return !f.cumple(c);
}


}
