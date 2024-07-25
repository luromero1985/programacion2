package Prefinal1_12_23;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Presupuesto {
private String nombre;
private int costo;


public Presupuesto(String n, int costo){
	this.nombre=n;
	this.costo=costo;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}



public int getCosto() {
	return costo;
}


public void setCosto(int costo) {
	this.costo = costo;
}


public abstract int getCantEmpleados();

public abstract int getTiempo(); 

public abstract ArrayList<Presupuesto>lista(Filtro f, Comparator<Presupuesto> c);

public abstract Presupuesto copia(); 
}
