package Act3_tp1;

public class Punto_Geometrico {
	//atributos
private double X,Y;

//constructores
public Punto_Geometrico(double x,double y){
	this.X=x;
	this.Y=y;
}
//colocamos valores por defecto
public Punto_Geometrico(){
	this(0,0);
}
//Métodos

//desplazamiento en el plano

public Punto_Geometrico desplazarVertice(Punto_Geometrico pto, double desplx, double desply){
	pto.setX(pto.getX()+desplx);
	pto.setY(pto.getY()+desply);
	
	return pto;
}

public double distancia_euclidea(double nuevox, double nuevoy){
	
	double euclidea=Math.sqrt( Math.pow(X-nuevox,2)+Math.pow(Y-nuevoy, 2));
	return euclidea; }

public String mostrarCoordenadasPunto(){
    return "(" + this.getX() + "; " + this.getY() + ")";
  }


public double getX() {
	return X;
}
public void setX(double x) {
	X = x;
}
public double getY() {
	return Y;
}
public void setY(double y) {
	Y = y;
}



}
