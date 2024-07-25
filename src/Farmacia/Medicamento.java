package Farmacia;
import java.util.ArrayList;

public class Medicamento {
private String  nombre;
private String lab;
private double precio;
private ArrayList<String>sintomas;



public Medicamento(String  nombre, String lab, double precio){
	this.lab=lab;
	this.nombre=nombre;
	this.precio=precio;
	this.sintomas= new ArrayList<>();
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getLab() {
	return lab;
}
public void setLab(String lab) {
	this.lab = lab;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

public boolean trataSintoma(String sintoma){
	return this.sintomas.contains(sintoma);
}
public 
}
