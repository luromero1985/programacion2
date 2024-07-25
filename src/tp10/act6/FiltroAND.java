package tp10.act6;

public class FiltroAND extends Filtro{
	private Filtro f1;
	private Filtro f2;

	public FiltroAND(Filtro f1, Filtro f2) {
		this.f1=f1;
		this.f2=f2;
	}

	public boolean cumple(Habitacion h) {
	return f1.cumple(h)&&f2.cumple(h);
	}

}
