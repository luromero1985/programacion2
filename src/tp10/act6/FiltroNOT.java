package tp10.act6;

public class FiltroNOT {
	private Filtro f;


	public FiltroNOT(Filtro f) {
		this.f=f;
	}

	public boolean cumple(Habitacion h) {
	return !f.cumple(h);
	}

}
