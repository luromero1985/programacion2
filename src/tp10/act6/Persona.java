package tp10.act6;

public class Persona {
private String nombre;
private String ciudadOrigen;
private int edad;

public Persona(String n, String ciudad, int edad) {
	this.nombre=n;
	this.ciudadOrigen=ciudad;
	this.edad=edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCiudadOrigen() {
	return ciudadOrigen;
}

public void setCiudadOrigen(String ciudadOrigen) {
	this.ciudadOrigen = ciudadOrigen;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}


}
