package FinalFebrero2024;

public class CalculadorDePrecioFijo extends CalculadorDePrecio{
	private int precioFijo;


	public CalculadorDePrecioFijo(int p) {
		this.precioFijo=p;

	}

	public int precioFinal() {
		return precioFijo;
	}

	public void setPrecioFijo(int precioFijo) {
		this.precioFijo = precioFijo;
	}

	
}
