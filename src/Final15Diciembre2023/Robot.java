package Final15Diciembre2023;

import java.util.ArrayList;

public class Robot {
	private int estadoBateria;
	private static Robot UnicaInstancia;
	private Comando comandos;

	//constructor
	private Robot (){
		this.estadoBateria=100;
	}

	public int getEstado(){
		return this.estadoBateria;
	}


	public void setEstado(int i){
		this.estadoBateria=i;
	}

	public boolean PuedoModificarBateria(int i){
		if(this.getEstado()-i >0){
			return true;
		}
		return false;
	}
	public void modificarBateria(int i){
		if(this.PuedoModificarBateria(i)){
			this.setEstado(this.getEstado()-i);
		}
	}


	public static Robot getInstancia(){
		if(UnicaInstancia==null){
			UnicaInstancia=new Robot();
		}
		return UnicaInstancia;
	}

	public Comando getComando(){
		return this.comandos;
	}

	public ArrayList<String>listaAcciones(int pos){
		ArrayList<String>lista=new ArrayList<>();
		if(pos<comandos.getLista().size()){
			for(int i=pos; i<comandos.getLista().size(); i++){
				lista.add(comandos.getLista().get(i));
			}
			return lista;
		}
		else{
			return null;
		}
	}

}
