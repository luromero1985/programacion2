package FinalDiciembre2023;

import java.time.LocalDate;

public class Entidad extends Accion{
private String entidadEmisora;
private LocalDate fechaEmision;
private LocalDate fechaVto;


public Entidad(String nombre, String simbolo, double valorO, String eE, LocalDate fE, LocalDate fV){
	super(nombre, simbolo, valorO);
	this.entidadEmisora=eE;
	this.fechaEmision=fE;
	this.fechaVto=fV;
}


public String getEntidadEmisora() {
	return entidadEmisora;
}


public void setEntidadEmisora(String entidadEmisora) {
	this.entidadEmisora = entidadEmisora;
}


public LocalDate getFechaEmision() {
	return fechaEmision;
}


public void setFechaEmision(LocalDate fechaEmision) {
	this.fechaEmision = fechaEmision;
}


public LocalDate getFechaVto() {
	return fechaVto;
}


public void setFechaVto(LocalDate fechaVto) {
	this.fechaVto = fechaVto;
}
@Override
public void setValorOperado(double v){
	if(this.fechaEmision.isBefore(LocalDate.now())&&this.fechaVto.isBefore(LocalDate.now())){
		super.setValorOperado(v);
	}
}

@Override
public void cerrar(){
	if(this.fechaEmision.isBefore(LocalDate.now())&&this.fechaVto.isBefore(LocalDate.now())){
		super.cerrar();
	}
}
}
