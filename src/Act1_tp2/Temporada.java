package Act1_tp2;

import java.util.ArrayList;

public class Temporada {

	// la clase Temporada tiene un array con los objetos episodios 
	private int numeroTemporada;
	private ArrayList<Episodio>episodios;
	// ArrayList<Tipo> nombre = new ArrayList<Tipo>()



//contructores
public Temporada(int nroTemp){
	this.numeroTemporada=nroTemp;
	this.episodios=new ArrayList<>(); //creo un arrayList vacio 
	
}


//metodos

public void addEpisodio(Episodio epis) {
	if (!this.episodios.contains(epis))   //si el array episodio no contiene al episodio que entra por consola, entonces lo agregamos a la lista
		this.episodios.add(epis);
}

public int getCantidadEpisodiosVistos() {
	int contador = 0;
	if (episodios.size()!=0){
	for (int i = 0; i < this.episodios.size(); i++) {
		// Preguntar si el episodio de la posicion i fue visto
		Episodio epis_i = this.episodios.get(i);
		if (epis_i.isVisto()) // es de la clase Episodio 
			contador++;
	}
	}
	return contador;
}

public int getCantidadEpisodios() {
	return this.episodios.size();
}

public double getCalifPromedio() {
	int suma = 0;
	int cont = 0;
	for (int i = 0; i < this.episodios.size(); i++)
		if (this.episodios.get(i).isVisto()) {
			suma += this.episodios.get(i).getCalificacion();
			cont++;
		}
	
	return (double)(suma/cont);
}

public boolean isTodosVistos() {
	return this.getCantidadEpisodios() == 
			this.getCantidadEpisodiosVistos();
}


public int getNumeroTemporada() {
	return numeroTemporada;
}


}
