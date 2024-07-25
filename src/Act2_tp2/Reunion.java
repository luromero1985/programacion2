package Act2_tp2;
import java.util.ArrayList;
import java.time.LocalDate;

public class Reunion {
	private LocalDate fecha; 
	private int hora;
	private String lugar, tema;
	private ArrayList<Contacto>participantes;


	public Reunion (LocalDate fecha, int hora, String lugar, String tema){
		this.fecha=fecha;
		this.hora=hora;
		this.lugar=lugar;
		this.tema=tema;
		participantes=new ArrayList<Contacto>();
	}


	public void agregarParticipante(Contacto p1){
		if(!participantes.contains(p1)){
			participantes.add(p1);
		}
	}


	public boolean tieneConflicto(LocalDate fecha, int hora){
		if(this.fecha==fecha && this.hora==hora){
			return true;
		}else{
			return false;
		}
	}

	
	public String toString (){
		return "\nLa reunion es el día: "+this.getFecha()+". \nLa hora de inicio de la reunion es a las: "+this.getHora()+" hs. \nEl lugar de reunion es en: "+this.getLugar()+". \nEL tema a tratar es: "+this.getTema()+
				"\nLos participantes involucrados en la reunion son: "+ participantes ;
	}
	

		public LocalDate getFecha() {
			return fecha;
		}


		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}


		public int getHora() {
			return hora;
		}


		public void setHora(int hora) {
			this.hora = hora;
		}


		public String getLugar() {
			return lugar;
		}


		public void setLugar(String lugar) {
			this.lugar = lugar;
		}


		public String getTema() {
			return tema;
		}


		public void setTema(String tema) {
			this.tema = tema;
		}
	
	}
