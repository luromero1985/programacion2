package Act1_tp4;

public class Alarma {
	private boolean vidrioRoto, puertaAbierta, movimiento;
	private Timbre timbre;

	public Alarma(Timbre timbre) {
		this.vidrioRoto = false;
		this.puertaAbierta = false;
		this.movimiento = false;
		this.timbre = timbre;
	}

	public boolean isVidrioRoto() {
		return vidrioRoto;
	}

	public void setVidrioRoto(boolean vidrioRoto) {
		this.vidrioRoto = vidrioRoto;
	}

	public boolean isPuertaAbierta() {
		return puertaAbierta;
	}

	public void setPuertaAbierta(boolean puertaAbierta) {
		this.puertaAbierta = puertaAbierta;
	}

	public boolean isMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public Timbre getTimbre() {
		return timbre;
	}

	public void setTimbre(Timbre timbre) {
		this.timbre = timbre;
	}

	public boolean comprobar(){
		if(vidrioRoto|| puertaAbierta|| movimiento){
			this.timbre.hacerSonar();
			return true;
		}
		else {
			return false;
		}
	}
}
