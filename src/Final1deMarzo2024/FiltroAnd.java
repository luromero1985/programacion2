package Final1deMarzo2024;

public class FiltroAnd extends Filtro {
Filtro f1;
Filtro f2;


public FiltroAnd(Filtro f1, Filtro f2){
	this.f1=f1;
	this.f2=f2;
}

public boolean cumple(Comida c){
	return f1.cumple(c)&& f2.cumple(c);
}
}
