package tp10.act5;

import java.time.LocalDate;
import java.util.ArrayList;

public class ComboPromocional extends Combo{
	public ComboPromocional(String id, String destino, LocalDate partida, Filtro f){
		super(id,destino,partida,f);
		
	}
public int precioFinal(){
int suma= super.precioFinal();
	
	return suma/this.CantidadDePaquetes();
}
}
