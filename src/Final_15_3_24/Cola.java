package Final_15_3_24;

import java.util.ArrayList;
import java.util.Objects;

public class Cola extends Estructura {
	private ArrayList<Estructura> estructuras;
	private Seleccion agregar;
	private Seleccion recuperar;

	//constructor
	public Cola(Seleccion agregar, Seleccion recuperar){
		this.estructuras=new ArrayList<>();
		this.agregar=agregar;
		this.recuperar=recuperar;
	}


	public Seleccion getAgregar() {
		return agregar;
	}


	public void setAgregar(Seleccion agregar) {
		this.agregar = agregar;
	}


	public Seleccion getRecuperar() {
		return recuperar;
	}


	public void setRecuperar(Seleccion recuperar) {
		this.recuperar = recuperar;
	}


	public void addEstructura(Estructura e){
		if(!this.estructuras.contains(e)){
			this.estructuras.add(e);
		}
	}

	public int cantTotalElementos(){
		int suma=0;
		for(int i=0; i<this.estructuras.size(); i++){
			suma+=this.estructuras.get(i).cantTotalElementos();
		}
		return suma;
	}

	public boolean tengoObjeto(Objects o){
		int i=0;
		boolean loTengo=false;
		while(i<this.estructuras.size() && loTengo==false){
			if(this.estructuras.get(i).tengoObjeto(o)){
				loTengo=true;
			}
			i++;
		}
		return loTengo;
	}

	public Estructura copia(){
		ArrayList<Estructura>aux =new ArrayList<>();
		for(int i=0; i<this.estructuras.size();i++){
			Estructura hijo =this.estructuras.get(i).copia();

			if(hijo!=null){
				aux.add(hijo);
			}
		}
		if(!aux.isEmpty()){
			Cola copiaMia =new Cola(this.getAgregar(),this.getRecuperar() );
			for(int j=0; j<aux.size(); j++){
				copiaMia.addEstructura(aux.get(j));
			}
			return copiaMia;
		}
		else return null;
	}


	public int cantColasTerminales(){
		int suma=0;
		for(int i=0; i<this.estructuras.size(); i++){
			suma+=this.estructuras.get(i).cantColasTerminales();
		}
		return suma;
	}


	public void addObjeto(Objects o){
		int pos=this.agregar.nroSubCola(this.estructuras);
		this.estructuras.get(pos).addObjeto(o);
	}

	public Objects recuperarObjeto(){
		int pos=this.recuperar.nroSubCola(this.estructuras);
		return this.estructuras.get(pos).recuperarObjeto();

	}


	public Terminal colaConMasElementos(){
		int pos=0;
		for (int i=0; i<this.estructuras.size(); i++){
			if(this.estructuras.get(i).cantTotalElementos()>
			this.estructuras.get(pos).cantTotalElementos()){
				pos=i;
			}
		}
		return this.estructuras.get(pos).colaConMasElementos();
	}
}