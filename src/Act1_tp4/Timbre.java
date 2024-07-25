package Act1_tp4;

public class Timbre {
	private String nombreTimbre;
	private boolean sonando;



	public Timbre(String nombreTimbre){
		this.nombreTimbre=nombreTimbre;
		this.sonando=false;
	}


	public boolean isSonando() {
		return sonando;
	}


	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}


	public String getNombreTimbre() {
		return nombreTimbre;
	}


	public void setNombreTimbre(String nombreTimbre) {
		this.nombreTimbre = nombreTimbre;
	}


	public void hacerSonar(){
		this.sonando=true;
		this.toString();
	}
	
@Override
	public String toString(){
		return ("El"+ this.getNombreTimbre()+ "esta sonando?:"+this.isSonando());
	}
}
