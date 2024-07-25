package Prefinal1_12_23;

import java.util.ArrayList;
import java.util.Comparator;

public class Especializada extends Complejo{

	public Especializada(String nombre, int costo) {
		super(nombre,costo);
		
	}

	@Override
	public ArrayList<Presupuesto>lista(Filtro f, Comparator<Presupuesto>c){
		ArrayList<Presupuesto>aux=new ArrayList<>();
		return aux;
	}
}
