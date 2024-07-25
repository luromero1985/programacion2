package Final15Diciembre2023;

import java.util.ArrayList;

public abstract class Comando {

	public abstract int getGasto();
	public abstract int getTiempo();
	public abstract boolean contengoComando(String s);
	public abstract Comando copia(Filtro f);
	public abstract ArrayList<String> getLista();
}
