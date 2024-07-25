import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;


public class Paquete extends Elemento {
	private ArrayList<Elemento> elementos;



	public Paquete (int id, String alojamiento, String origen, String destino, double precio, int miembros){
		super(id, alojamiento, origen, destino, precio, miembros);
		this.elementos= new ArrayList <>();
	}



	public void agregarViaje(Viaje v){
		if(elementos.isEmpty())
			elementos.add(v);
		else
			if( v.getOrigen().equals(elementos.get(elementos.size()-1).getDestino()) )
				elementos.add(v);
	}

	@Override
	public double getPrecio(){
		double precio=0;
		for(int i=0; i<this.elementos.size(); i++){
			precio=precio+this.elementos.get(i).getPrecio();
		}
		return precio;
	}

	@Override
	public String getOrigen(){
		return elementos.get(0).getOrigen();
	}

	@Override
	public String getDestino(){
		return elementos.get(elementos.size()-1).getDestino();
	}

	public LocalDate getFechaPago() {
		ArrayList <Elemento> copia = new ArrayList<>(elementos);
		LocalDate fecha = null;
		for (int i=0; i<elementos.size(); i++)
			if (elementos.get(i).getFechaPago() == null)  
				return fecha;
		Collections.sort(copia, Collections.reverseOrder(new ComparadorFechaPago()));  
		return copia.get(0).getFechaPago();

	}

}

