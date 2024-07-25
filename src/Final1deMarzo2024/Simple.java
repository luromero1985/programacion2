package Final1deMarzo2024;

public class Simple extends Comida{
private int calorias;
private int precio;
private int tiempo;


public Simple(String n, String t, String p, int c, int precio, int tiempo){
	super(n,t,p);
	this.calorias=c;
	this.precio=precio;
	this.tiempo=tiempo;
}


public int getCalorias() {
	return calorias;
}


public void setCalorias(int calorias) {
	this.calorias = calorias;
}


public int getPrecio() {
	return precio;
}


public void setPrecio(int precio) {
	this.precio = precio;
}


public int getTiempo() {
	return tiempo;
}


public void setTiempo(int tiempo) {
	this.tiempo = tiempo;
}



}
