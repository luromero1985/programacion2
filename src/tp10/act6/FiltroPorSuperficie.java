package tp10.act6;

public class FiltroPorSuperficie extends Filtro{
private int superficie;

public FiltroPorSuperficie(int s) {
	this.superficie=s;
}

public boolean cumple(Habitacion h) {
	return h.masSuperficieQue(this.superficie);
}
}
