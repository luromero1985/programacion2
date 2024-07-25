import java.time.LocalDate;
import java.time.Period;

public class Persona {
	//atributos del objeto Persona, recordar que son privados.
	private String nombre, apellido;
	private int edad; 
	private String sexo;
	private LocalDate fnac;
	private long dni;
	private double peso, altura;
	
	//definimos las constantes.
	private static final double minimoMasaCorporal=18.5;  //publicas o privadas?
	private static final double maxMasaCorporal=25;
	private static final int mayoriaDeEdad=18;
	private static final int edadVotar=16;
	
	//generamos los contructores
	//si tengo contructores repetidos, puedo generar un contrucor que llame constructores.
	
	//Constructor total
	public Persona(long dni, String nombre, String apellido, int edad, LocalDate fnac, String sexo, double peso, double altura){
		
		this.dni=dni;
		this.nombre=nombre; //el this lo utilizo porque no puedo ponerle el nombre a la variable igual a un nombre d ela clase.
		this. apellido=apellido;//si no lo paso por parametro sería apellido="N"
		this.edad=edad;
		this.fnac=fnac; //no es necesario poner this, porque a esta variable no la utilice por parámetros, lo gtrae de la clase
		this. sexo=sexo;
		this.altura=altura; 
		this.peso=peso; 
					
	}
	
	//Contructor Persona DNI
		
	public Persona (long dni){
		this(dni, "N", "N", 10, LocalDate.of(2000, 1, 1), "Femenino, 1, 1");
	}
	
	//Contructor Persona DNI, Nombre, apellido
	
	public Persona (long dni, String nombre, String apellido){ 
		this(dni, nombre, apellido,10, LocalDate.of(2000, 1, 1),"femenino", 1, 1);
	}
	
	//Contructor Persona DNI, Nombre, apellido, edad

	public Persona (long dni, String nombre, String apellido, int edad){ 
		this(dni, nombre, apellido, edad, LocalDate.of(2000, 1, 1), "femenino", 1, 1);
	}
	
	public Persona (long dni, String nombre, String apellido, int edad, LocalDate fnac){ 
		this (dni, nombre, apellido, edad, fnac, "femenino", 1, 1);

	}

	public Persona (long dni, String nombre, String apellido, int edad, LocalDate fnac, String sexo){ 
		this (dni, nombre, apellido, edad, fnac, sexo, 1,1);
		
	}
	
	public Persona (long dni, String nombre, String apellido, int edad, LocalDate fnac, String sexo, double peso){
		this(dni, nombre, apellido, edad, fnac, sexo, peso, 1);
	}

	
		/*this.dni=dni; //el this lo utilizo porque no puedo ponerle el nombre a la variable igual a un nombre de la clase.
			this.nombre=nombre; //si no lo paso por parametro sería apellido="N"
			this. apellido=apellido;
			fnac=LocalDate.of(2000,1,1); //no es necesario poner this, porque a esta variable no la utilice por parámetros, lo trae de la clase
			peso=1; 
			altura=1; */
	
	
	//creamos los métodos
	
	public double calculoMasaCorporal(){
		double masaCorporal=peso/Math.pow(altura, 2);
		return masaCorporal; //(this.getPeso()/(this.getAltura()*this.getAltura())); Es correcto esto último?
	}

	public boolean estaEnForma(){
		double masaCorporal = this.calculoMasaCorporal();
		if(minimoMasaCorporal<=masaCorporal && masaCorporal <=maxMasaCorporal){
			return true;
					}
		else {
			return false;
		}
	}
	
	public boolean estaCumpliendoAnios(){
		Period diferencia=Period.between(fnac, LocalDate.now());
		if ((diferencia.getDays()==0) && (diferencia.getMonths()==0)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean esMayorDeEdad() {
		Period difEdad = Period.between(fnac, LocalDate.now());
		if (difEdad.getYears() >= mayoriaDeEdad) {

			return true;

		} else {

			return false;
		}
	}
	
	public boolean puedeVotar(){
		Period difEdad=Period.between(fnac, LocalDate.now());
		if (difEdad.getYears()>= edadVotar){
			return true; 
		}
		else{
			return false;
		}
	}
	
	public int edadActual(){
		int edad;
		Period difEdad = Period.between(fnac, LocalDate.now());
		edad= difEdad.getYears();
		return edad;
	}
	
	public boolean esCoherente(){
		if(this.edad==edadActual()){
			return true;
		}
		else{
			return false;
		}
	}
	
	//construimos los metodos get y set
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public LocalDate getFnac() {
		return fnac;
	}
	
	public long getDni(){
		return dni;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setFnac(LocalDate fnac) {
		this.fnac = fnac;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	/*public void setDni(long dni){   //la consigna dice que no hagamos set de dni
		if (dni>0){
			this.dni=dni;
		}
		else{
			dni=0;
		}
	}*/
	
	public String getInformacion(){
		return "Nombre: "+nombre+". \nApellido: "+apellido+ ". \nEdad: " + edad + ". \nFecha de nacimiento: "
				+ fnac + ". \nSexo: " + sexo + ". \nPeso: " + peso + "kgs. \nAltura: " + altura + "mts.";
	}
}
	
	


















