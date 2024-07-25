package Act4_tp2;

import java.time.LocalDate;
public class Usuario {

	private String nombre, apellido;
	private LocalDate ultimoTurnoSacado;

	public Usuario(String nombre, String apellido, LocalDate utimoTurnoSacado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.ultimoTurnoSacado = utimoTurnoSacado;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getUltimoTurnoSacado() {
		return ultimoTurnoSacado;
	}

	public LocalDate setUltimoTurnoSacado(LocalDate ultimoTurnoSacado) {
		return this.ultimoTurnoSacado = ultimoTurnoSacado;
	}

public String toString(){
	return "El usuario "+this.getNombre()+" "+this.getApellido()+", saco su ultimo turno el dia: "+this.getUltimoTurnoSacado();
	
}
}
