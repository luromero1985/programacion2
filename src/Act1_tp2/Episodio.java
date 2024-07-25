package Act1_tp2;

public class Episodio {
	// atributos
	private String titulo;
	private String descripcion;
	private boolean visto;
	private int calificacion;
	private static int maxCalif=5;   //por qué no son constantes?
	private static int minCalif=1;	


	//contructores

	public Episodio(String titulo, String descripc){
		//super();    // que trae?
		this.titulo=titulo;
		this.descripcion=descripc;
		this.visto=false;
		this.calificacion=-1;
	}

	//metodos


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isVisto() {    //que significa is? lo puso automatico en lugar de get
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public int getCalificacion() {
		return calificacion;
	}


	public boolean setCalificacion(int calificacion) {
		if (calificacion >= minCalif && calificacion <= maxCalif) {//si es un valor correcto, reemplazamos la variable por el valor ingresado
			this.calificacion = calificacion;
			this.setVisto(true);    //no entiendo
			return true;
		}
		return false;
	}

	public boolean equals(Object otroEpis) {
		try {
			Episodio otro = (Episodio)otroEpis;
			return this.getTitulo().equals(otro.getTitulo()) &&
					this.getDescripcion().equals(otro.getDescripcion());
		}
		catch (Exception e) {
			return false;
		}
	}


}
