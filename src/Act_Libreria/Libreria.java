package Act_Libreria;

import java.util.ArrayList;

public class Libreria {
	private ArrayList<Cliente>clientes;
	private ArrayList<Articulo>elementos;


	//metodos

	public double getPrecio(Articulo a, Cliente c){
		return a.getPrecio()*(1-c.getDescuento());
	}

	public boolean yaCompro(Cliente c, Articulo a){
		return c.yaCompro(a);
	}

	public boolean leGusta(Articulo a, Cliente c){
		return c.leGusta(a);
	}


	/*
	if (c.getTipo().equals("normalito")) {

	ArrayList<String> autores = c.getAutores();
	for(int i = 0; i<autores.size();i++) {
		if (p.getAutor().equals(autores.get(i))) {
			return true;
		}
	}
	return false;
} else {
	ArrayList<String> autores = c.getAutores();
	boolean encontro = false;
	for(int i = 0; i<autores.size()&&!encontro;i++) {
		if (p.getAutor().equals(autores.get(i))) {
			encontro= true;
		}
	}
	if (!encontro) {
		return false;
	}else {
		ArrayList<String> generos = c.getGeneros();
		for (int i =0; i<generos.size();i++) {
			if (p.tieneGenero(generos.get(i))) {
				return true;
			}
		}
		return false;
	}

}
	 */

	public ArrayList<Cliente>leGustaElProducto(Articulo a){
		ArrayList<Cliente> salida=new ArrayList<Cliente>();

		for (int i=0; i<clientes.size();i++){
			if(clientes.get(i).leGusta(a)){
				salida.add(clientes.get(i));
			}
		}
		return salida;
	}


	public ArrayList<Articulo> recomendados(Cliente c){
		ArrayList<Articulo> salida=new ArrayList<Articulo>();
		for(int i=0;i<elementos.size();i++){
			if(c.leGusta(elementos.get(i))){
				salida.add(elementos.get(i));
			}
		}
		return salida;
	}
	
	
	//generamos el main (no sé por qué acá y no a parte)
	public static void main(String[] args) {
		//contruimos la libreria
		Libreria l1=new Libreria();
		
		//contruimos clientes
		
		Cliente c1= new Cliente("mia", "Diaz","Paz 35", 31254879,0);
		Cliente c2= new ClienteTodoLeVieneBien("Ana", "Lopez","Paz 34", 31458724, 0);	
			
			
		
		//cargamos autores a los clientes y generos a cada cliente
			c1.addAutor("Borges");
			c1.addGenero("comedia");
					

			c2.addAutor("Superman");
			c2.addGenero("drama");
			
			//contruimos los articulos
			Articulo a1=new Articulo ("uno", "Borges", "resumen", 25,300);
			Articulo a2=new Articulo ("El dia que las vacas vuelen", "alguien", "resumen", 200,1500);
			
			
			//al articulo le agrego un genero
			a2.addGenero("drama");
			a2.addGenero("comedia");
			
			
			System.out.println(a2.toString());
			
			System.out.println("Cliente: "+c1.getNombre()+", le gusta el articulo: "+l1.leGusta(a1,c1));
			System.out.println("A"+c1.getNombre()+""+l1.leGusta(a2,c1));
			System.out.println("A"+c2.getNombre()+""+l1.leGusta(a1,c2));
			System.out.println("A"+c2.getNombre()+""+l1.leGusta(a2,c2));
		}

}

	