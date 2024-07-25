package FinalFebrero2024;

public class CalculadorDePrecioPorAutores extends CalculadorDePrecio  {
private int cantAutores;
private int precioPorAutores;

public CalculadorDePrecioPorAutores(int cantAutores, int precioPorAutores) {
this.cantAutores=cantAutores;
this.precioPorAutores=precioPorAutores;
}

public int getCantAutores() {
	return cantAutores;
}

public void setCantAutores(int cantAutores) {
	this.cantAutores = cantAutores;
}

public int getPrecioPorAutores() {
	return precioPorAutores;
}

public void setPrecioPorAutores(int precioPorAutores) {
	this.precioPorAutores = precioPorAutores;
}


public int precioFinal() {
	return this.getCantAutores()*this.getPrecioPorAutores();
}
}