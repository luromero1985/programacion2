package Act2_tp1;

public class Electrodomestico {
	//atributos
private String nombre;
private double precioBase;
private String color;
private double consumoEnerg;
private double peso;

//constantes
private static final double MAXCONSUMO=45;
private static final double MINBALANCE=3;

//constructores

//constructor total
public Electrodomestico(String nombre, String color, double cnsmEnrg, double prcBase, double peso){
	this.nombre=nombre;
	this.color=color;
	this.consumoEnerg=cnsmEnrg;
	this.precioBase=prcBase;
	this.peso=peso;
}

public Electrodomestico(String nombre){
	this(nombre, "Gris Plata", 10, 100, 2);
	}

public Electrodomestico(String nombre, String color){
	this(nombre, color, 10, 100, 2);
}

public Electrodomestico(String nombre, String color, double cnsmEnrg){
	this(nombre, color, cnsmEnrg, 100, 2);
}

public Electrodomestico(String nombre, String color, double cnsmEnrg, double prcBase){
	this(nombre, color, cnsmEnrg, prcBase, 2);
}

//contruimos los métodos

public boolean bajoConsumo(){
	
	if(this.consumoEnerg<MAXCONSUMO){
		return true;
	}
	else{
		return false;
	}
}

	
	public double balance(){
		double balance=precioBase/peso;
		
	return balance;
	}
	
	public boolean altaGama(){
		double altaGama=this.balance();
		if (altaGama>MINBALANCE){
			return true;
		}
		else{
			return false;
		}
	}
	
//contruimos los metodos get y set
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecioBase() {
	return precioBase;
}

public void setPrecioBase(double precioBase) {
	this.precioBase = precioBase;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getConsumoEnerg() {
	return consumoEnerg;
}

public void setConsumoEnerg(double consumoEnerg) {
	this.consumoEnerg = consumoEnerg;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

//imprimimos la información del producto

public String getInformacion(){
	return "Nombre: "+nombre+". \nColor: "+color+ ". \nConsumo Energético: " + consumoEnerg + "Kw. \nPrecio base: $ "
			+ precioBase + ". \nPeso: " + peso + " Kg.";
}





}
