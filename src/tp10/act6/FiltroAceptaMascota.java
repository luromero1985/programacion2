package tp10.act6;

public class FiltroAceptaMascota extends Filtro {
//PREGUNTAR COMO SE TRABAJA EL BOOLEANO CON FILTRO
public boolean cumple(Habitacion h) {
	return h.isMascotaOn()==true;
}
}


