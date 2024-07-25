package tp10.act5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Combo extends Carga{
	private ArrayList<Carga> cargas;
	private Filtro filtro;

	public Combo(String id, String destino, LocalDate partida, Filtro f){
		super(id,destino,partida);
		this.cargas = new ArrayList<Carga>();
		this.filtro=f;
	}

	public Filtro getFiltro() {
		return filtro;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}

	public boolean esAceptado(Carga c){
		if(c.getDestino().equals(this.getDestino()) && c.getPartida().equals(this.getPartida())){
			return true;
		}
		return false;
	}
	public void addCarga(Carga c){
		if(this.filtro.cumple(c)){
			this.cargas.add(c);
		}
	}
	public int getSeguro(){
		int suma=0;
		for(int i=0; i<this.cargas.size();i++){
			this.cargas.get(i).getSeguro();
		}
		return suma;
	}
	public int precioFinal(){
		int suma=0;
		for (int i=0; i<this.cargas.size();i++){
			suma += this.cargas.get(i).precioFinal();
		}
		return suma;
	}

	public int getCostoEnvio() {
		int suma=0;
		for(int i=0; i<this.cargas.size();i++){
			this.cargas.get(i).getCostoEnvio();
		}
		return suma;
	}
	public int CantidadDePaquetes(){
		int suma=0;
		for(int i=0;i<this.cargas.size();i++){
			suma +=this.cargas.get(i).CantidadDePaquetes();
		}
		return suma;
	}

	// ES CORRECTA ESTA FORMA DE PLANTEAR EL RETORNO DE PAQUETES?
	public Paquete mayorSeguro(){
		if(this.cargas.size()!=0){
			int lugar =0;
			int max=0;
			for(int i=0; i<this.cargas.size();i++){
				int aux= this.cargas.get(i).mayorSeguro().getSeguro();
				if(max<aux){
					max=aux;
					lugar=i;
				}
			}
			return this.cargas.get(lugar).mayorSeguro();
		}
		return null;
	}
	/*
public Paquete seguroCaro(){
if(this.cargas.size()!=0){
		int lugar =0;
		int precio=0;
for(int i=0; i<this.cargas.size();i++){
	 if(this.cargas.get(i).seguroCaro(precio)){
		lugar=i;
		precio=this.cargas.get(i).mayorSeguro().getSeguro();

			}
return this.cargas.get(lugar).mayorSeguro();
}
	return null;
}*/

	public Carga copiaMia(){
		ArrayList<Carga> aux= new ArrayList<>();
		Combo copia= new Combo(this.getId(),this.getDestino(),this.getPartida(),this.getFiltro());
		for (int i=0;i<this.cargas.size();i++){
			Carga nueva = this.cargas.get(i).copiaMia();
			aux.add(nueva);
		}
		if(!aux.isEmpty()){
			for(int j=0; j<aux.size();j++){
				copia.addCarga(aux.get(j));
			}}
		return copia;

	}

	public ArrayList<Carga> busqueda(Filtro f){
		ArrayList<Carga> aux= new ArrayList<>();
		if(f.cumple(this)){
			aux.add(this);
		}
		else{
			//COMO CONTROLO DE NO AGREGAR VACIOS
			for(int i=0; i<this.cargas.size();i++){
				ArrayList<Carga> hijo = this.cargas.get(i).busqueda(f);
				aux.addAll(hijo);
			}
		}
		return aux;
	}

}
