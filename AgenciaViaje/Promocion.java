import java.time.LocalDate;


public class Promocion {
private LocalDate inicio;
private LocalDate fin;
private double descuento;


public Promocion (LocalDate inicio, LocalDate fin, double descuento){
	this.inicio=inicio;
	this.fin=fin;
	this.descuento=descuento;
}


public double getDescuento(Elemento e){
	if((e.getFechaPago()!=null)&&(e.getFechaPago().compareTo(fin))<0 &&(e.getFechaPago().compareTo(inicio))>0){
	return descuento;	
	}
	else {
		return 0;
	}
}
}
