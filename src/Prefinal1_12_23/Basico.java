package Prefinal1_12_23;

import java.util.ArrayList;
import java.util.Comparator;

public class Basico extends Presupuesto{

	private int cantEmpleados;
	private int tiempo;

	public Basico(String n, int costo, int cantEmpl, int tiempo){
		super(n, costo);
		this.cantEmpleados=cantEmpl;
		this.tiempo=tiempo;
	}


	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int t) {
		this.tiempo = t;
	}

	public ArrayList<Presupuesto>lista(Filtro f, Comparator<Presupuesto>c){
		ArrayList<Presupuesto> aux= new ArrayList<>();
		if(f.cumple(this)){
			aux.add(this);
		}
		return aux;
	}

	public Presupuesto copia(){
		Basico copia =new Basico(this.getNombre(), this.getCosto(),this.getCantEmpleados(),this.getTiempo());
		return copia;
	}


}
