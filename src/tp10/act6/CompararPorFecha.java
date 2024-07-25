package tp10.act6;
//consultar si es correcto el manejo de LocalDate
import java.util.Comparator;

public class CompararPorFecha implements Comparator<Habitacion>{

	public int compare(Habitacion h1, Habitacion h2) {
		return h1.getUltimaOcupacion().compareTo(h2.getUltimaOcupacion());
	}
}
