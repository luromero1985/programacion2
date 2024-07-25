
public class FiltroCostoMayor extends Filtro {

	private double costo;
	
	public FiltroCostoMayor(double costo){
		this.costo=costo;
	}
	
	@Override
	
	public boolean cumple(Elemento v){
		return (v.getPrecio()>this.costo);
	}
}
