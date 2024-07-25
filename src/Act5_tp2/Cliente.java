package Act5_tp2;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Cliente {

	//atributos
	private String Nombre;
	private ArrayList<Peluqueria>peluqueros;
	private LocalDateTime datoDelTurno;

public Cliente(String nombre, LocalDateTime datoDelTurno){
	this.Nombre=nombre;
	this.datoDelTurno=datoDelTurno;
	
}


}
