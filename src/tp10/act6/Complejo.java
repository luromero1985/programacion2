package tp10.act6;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Complejo {
private String nombre;
	private ArrayList<String>comodidades;
	
	public Complejo(String n) {
		this.comodidades=new ArrayList<>();
		this.nombre=n;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void addComodidad(String c) {
		if(!this.comodidades.contains(c)) {
			this.comodidades.add(c);
		}
	}
	
	public boolean equals(Object o) {
		try {
		Complejo otro= (Complejo)o;
		return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean tieneLaComodidad (String c) {
		return this.comodidades.contains(c);
	}
	
	
	public abstract ArrayList<Habitacion> habitacionesDisponibles(Filtro f, Comparator<Habitacion> c);
public abstract int cantHabit(Filtro f);
public abstract int getSuperficie();
}
