package FinalDiciembre2023;

public class FiltroPorVariacionEntrePosicion extends Filtro{

	private int pos1, pos2;
	private int porcentaje;
	
	public FiltroPorVariacionEntrePosicion(int p1, int p2, int porc){
		this.pos1=p1;
		this.pos2=p2;
		this.porcentaje=porc;
	}
	
	public boolean cumple(Inversion i){
		double aux=i.porcentajeVariacionPosicion(pos1, pos2);
				return aux>this.porcentaje;
	}
}
