package tp10.act6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Habitacion extends Complejo{
private int superficie;
private int cantCamas;
private LocalDate ultimaOcupacion;
private boolean mascotaOn;

public Habitacion(String n,int sup, int cantCamas, LocalDate ultima, boolean mascota){
	super(n);
	this.superficie=sup;
	this.cantCamas=cantCamas;
	this.ultimaOcupacion=ultima;
	this.mascotaOn=mascota;
}

public int getSuperficie() {
	return superficie;
}

public void setSuperficie(int superficie) {
	this.superficie = superficie;
}

public int getCantCamas() {
	return cantCamas;
}

public void setCantCamas(int cantCamas) {
	this.cantCamas = cantCamas;
}

public LocalDate getUltimaOcupacion() {
	return ultimaOcupacion;
}

public void setUltimaOcupacion(LocalDate ultimaOcupacion) {
	this.ultimaOcupacion = ultimaOcupacion;
}

public boolean isMascotaOn() {
	return mascotaOn;
}

public void setMascotaOn(boolean mascotaOn) {
	this.mascotaOn = mascotaOn;
}


public boolean masSuperficieQue(int s) {
	return this.getSuperficie()>s;
}

// CUANDO HAGO UN ARREGLO DEL RESULTADO DE UNA BUSQUEDA PARA EL HUESPED ¿dEBERIA DEVOLVER UNA COPIA?
//CUANDO GENERO ESTA COPIA MIA PARA ENTRAR EN LA BUSQUEDA, DEBERIA GENERAR UN METODO QUE RETORNE HABITACION O COMPLEJO? O ES INDISTINTO?
/*public Habitacion copiaMia(){
	Habitacion copiaMia = new Habitacion(this.getNombre(),this.getSuperficie(),this.getCantCamas(),this.getUltimaOcupacion(),this.isMascotaOn());
return copiaMia;
}
*/
public ArrayList<Habitacion> habitacionesDisponibles(Filtro f, Comparator<Habitacion> comparador){
	ArrayList<Habitacion> aux= new ArrayList<Habitacion>();
	if(f.cumple(this)){
		aux.add(this);	
	}
		return aux;
}

public int cantHabit(Filtro f){
	if(this.getUltimaOcupacion().isBefore(LocalDate.now()) && f.cumple(this)){
		return 1;
	}
	else{return 0;
	}
}
}
