package Final_15_3_24;

import java.util.ArrayList;
import java.util.Objects;

public class Terminal extends Estructura{
	private ArrayList<Objects>objetos;


	//constructor
	public Terminal(){
		this.objetos=new ArrayList<>();
	}

	//almacena el objeto al final de la cola
	public void addObjeto(Objects o){
		this.objetos.add(o);
	}

	//recupera el objeto al inicio de la cola
	public Objects recuperarObjeto(){
		return this.objetos.get(0);

	}

	public int cantTotalElementos(){
		return this.objetos.size();
	}

	//objects ya tiene definido el equals, no necesito hacerlo
	public boolean tengoObjeto(Objects o){
		return this.objetos.contains(o);
	}


	public Estructura copia(){
		Terminal copiaMia =new Terminal();
		for(int i=0; i<this.objetos.size();i++){
			copiaMia.addObjeto(this.objetos.get(i));
		}
		return copiaMia;
	}


	public int cantColasTerminales(){
		return 1;
	}


	public Terminal colaConMasElementos(){
		return this;
	}
}
