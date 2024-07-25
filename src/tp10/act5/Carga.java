package tp10.act5;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Carga {
private String id;
private String destino;
private LocalDate partida;


public Carga (String id, String destino,  LocalDate partida){
	this.id=id;
	this.destino=destino;

	this.partida=partida;
	

}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDestino() {
	return destino;
}

public void setDestino(String destino) {
	this.destino = destino;
}


public LocalDate getPartida() {
	return partida;
}

public void setPartida(LocalDate partida) {
	this.partida = partida;
}
public abstract int getCostoEnvio();
public abstract int getSeguro();
public abstract int precioFinal();
public abstract int CantidadDePaquetes();
public abstract Paquete mayorSeguro();
//public abstract boolean seguroCaro(int plata);
public abstract Carga copiaMia();
public abstract ArrayList<Carga> busqueda(Filtro f);


}
