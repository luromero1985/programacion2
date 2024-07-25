package Act3_tp1;

public class Rectangulo{
	//atributos
	private Punto_Geometrico vertice1;
	private Punto_Geometrico vertice2;
	private Punto_Geometrico vertice3;
	private Punto_Geometrico vertice4;

	//constructor
	public Rectangulo(Punto_Geometrico punto,double base, double altura){
		this.vertice1=punto;

		if (base!=0 && altura!=0){
			setVertice1(punto);
			setVertice2(new Punto_Geometrico(punto.getX()+base, punto.getY()));
			setVertice3(new Punto_Geometrico(punto.getX()+base, punto.getY()+altura));
			setVertice4(new Punto_Geometrico(punto.getX(), punto.getY()+altura));
		}
		else {
			//hacer algo por defecto
			System.out.println("la base y  la altura deben ser distintas de cero");
		}
	}

	//constructor por defecto
	public Rectangulo(Punto_Geometrico punto1){
		this(punto1,1,1);

	}

	//setter (permite que desde afuera se modifique los valores de las variables)

	private void setVertice1(Punto_Geometrico v1 ){
		this.vertice1=v1;
	}

	private void setVertice2(Punto_Geometrico v2 ){
		this.vertice2=v2;

	}

	private void setVertice3(Punto_Geometrico v3 ){
		this.vertice3=v3;
	}
	private void setVertice4(Punto_Geometrico v4 ){
		this.vertice4=v4;
	}

	//getter (permite consultar los valores de las variables)

	public Punto_Geometrico getVertice1() {
		return vertice1;
	}
	public Punto_Geometrico getVertice2() {
		return vertice2;
	}
	public Punto_Geometrico getVertice3() {
		return vertice3;
	}
	public Punto_Geometrico getVertice4() {
		return vertice4;
	}



	//metodos
	


	public String mostrarCoordenadasVerticesRectangulo(){
		return "Vertice 1:\t (" + this.getVertice1().getX() + " ; " + this.getVertice1().getY() + ") \nVertice 2:\t (" +
				this.getVertice2().getX() + " ; " + this.getVertice2().getY() + ") \nVertice 3:\t (" + this.getVertice3().getX() +
				" ; " + this.getVertice3().getY() + ") \nVertice 4:\t (" + this.getVertice4().getX() + " ; " + this.getVertice4().getY() + ")";
	}


	//aplico desplazamiento a todos los puntos
	public void desplazarRectangulo(double desplx, double desply){
		this.getVertice1().desplazarVertice(vertice1,desplx,desply);
		this.getVertice2().desplazarVertice(vertice2,desplx,desply);
		this.getVertice3().desplazarVertice(vertice3,desplx,desply);
		this.getVertice4().desplazarVertice(vertice4,desplx,desply);
	}	

	//calculo el area del rectangulo

	//calculo la base

	public double baseRectangulo (){
		double base=vertice1.getX()-vertice2.getX();
		if (base>0){
			return base;
		}
		else{
			return -base;
		}
	}
	
	//calculo la altura
	public double alturaRectangulo (){
		double altura=vertice1.getY()-vertice3.getY();
		if (altura>0){
			return altura;
		}
		else{
			return -altura;
		}
	}

	public double areaRectangulo(){
		double area=alturaRectangulo()*baseRectangulo();
		return area;
	}


	//comparacion de rectangulos
	
	public boolean rectanguloMayor(Rectangulo rectangulonuevo){
		if(rectangulonuevo.areaRectangulo()>areaRectangulo()){
			return true;
		}
		else {
			return false;
		}
	}
	
	//identificaciond de cuadrados
	public boolean Cuadrado(Rectangulo rectangulo){
		if(rectangulo.baseRectangulo()==rectangulo.alturaRectangulo()){
			return true;
		}
		else{
			return false;
			}	
		}
	
	//posicion del rectangulo
	
	public String posicionRectangulo(Rectangulo rectangulo){
		if(rectangulo.baseRectangulo()<rectangulo.alturaRectangulo()){
			return "El rectangulo está parado";
		}
		else if (rectangulo.baseRectangulo()>rectangulo.alturaRectangulo()){
			return "El rectangulo está acostado";
		}
		else{
			return "El rectangulo es cuadrado";
		}
	}
	
	
}

