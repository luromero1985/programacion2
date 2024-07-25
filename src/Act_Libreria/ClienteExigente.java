package Act_Libreria;


public class ClienteExigente extends Cliente{

	public ClienteExigente(String nombre, String apellido, String direccion, int dni, double descuento) {
		super(nombre, apellido, direccion, dni, descuento);

	}

	public boolean leGusta(Articulo a) {
		boolean legusta = super.leGusta(a);
		if(legusta) {

			for (int i =0; i<generos.size();i++) {
				if (a.tieneGenero(generos.get(i))) {
					return true;
				}
			}
			return false;

		} else {
			return false;
		}
	}



}