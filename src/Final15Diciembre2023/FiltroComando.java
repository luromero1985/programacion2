package Final15Diciembre2023;

public class FiltroComando {
	private String comando;

	public FiltroComando(String c){
		this.comando=c;
	}

	public boolean cumple(Comando c){
		return c.contengoComando(comando);
	}
}
