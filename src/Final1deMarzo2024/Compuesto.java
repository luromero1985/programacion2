package Final1deMarzo2024;

import java.util.ArrayList;

public class Compuesto extends Comida {
private ArrayList<Comida>ingredientes;


public Compuesto(String n, String t, String p){
super(n,t,p);
this.ingredientes=new ArrayList<>();

}

public int getPrecio(){
	int suma=0;
	for(int i=0; i<this.ingredientes.size(); i++){
		suma+=this.ingredientes.get(i).getPrecio();
	}
	return suma;
}

public int getCalorias(){
	int suma=0;
	for(int i=0; i<this.ingredientes.size(); i++){
		suma+=this.ingredientes.get(i).getCalorias();
	}
	return suma;
}

public int getTiempo(){
	int suma=0;
	for(int i=0; i<this.ingredientes.size(); i++){
		suma+=this.ingredientes.get(i).getTiempo();
	}
	return suma;
}
}
