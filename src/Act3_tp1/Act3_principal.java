package Act3_tp1;

public class Act3_principal {

	public static void main(String[] args) {
		Punto_Geometrico punto1=new Punto_Geometrico();
		Punto_Geometrico punto2=new Punto_Geometrico(1,2);
		Punto_Geometrico punto3=new Punto_Geometrico(-3,7);
		
		Rectangulo rectangulo1= new Rectangulo(punto2, 4, 1 ); 
		Rectangulo rectangulo2= new Rectangulo(punto3, 3, 6 ); 
		
		System.out.println("\nlas coordenadas del punto son:");
		System.out.println(punto1.mostrarCoordenadasPunto());
		System.out.println(punto2.mostrarCoordenadasPunto());
		System.out.println(punto3.mostrarCoordenadasPunto());
		
		
		System.out.println("\n El punto desplazado: ");
		punto1.desplazarVertice(punto1,5,3);
		System.out.println(punto1.mostrarCoordenadasPunto());
		
		
		System.out.println("\nLa distancia Euclidea entre (7;1) y"+ punto3.mostrarCoordenadasPunto()+" es ");
		System.out.println(" es "+punto3.distancia_euclidea(7,1));
	
		
		//mostramos coordenadas de los vertices del rectangulo
		System.out.println("\nLas coordenadas de los vértices del rectángulo son: \n"+ rectangulo1.mostrarCoordenadasVerticesRectangulo());
		
		
		
		//desplazamiento del rectangulo
	System.out.println("\nLas coordenadas de los vértices del rectángulo desplazado son: "); 
		rectangulo1.desplazarRectangulo(-3, 2);
		System.out.println(rectangulo1.mostrarCoordenadasVerticesRectangulo());
		
		
		//base del rectangulo
		
		System.out.println("\nLa base del rectangulo mide "+rectangulo1.baseRectangulo()+"cm");
		
		
		//altura del rectangulo
		System.out.println("\nLa altura del rectangulo mide "+rectangulo1.alturaRectangulo()+"cm");
		
		
		//área del rectangulo
		System.out.println("\nEl área del rectangulo mide "+rectangulo1.areaRectangulo()+"cm");
		
		//rectangulo mayor
		
		System.out.println("El rectangulo con base "+rectangulo1.baseRectangulo()+"cm y altura "+rectangulo1.alturaRectangulo()+"cm, es mayor al rectangulo con base "+ rectangulo2.baseRectangulo()+" cm y altura "+rectangulo2.alturaRectangulo()+"? "+rectangulo1.rectanguloMayor(rectangulo2));
		
		
		//rectangulo cuadrado
		
		System.out.println("El rectangulo con base "+rectangulo1.baseRectangulo()+"cm y altura "+rectangulo1.alturaRectangulo()+"cm, es un cuadrado? "+rectangulo1.Cuadrado(rectangulo1));
		
		
		//posición del rectangulo
		
		System.out.println(rectangulo1.posicionRectangulo(rectangulo1));
	}
}
