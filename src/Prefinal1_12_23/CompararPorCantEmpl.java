package Prefinal1_12_23;

import java.util.Comparator;

public class CompararPorCantEmpl implements Comparator<Presupuesto>{

	public int compare(Presupuesto p1, Presupuesto p2){
		return p1.getCantEmpleados()-(p2.getCantEmpleados());
	}
}
