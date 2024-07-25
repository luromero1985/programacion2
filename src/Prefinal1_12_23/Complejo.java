package Prefinal1_12_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Complejo extends Presupuesto{

	protected ArrayList<Presupuesto>presupuestos;

	public Complejo(String nombre, int costo){
		super(nombre, costo);
		this.presupuestos= new ArrayList<>();
	}

	public void addPresupuesto(Presupuesto p){
		this.presupuestos.add(p);
	}

	public int getTiempo() {
		int suma=0;
		for(int i=0; i<this.presupuestos.size(); i++){
			suma+=this.presupuestos.get(i).getTiempo();

		}
		return suma;
	}

	public int getCantEmpleados(){
		int mayorCantidad=0;
		for(int i=0; i<this.presupuestos.size(); i++){
			if(mayorCantidad<this.presupuestos.get(i).getCantEmpleados()){
				mayorCantidad=this.presupuestos.get(i).getCantEmpleados();
			}
		}
		return mayorCantidad;
	}


	public ArrayList<Presupuesto>lista(Filtro f, Comparator<Presupuesto>c){
		ArrayList<Presupuesto>aux=new ArrayList<>();

		if(f.cumple(this)){
			aux.add(this);
		}
		else{
			for(int i=0; i<this.presupuestos.size();i++){
				ArrayList<Presupuesto> hijo=this.presupuestos.get(i).lista(f,c);
				if(!hijo.isEmpty()){
					aux.addAll(hijo);
				}
			}
		}
		Collections.sort(aux, c);
		return aux;
	}


	public Presupuesto copia(){
		ArrayList<Presupuesto> copiaPresupuestos =new ArrayList<>();
		for(int i=0; i<this.presupuestos.size(); i++){
			Presupuesto aux =this.presupuestos.get(i).copia();
			if(aux!=null){
				copiaPresupuestos.add(aux);
			}
		}
		if(!copiaPresupuestos.isEmpty()){
			Complejo copiaMia =new Complejo(this.getNombre(), this.getCosto());
			for(int i=0; i<copiaPresupuestos.size();i++){
				copiaMia.addPresupuesto(copiaPresupuestos.get(i));
			}
			return copiaMia;
		}
		else{
			return null;
		}
	}
}
