package Act2_tp1;

public class Electrodomestico_Principal {

	public static void main(String[] args) {
		Electrodomestico electrodomestico1=new Electrodomestico("Batidora");
		System.out.println(electrodomestico1.getInformacion());
		System.out.println("");//doy un salto de linea
		Electrodomestico electrodomestico2=new Electrodomestico("Lavarropas", "Blanco",60,75000, 50 );//si quiero no poner un parámetro, tengo que generar ese constructor?
		System.out.println(electrodomestico2.getInformacion());
		System.out.println("");
		System.out.println("Es " + electrodomestico1.getNombre() + " de bajo consumo? " + electrodomestico1.bajoConsumo());
		System.out.println("Es " + electrodomestico2.getNombre() + " de bajo consumo? " + electrodomestico2.bajoConsumo());
		System.out.println("");
		System.out.println("El balance de " + electrodomestico1.getNombre()+" es "+ electrodomestico1.balance());
		System.out.println("El balance de " + electrodomestico2.getNombre()+" es "+ electrodomestico2.balance());
		System.out.println("");
		System.out.println("El producto " + electrodomestico1.getNombre() + " es de alta Gama?  " + electrodomestico1.altaGama());
		System.out.println("El producto " + electrodomestico2.getNombre() + " es de alta Gama?  " + electrodomestico2.altaGama());
		
	}

}
