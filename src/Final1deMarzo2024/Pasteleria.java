package Final1deMarzo2024;

import java.util.ArrayList;

public class Pasteleria {
	private ArrayList<Estacion> estaciones;
	//private ArrayList<Comida> comidasDeCarta;
	private Adicional adicional;


	public Pasteleria(Adicional a){
		this.estaciones=new ArrayList<>();
		/*this.comidasDeCarta=new ArrayList<Comida>();*/
		this.adicional=a;
	}

	public void asignarComida(Pedido p){
		int j=0;
		for(int i=0;i<p.getPedidos().size();i++){
			while(!this.estaciones.get(j).puedoPreparar(p.getPedidos().get(i)) && j<this.estaciones.size()){
				j++;
			}
			if(j<this.estaciones.size()){
				this.estaciones.get(j).comidaRecibida(p.getPedidos().get(i);
			}
		}
	}

	/*public void addComidasDeCarta(Comida c){
		if(!this.comidasDeCarta.contains(c)){
			this.comidasDeCarta.add(c);
		}
	}
*/
	public void addEstacion(Estacion e){
		if(!this.estaciones.contains(e)){
			this.estaciones.add(e);
		}
	}

	public double costoTotal(Pedido p){
		int suma=0;
		for(int i=0;i<p.getPedidos().size();i++){
			suma += p.getPedidos().get(i).getPrecio() +
					this.adicional.extra(p.getPedidos().get(i));

		}
		return suma	;
	}
}
