package tp10.act6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hotel extends Complejo{
private ArrayList<Complejo>pabellones;


public Hotel(String nombre) {
	super(nombre);
	this.pabellones=new ArrayList<>();
}


public void addPabellon(Complejo c) {
	if(!this.pabellones.contains(c)) {
		this.pabellones.add(c);
	}
}

public ArrayList<Habitacion> habitacionesDisponibles(Filtro f, Comparator<Habitacion> comparador){
	ArrayList<Habitacion> habitaciones = new ArrayList<>();
	
	for(int i=0; i<this.pabellones.size();i++){
		ArrayList<Habitacion> aux = this.pabellones.get(i).habitacionesDisponibles(f, comparador);
	if(!aux.isEmpty()){
		for(int j=0; i<aux.size();j++){
			habitaciones.add(aux.get(j));
		}
	}
	}
	Collections.sort(habitaciones,comparador);
	return habitaciones;
}
public int cantHabit(Filtro f){
int suma =0;
for(int i=0;i<this.pabellones.size();i++){
	suma += this.pabellones.get(i).cantHabit(f);
}
return suma;
}


public int getSuperficie(){
	int suma =0;
	for(int i=0; i<this.pabellones.size();i++){
		suma +=this.pabellones.get(i).getSuperficie();
	}
	return suma;
}
}
