package Prefinal1_12_23;

public class Avanzada extends Complejo{

	public Avanzada(String nombre, int costo) {
		super(nombre, costo);
	
	}

	@Override
	public int getTiempo(){
		int mayorTiempo=0;
		for(int i=0; i<this.presupuestos.size(); i++){
			if(mayorTiempo<this.presupuestos.get(i).getTiempo()){
				mayorTiempo=this.presupuestos.get(i).getTiempo();
			}
		}
		return mayorTiempo;
	}
	
	@Override
	public int getCantEmpleados() {
		int suma=0;
				for(int i=0; i<this.presupuestos.size(); i++){
			suma+=this.presupuestos.get(i).getCantEmpleados();
				}
				return suma;
	}
	
	
	
}
