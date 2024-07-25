package FinalFebrero2024;

public class CalculadorDePrecioAnd extends CalculadorDePrecio{
private CalculadorDePrecio C1;
private CalculadorDePrecio C2;


public CalculadorDePrecioAnd (CalculadorDePrecio c1, CalculadorDePrecio c2) {
	this.C1=c1;
	this.C2=c2;
}


public CalculadorDePrecio getC1() {
	return C1;
}


public void setC1(CalculadorDePrecio c1) {
	C1 = c1;
}


public CalculadorDePrecio getC2() {
	return C2;
}


public void setC2(CalculadorDePrecio c2) {
	C2 = c2;
}

public int precioFinal() {
	return this.C1.precioFinal() + this.C2.precioFinal();
}
}
