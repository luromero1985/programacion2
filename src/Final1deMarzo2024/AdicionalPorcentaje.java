package Final1deMarzo2024;

public class AdicionalPorcentaje extends Adicional{
private Filtro filtro;
private int extraSi;
private int extraNo;


public AdicionalPorcentaje(Filtro f, int extraSi, int extraNo){
	this.filtro=f;
	this.extraSi=extraSi;
	this.extraNo=extraNo;
}

public double extra(Comida c){
	double aux =0;
	if(this.filtro.cumple(c)){
		aux+= extraSi;
	}
	else{
		aux+= extraNo;
	}
	return aux;
}
}
