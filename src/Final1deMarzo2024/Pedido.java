package Final1deMarzo2024;

import java.util.ArrayList;

public class Pedido {
private ArrayList<Comida> pedidos;
private int nroMesa;
private String mozo;

public Pedido(int nro, String mozo){
	this.nroMesa=nro;
	this.mozo=mozo;

	this.pedidos=new ArrayList<>();
}

public int getNroMesa() {
	return nroMesa;
}

public void setNroMesa(int nroMesa) {
	this.nroMesa = nroMesa;
}

public String getMozo() {
	return mozo;
}

public void setMozo(String mozo) {
	this.mozo = mozo;
}

public void addPedido(Comida c){
	this.pedidos.add(c);
}

public ArrayList<Comida> getPedidos(){
	return new ArrayList<Comida>(this.pedidos);
}



}
