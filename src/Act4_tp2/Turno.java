package Act4_tp2;
import java.time.LocalDateTime;

public class Turno {
	private int nroTurno;
	private Usuario usuario;
	private Cancha cancha;
	private LocalDateTime inicioTurno;
	private int duracionTurno;

	public Turno(int nroTurno, Usuario usuario, Cancha cancha, LocalDateTime inicioTurno) {
		this.nroTurno = nroTurno;
		this.usuario = usuario;
		this.cancha = cancha;
		this.inicioTurno = inicioTurno;
		this.duracionTurno = 1;
	}

	public Turno(int nroTurno, Usuario usuario, Cancha cancha, LocalDateTime inicioTurno, int duracionTurno) {
		this.nroTurno = nroTurno;
		this.usuario = usuario;
		this.cancha = cancha;
		this.inicioTurno = inicioTurno;
		this.duracionTurno = duracionTurno;
	}

	public int getNroTurno() {
		return nroTurno;
	}

	public void setNroTurno(int nroTurno) {
		this.nroTurno = nroTurno;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDateTime getInicioTurno() {
		return inicioTurno;
	}

	public void setInicioTurno(LocalDateTime inicioTurno) {
		this.inicioTurno = inicioTurno;
	}

	public LocalDateTime getFinTurno() {
		return LocalDateTime.of(this.inicioTurno.getYear(), this.inicioTurno.getMonthValue(),
				this.inicioTurno.getDayOfMonth(), this.inicioTurno.getHour() + this.duracionTurno,
				this.inicioTurno.getMinute());
	}

	public Cancha getCancha() {
		return cancha;
	}

	public double getPrecioTurno() {

		return this.cancha.getPrecio();
	}

	public boolean existeConflicto(Turno turno) {

		if (this.getCancha().equals(turno.getCancha())&&(turno.getInicioTurno().isBefore(this.getFinTurno()))) {

			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return "Turno [Turno=" + getNroTurno() + "]";
	}
}
