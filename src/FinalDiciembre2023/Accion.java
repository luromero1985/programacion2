package FinalDiciembre2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Accion extends Inversion{
	private String simbolo;
	private double valorOperado;


	public Accion(String nombre, String simbolo, double valorO) {
		super(nombre);
		this.simbolo = simbolo;
		this.valorOperado = valorO;
	
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public double getValorOperado() {
		return valorOperado;
	}

	public void setValorOperado(double valorOperado) {
		this.valorOperado = valorOperado;
	}

	public ArrayList<Inversion> listaOrdenada(Filtro f, Comparator<Inversion> c1) {
		ArrayList<Inversion> aux = new ArrayList<>();
		if (f.cumple(this)) {
			aux.add(this);
		}
		return aux;
	}
	
}
