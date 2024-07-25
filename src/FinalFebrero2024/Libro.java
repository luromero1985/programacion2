package FinalFebrero2024;

import java.util.ArrayList;

public class Libro extends Elemento{
	private String titulo;
	private int anioPublicacion;
	private ArrayList<Elemento>contenido;

	public Libro(Persona revisor, int codigo, String titulo, int anio) {
		super(revisor, codigo);
		this.titulo=titulo;
		this.anioPublicacion=anio;
		this.contenido=new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public void addContenido(Elemento c) {
		if (!this.contenido.contains(c)){
			this.contenido.add(c);
		}

	}

	@Override
	public ArrayList<String> listaTemas(){
		ArrayList<String> lista= new ArrayList<>();
		for(int i=0; i<this.contenido.size(); i++) {
			for(int j=0; j<this.contenido.get(i).listaTemas().size(); j++) {
				String aux = this.contenido.get(i).listaTemas().get(j);
				if(!lista.contains(aux)) {
					lista.add(aux);
				}
			}
		}
		return lista;
	}

	public ArrayList<Persona> getEditores(){
		ArrayList<Persona> listaEditores= new ArrayList<>();
		for(int i=0; i<this.contenido.size();i++) {
			for(int j=0; j<this.contenido.get(i).getEditores().size();j++) {
				Persona aux = this.contenido.get(i).getEditores().get(j);
				listaEditores.add(aux);
			}
		}
		return listaEditores;
	}

	public boolean esEditor(Persona p) {
		int i=0; 
		while(i<this.contenido.size()) {
			i++;
			if(this.contenido.get(i).esEditor(p)) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<Persona> getAutores(){
		ArrayList<Persona> listaAutores = new ArrayList<>();
		for(int i=0; i<this.contenido.size();i++) {
			for(int j=0; j<this.contenido.get(i).getAutores().size();j++) {
				Persona aux= this.contenido.get(i).getAutores().get(j);
				if(!listaAutores.contains(aux)) {
					listaAutores.add(aux);
				}
			}
		}
		return listaAutores;
	}

	public int cantPaginas() {
		int suma=0;
		for(int i=0; i<this.contenido.size();i++) {
			suma += this.contenido.get(i).cantPaginas();
		}
		return suma;
	}

	public Elemento getCopia(Filtro f) {
		ArrayList<Elemento> contenidoCopia = new ArrayList<>();
		for(int i=0; i<this.contenido.size();i++) {
			Elemento elementoBis= this.contenido.get(i).getCopia(f);
			if(elementoBis!=null){
				contenidoCopia.add(elementoBis);
			}
		}
		if(!contenidoCopia.isEmpty()) {
			Libro copiaMia = new Libro(this.getRevisor(),this.getCodigo(),this.getTitulo(),this.getAnioPublicacion());

			for(int i=0; i<contenidoCopia.size();i++) {
				copiaMia.addContenido(contenidoCopia.get(i));
			}
			return copiaMia;
		}
		else {
			return null;}

	}

	public int getPrecio() {
		int suma=0;
		for(int i=0; i<this.contenido.size();i++) {
			suma += contenido.get(i).getPrecio();
		}
		return suma;
	}
}



