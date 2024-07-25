import java.time.LocalDate;


public class Viaje extends Elemento {

	Promocion promo;

	public Viaje (int id, String alojamiento, String origen, String destino, double precio, int miembros, Promocion promo){
		super(id, alojamiento, origen, destino, precio, miembros);
		this.promo=promo;
	}

	
	
	public double getDescuento(){
		return this.promo.getDescuento(this);	
	}

	@Override
	public double getPrecio(){
		return this.precio*(100-this.getDescuento())/100;
	}


	@Override
	public String getOrigen(){
		return this.origen;
	}

	@Override
	public String getDestino(){
		return this.destino;
	}


	@Override
	public LocalDate getFechaPago(){
		return this.fechaPago;
	}



}
