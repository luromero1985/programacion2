package FinalDiciembre2023;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Inversion {
private String nombre;
private ArrayList<Double> listaCierre;

public Inversion (String n){
	this.nombre=n;
	this.listaCierre = new ArrayList<>();
	}

public void addListaCierre(Double valor) {
	this.listaCierre.add(0,valor);
}

public abstract double getValorOperado();

public  void cerrar(){
	this.addListaCierre(this.getValorOperado());
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Double getporcentajeVariacion(){
return (1-this.listaCierre.get(0)/this.getValorOperado())*100;		
}

public double porcentajeVariacionPosicion(int pos1, int pos2){
return ((this.listaCierre.get(pos1)-this.listaCierre.get(pos2))/this.listaCierre.get(pos2))*100;		
}


public boolean tengoMayorValor(int i){
	return this.listaCierre.get(0)>i;
}
public Double getUltimoCierre(){
	return this.listaCierre.get(0);
}

public abstract ArrayList<Inversion> listaOrdenada(Filtro f, Comparator<Inversion> c1);

public boolean esRentable(Filtro f){
	return f.cumple(this);
	
}
}
