package Act1_tp4;

public class Luz {
private String nombre;
private boolean prendido;

public boolean isPrendido() {
	return prendido;
}

public void setPrendido(boolean prendido) {
	this.prendido = prendido;
}

public Luz(String luz){
	this.nombre=luz;
	this.prendido=false;
}

 public String getLuz() {
	return nombre;
}

public void setLuz(String luz) {
	this.nombre = luz;
}

public void prendida(){
	this.prendido=true;
	this.toString();
}
public String toString (){
	 return "La luz esta encendida"+ this.nombre;
 }
}
