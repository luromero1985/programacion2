
public class FiltroDestino extends Filtro {

	
	private String destinoBuscado;
	public FiltroDestino(String destinoBuscado){
		this.destinoBuscado=destinoBuscado;
	}
	
	
	@Override
	public boolean cumple(Elemento v){
		return v.getDestino().equals(this.destinoBuscado);
	}
}
