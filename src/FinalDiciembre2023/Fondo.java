package FinalDiciembre2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fondo extends Inversion {

	private ArrayList<Inversion> inversiones;
	private double porcentaje;

	public Fondo(String n, int gastoA, double p) {
		super(n);
		this.inversiones = new ArrayList<>();
		this.porcentaje=p;
	}

	public void addInversion(Inversion i) {
		this.inversiones.add(i);
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public  void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getValorOperado() {
		double suma = 0;
		for (int i = 0; i < this.inversiones.size(); i++) {
			suma += this.inversiones.get(i).getValorOperado();
		}
		return suma - suma * porcentaje;
	}

	public ArrayList<Inversion> listaOrdenada(Filtro f, Comparator<Inversion> c1) {
		ArrayList<Inversion> aux = new ArrayList<>();
		if (f.cumple(this)) {
			aux.add(this);
		} else {
			for (int i = 0; i < this.inversiones.size(); i++) {
				aux.addAll(this.inversiones.get(i).listaOrdenada(f,c1));
			}
		}
		Collections.sort(aux, c1);
		return aux;
	}

}
