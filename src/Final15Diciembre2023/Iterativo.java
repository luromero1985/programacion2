package Final15Diciembre2023;

import java.util.ArrayList;

public class Iterativo extends Bloque {
	private int repeticion;
	private int porcentajeExtra;


	public Iterativo (int u,int repe,int pe){
		super(u);
		this.repeticion=repe;
		this.porcentajeExtra=pe;
	}


	public int getRepeticion() {
		return repeticion;
	}


	public int getPorcentajeExtra() {
		return porcentajeExtra;
	}


	public void setPorcentajeExtra(int porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}


	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	public int getTiempo(){
		return super.getTiempo()+ Robot.getInstancia().getEstado()*this.getPorcentajeExtra();
	}

	public ArrayList<String> getLista(){

		ArrayList<String> lista= new ArrayList<>();
		ArrayList<String> aux= super.getLista();

		for(int j=0; j<this.getRepeticion();j++){
			lista.addAll(aux);

		}
		return lista;
	}

}
