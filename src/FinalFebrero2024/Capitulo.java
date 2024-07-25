package FinalFebrero2024;

import java.util.ArrayList;

public class Capitulo extends Elemento{

private String tema;
private String nombre;
private int cantPaginas;
private ArrayList<Persona> autores;
private ArrayList<Persona> editores;
private CalculadorDePrecio calculador;


public Capitulo(Persona revisor, int codigo, String nombre, String tema, int cantPag, CalculadorDePrecio calculador){
	super(revisor,codigo);
	this.nombre=nombre;
	this.tema=tema;
	this.cantPaginas=cantPag;
	this.editores=new ArrayList<>();
	this.autores=new ArrayList<>();
	this.calculador=calculador;
}

public CalculadorDePrecio getCalculador() {
	return calculador;
}

public void setCalculador(CalculadorDePrecio calculador) {
	this.calculador = calculador;
}

public String getTema() {
	return this.tema;
}

public void setTema(String tema) {
	this.tema = tema;
}

public String getNombre() {
	return this.nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int cantPaginas() {
	return this.cantPaginas;
}

public void setCantPaginas(int cantPaginas) {
	this.cantPaginas = cantPaginas;
}
public void addAutores(Persona p) {
if (!this.autores.contains(p) && !this.esRevisor(p)) {
autores.add(p);}
}
public ArrayList<Persona> getAutores(){
	return new ArrayList<Persona>(this.autores);
}

public void addEditores(Persona e) {
	if(!this.editores.contains(e) && !this.esRevisor(e)) {
		this.editores.add(e);
	}
}

//devuelvo una copia del arreglo
public ArrayList<Persona> getEditores(){
	return new ArrayList<Persona>(this.editores);
}

@Override
public boolean esEditor(Persona e) {
		return this.editores.contains(e);
}

@Override
public ArrayList<String> listaTemas(){
	ArrayList<String>copia= new ArrayList<>();
	copia.add(this.getTema());
	return copia;
}

public Elemento getCopia(Filtro f) {
if(f.cumple(this)) {
	Capitulo aux = new Capitulo (this.getRevisor(),this.getCodigo(),this.getNombre(),this.getTema(),this.cantPaginas(), this.getCalculador());
ArrayList<Persona> editoresCopia = this.getEditores();
ArrayList<Persona> autoresCopia = this.getAutores();
for(int i=0; i<editoresCopia.size();i++) {
	aux.addEditores(editoresCopia.get(i));
}
for(int j=0; j<autoresCopia.size();j++) {
	aux.addEditores(autoresCopia.get(j));
}
return aux;
}
else {
	return null;
}
}
public int getPrecio() {
	return this.calculador. precioFinal() ;
}
}
