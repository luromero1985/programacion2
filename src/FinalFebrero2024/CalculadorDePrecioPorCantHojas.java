package FinalFebrero2024;

public class CalculadorDePrecioPorCantHojas extends CalculadorDePrecio{
	private int precioPorHoja;
	private int cantPaginas;

	public CalculadorDePrecioPorCantHojas(int p, int cantPaginas) {
		this.precioPorHoja=p;
		this.cantPaginas=cantPaginas;
	}

	public int getPrecioPorHoja() {
		return precioPorHoja;
	}

	public void setPrecioPorHoja(int precioFijo) {
		this.precioPorHoja = precioFijo;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public int precioFinal() {
		return this.getPrecioPorHoja()* this.getCantPaginas();
	}
}
