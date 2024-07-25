package Act_Libreria;



public class ClienteTodoLeVieneBien extends Cliente {

	public ClienteTodoLeVieneBien(String nombre, String apellido, String direccion, int dni, double descuento) {
		super(nombre, apellido, direccion, dni, descuento);

	}

	public boolean leGusta(Articulo a) {
		return true;
	}

}
