package Act2_tp2;

public class Contacto {
private String nombre, correo;
private long telefono;

public Contacto(String nombre, String correo, long telefono){
	this.nombre=nombre;
	this.correo=correo;
	this.telefono=telefono;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public long getTelefono() {
	return telefono;
}

public void setTelefono(long telefono) {
	this.telefono = telefono;
}


public String toString(){
	return  "Nombre: "+nombre+". Correo electronico: "+correo+". Telefono: "+telefono+"\n";
}
}
