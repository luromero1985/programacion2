package tp10.act5;

public class FiltroAnd extends Filtro {
private Filtro f1;
private Filtro f2;

public FiltroAnd (Filtro f1, Filtro f2){
	this.f1=f1;
	this.f2=f2;
}

public boolean cumple(Carga c){
	return f1.cumple(c) && f2.cumple(c); 
}
}
