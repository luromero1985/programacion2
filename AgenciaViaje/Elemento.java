import java.time.LocalDate;


public abstract class Elemento {
protected int id;
protected String alojamiento;
protected String origen;
protected String destino;
protected LocalDate fechaPago;
protected double precio;
protected int miembros;




public Elemento(int id, String alojamiento, String origen, String destino, double precio, int miembros){
	
	this.id=id;
	this.alojamiento=alojamiento;
	this.origen=origen;
	this.destino=destino;
	this.fechaPago=null;
	this.precio=precio;
	this.miembros=miembros;
}


public void setFechaPago(LocalDate fechaPago){
	this.fechaPago=fechaPago;
}

public abstract double getPrecio();

public abstract String getOrigen();

public abstract String getDestino();

public abstract LocalDate getFechaPago();



public int getMiembros(){
	return this.miembros;
}

public int getId(){
	return this.id;
}


}
