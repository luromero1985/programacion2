package Act_Libreria;

import java.util.ArrayList;

public class Articulo {
	//atributos
	String nombre, autor, resumen;
	double precio;
	int cantidadPaginas;
	ArrayList<String> generos;

	//constructores
	public Articulo(String nombre, String autor, String resumen,int cantidadPaginas, double precio ){
		super();
		this.nombre=nombre;
		this.autor=autor;
		this.resumen=resumen;
		this.generos=new ArrayList<String>();
		this.cantidadPaginas=cantidadPaginas;
		this.precio=precio;
	}

	//getter y setter, menos del array

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	//otros metodos

	//si el array genero no tiene al genero cargado, entonces agregalo.
	public void addGenero(String a){
		if (!generos.contains(a)){
			generos.add(a);
		}
	}

		//public void setGeneros(ArrayList<String>lista){ //paso por copia, creo un nuevo array y le pongo los elementos
		//this.genero=new ArrayList<>(lista);
		//}

		public boolean tieneGenero(String a){
			return generos.contains(a);
		}

		public void borrarGenero(String a){
			generos.remove(a);
		}

		public String toString(){
			return "Articulo[nombre= "+nombre+", autor= "+autor+", resumen= "+resumen+", generos= "+generos+", cantidad de paginas= "+cantidadPaginas+", precio= "+precio+"]";

		}

		/*
		 * La anotación @Override simplemente se utiliza, para forzar al compilador a comprobar en tiempo de compilación que estás sobrescribiendo 
		 * correctamente un método, y de este modo evitar errores en tiempo de ejecución, los cuales serían mucho más difíciles de detectar.
		 */

		@Override
		public boolean equals(Object o1){
			try{
				Articulo elOtro=(Articulo)o1;
				return nombre.equalsIgnoreCase(elOtro.getNombre())&& autor.equalsIgnoreCase(elOtro.getAutor());
			}
			catch(Exception e){
				return false;
			}
		}
	} 

