package Act_Libreria;

import java.util.ArrayList;

public class Cliente {
	private int dni;
	private double descuento;
	private String nombre, apellido, direccion;
	protected ArrayList<String>generos;
	private ArrayList<String>autores;
	private ArrayList<Articulo>compras;


	//constructores

	public Cliente(String nombre, String apellido, String direccion, int dni, double descuento){
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.dni=dni;
		this.descuento=descuento;
		compras=new ArrayList<Articulo>();
		autores=new ArrayList<String>();
		generos=new ArrayList<String>();
	}


	public boolean leGusta(Articulo art){
		return autores.contains(art.getAutor());
	}

	public void addAutor(String a) {
		if (! autores.contains(a))
			autores.add(a);
	}

	public boolean leGustaAutor(String a) {
		return autores.contains(a);
	}

	public void borrarAutor(String a) {
		autores.remove(a);
	}

	public void addGenero(String a) {
		if (! generos.contains(a))
			generos.add(a);
	}

	public boolean leGustaGenero(String a) {
		return generos.contains(a);
	}

	public void borrarGenero(String a) {
		generos.remove(a);
	}

	public void addCompra(Articulo a) {
		if (! compras.contains(a))
			compras.add(a);
	}

	public boolean yaCompro(Articulo a) {
		return compras.contains(a);
	}

	public void borrarCompra(Articulo a) {
		compras.remove(a);
	}

	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	public String toString() {
		return nombre + compras ;
	}


}
