package FinalFebrero2024;

import java.util.ArrayList;

public abstract class Elemento {
private Persona revisor;
private int codigo;

public Elemento(Persona revisor, int codigo) {
	this.revisor=revisor;
	this.codigo=codigo;
}

public Persona getRevisor() {
	return revisor;
}

public void setRevisor(Persona revisor) {
	if (!this.esEditor(revisor)) {
	this.revisor = revisor;
	}
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public boolean esRevisor(Persona p) {
	return this.revisor.equals(p);
}

public boolean equals(Object o) {
	try {
		Elemento otro = (Elemento) o;
		return this.getCodigo()==otro.getCodigo();
	}
	catch (Exception e) {
		return false;
	}
}

public abstract ArrayList<Persona>getAutores();
public abstract ArrayList<Persona>getEditores();

public abstract  ArrayList<String> listaTemas();

public abstract boolean esEditor(Persona e);
public abstract int cantPaginas();
public abstract Elemento getCopia(Filtro f);
public abstract int getPrecio();
}
