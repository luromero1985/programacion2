package FinalFebrero2024;

public class Persona {
private String nombre;
private String apellido;
private String email;

public Persona(String nombre, String apellido, String email) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.email=email;
}

public String getNombre() {
	return this.nombre;
}

public void setNombre(String n) {
	this.nombre=n;
}

public String getApellido() {
	return this.apellido;
}

public void setApellido(String a) {
	this.apellido=a;
}


public String getEmail() {
	return this.email;
}

public void setEmail(String e) {
	this.email=e;
}

//redefinimos el equals

public boolean equals(Object o) {
	try {
		Persona otro= (Persona)o;
		return this.getNombre().equals(otro.getNombre())
				&& this.getApellido().equals(otro.getApellido());
				}
	catch(Exception e) {
		return false;
	}
}
}
