package Final1deMarzo2024;

import java.util.ArrayList;

public class Estacion {
private int id;
private Filtro filtro;
private ArrayList<Comida>enPreparacion;



public Estacion(int id, Filtro f){
	this.id=id;
	this.filtro=f;
	this.enPreparacion=new ArrayList<>();
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}

public void setFiltro(Filtro f){
	this.filtro=f;
}

public void addEnPreparacion(Comida c){
	if(this.puedoPreparar(c)){
		this.enPreparacion.add(c);
	}
}

public boolean puedoPreparar(Comida c){
	return this.filtro.cumple(c);
}


public boolean equal(Object o){
	try{
		Estacion otro=(Estacion) o;
		return this.getId()==(otro.getId());
	}
	catch (Exception e){
		return false;
	}
}

public boolean comidaRecibida(Comida c){
	return true;
}

}
