package Final15Diciembre2023;

import java.util.ArrayList;

public class Simple extends Comando {
	private String comando;
	private int tiempo;
	private int gasto;

	public Simple(String c, int t, int g){
		this.comando=c;
		this.tiempo=t;
		this.gasto=g;
	}

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public int getGasto() {
		return gasto;
	}

	public void setGasto(int gasto) {
		this.gasto = gasto;
	}

	public boolean contengoComando(String s){
		return this.getComando().equals(s);
	}

	public Comando copia(Filtro f){
		if(f.cumple(this)){
			Simple copia= new Simple(this.getComando(), this.getTiempo(),this.getGasto());
			return copia;
		}
		return null;
	}

	public ArrayList<String> getLista(){
		ArrayList<String> lista= new ArrayList<>();
		lista.add(this.getComando());
		return lista;
	}
}
