package tp10.act5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paquete extends Carga{
	private int costoEnvio;
	private int seguro;
	
	public Paquete(String id, String destino, int costoEnvio, LocalDate partida, int seguro){
		super(id,destino,partida);
		this.seguro=seguro;
		this.costoEnvio=costoEnvio;
	}
	public int getCostoEnvio() {
		return costoEnvio;
	}

	public void setCostoEnvio(int costoEnvio) {
		this.costoEnvio = costoEnvio;
	}
	public int getSeguro() {
		return seguro;
	}

	public void setSeguro(int seguro) {
		this.seguro = seguro;
	}

public int precioFinal(){
	return this.getCostoEnvio()+this.getSeguro();
}
public int CantidadDePaquetes(){
	return 1;
}

public Paquete mayorSeguro(){
	return this;
}
/*
public boolean seguroCaro(int plata){
	if(this.getSeguro()>plata){
		return true;
	}
	else return false;
}*/

public Carga copiaMia(){
	Carga copia= new Paquete(this.getId(),this.getDestino(),this.getCostoEnvio(),this.getPartida(), this.getSeguro());
return copia;
}

public ArrayList<Carga> busqueda(Filtro f){
	if(f.cumple(this)){
		ArrayList<Carga> aux = new ArrayList<>();
		aux.add(this);
	return aux;
	}
	return null;
}

}
