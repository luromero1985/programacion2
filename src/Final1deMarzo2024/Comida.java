package Final1deMarzo2024;

public abstract class Comida {
private String nombre, tipo, preparacion;

public Comida(String n, String t, String p){
	this.nombre=n;
	this.tipo=t;
	this.preparacion=p;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getPreparacion() {
	return preparacion;
}

public void setPreparacion(String preparacion) {
	this.preparacion = preparacion;
}

public abstract int getPrecio();
public abstract int getCalorias();
public abstract int getTiempo();

public boolean equals(Object o){
	try{
		Comida otro=(Comida)o;
		return this.getNombre().equals(otro.getNombre());
	}
	catch(Exception e){
	return false;
	}
}

}
