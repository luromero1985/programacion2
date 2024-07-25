package Act1_tp2;

import java.util.ArrayList;

public class Serie {
	
	//atributos
private String titulo;
private String descripcion;
private String creador;
private String genero;
private ArrayList<Temporada> temporadas;




//contructores
public Serie(String titulo, String descrip, String creador, String genero){
	this.titulo=titulo;
	this.descripcion=descrip;
	this.creador=creador;
	this.genero=genero;
	this.temporadas = new ArrayList<>();
	
}
 
//metodos
public void addTemporada(Temporada t) {
	this.temporadas.add(t); // Se podria chequear que no haya repetidos
}

public int getCantidadEpisodiosVistos() {
	int suma = 0;
	for (int i = 0; i < this.temporadas.size(); i++) 	//  es lo mismo hacer -->  for (Temporada t: temporadas){ //foreach (tipo elemento : nombre_array)
		suma += this.temporadas.get(i).getCantidadEpisodiosVistos();  //es de la clase temporada
	
	return suma;
}

public boolean isTodosVistos() {		
	for (int i = 0; i < this.temporadas.size(); i++)
		if (!this.temporadas.get(i).isTodosVistos())
			return false;
	
	return true;
}

public String getTitulo() {
	return titulo;
}

public String getDescripcion() {
	return descripcion;
}

public String getCreador() {
	return creador;
}

public String getGenero() {
	return genero;
}


//no traer ni pedir listas de arreglos completas, esto se resuelve agregando de a un elemento con add

//public ArrayList<Temporada> getTemporadas() {
	//return temporadas;
//}

//public void setTemporadas(ArrayList<Temporada> temporadas) {
//	this.temporadas = temporadas;
//}



}
