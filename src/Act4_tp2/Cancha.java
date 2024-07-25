package Act4_tp2;

public class Cancha {

	private String tipo;
	private Usuario usuario;
	private long precio;
	private int turnoPedido;
	private String turnos[];  // Cada posicion corresponde a un turno  

	//ver reservas

	public Cancha(String tipo, Usuario usuario, long precio, int turnoPedido) {
		setTipo(tipo);
		setUsuario(usuario);
		setPrecio(precio);
		setTurnoPedido(turnoPedido);
	}

	public void setTipo(String tipo) {
		if ((tipo == "Futbol") || (tipo == "Paddle" ))
			this.tipo = tipo;
		else 
			System.out.println("Lo sentimos, pero no contamos con esa cancha");
	}

	public void setUsuario(Usuario usuario) {
		if (usuario != null) 
			this.usuario=usuario;
		else 
			System.out.println("Para la reserva, es necesario el registro de su nombre");
	}

	public void setPrecio(long precio) {
		if(precio>0)
			this.precio = precio;
		else
			System.out.println("El precio ingresado es incorrecto");
	}

	public void setTurnoPedido(int turnoPedido) {
		this.turnoPedido = turnoPedido;
		this.turnos = new String [turnoPedido];
		for (int i=0 ; i< turnos.length ; i++) {
			this.turnos[i] = "0"; // inicializo el array de turnos en todos libres al crear una cancha, luego va el Usuario
		}
	}

	public void setTurno(int pos, String nombre) {
		if (pos >= this.turnos.length) {
			System.out.println("A la hora de ese turno estamos cerrados");
			return;
		}
		if (this.turnos[pos] == "0") 
			this.turnos[pos] = nombre;
		else 
			System.out.println("Ese turno no está disponible");
		return;
	}

	public String getTipo() {return this.tipo;}
	public Usuario getUsuario() {return this.usuario;}
	public double getPrecio() {return this.precio;}
	public int getTurnos() {return this.turnoPedido;}


	//dice si el turno pedido (pos en el array) esta libre o no

	public boolean isLibre(int pos) {
		if (this.turnos[pos]=="0")
			return true;
		else 
			return false;
	}

	
}
