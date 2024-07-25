package Final15Diciembre2023;

import java.util.ArrayList;

public class Bloque extends Comando{
	protected ArrayList<Comando> comandos;
	protected static int extra=10;
	private int umbral;


	public Bloque(int u){
		this.comandos=new ArrayList<>();
		this.umbral=u;
	}
	public static int getExtra(){
		return Bloque.extra;
	}
	public int calcularExtra(){
		if(Robot.getInstancia().getEstado()>this.getUmbral()){
			return Bloque.extra;
		}
		else{
			return 2*Bloque.extra;
		}

	}

	public int getGasto(){
		int suma=0;
		for(int i=0; i<this.comandos.size();i++){
			suma+= this.comandos.get(i).getGasto();
		}
		return suma + this.getTiempo() * this.calcularExtra();
	}

	public int getTiempo(){
		int suma=0;
		for(int i=0; i<this.comandos.size();i++){
			suma+=this.comandos.get(i).getTiempo();
		}
		return suma;
	}

	public int getUmbral(){
		return this.umbral;
	}

	public boolean contengoComando(String s){
		int i=0;
		boolean encontrado=false;
		while(i<this.comandos.size() && encontrado==false){
			if(this.comandos.get(i).contengoComando(s)){
				encontrado=true;
			}
		}
		return encontrado;
	}

	public void addComando(Comando c){
		this.comandos.add(c);
	}	
	public Comando copia(Filtro f){
		ArrayList<Comando> aux = new ArrayList<>();
		for(int i=0;i<this.comandos.size();i++){
			Comando extra= this.comandos.get(i).copia(f);
			if(extra!=null){
				aux.add(extra);
			}
		}
		if(!aux.isEmpty()){
			Bloque copiaMia= new Bloque(this.getUmbral());
			for(int j=0; j<aux.size();j++){
				copiaMia.addComando(aux.get(j));
			}
			return copiaMia;
		}

		return null;
	}

	public ArrayList<String> getLista(){
		ArrayList<String> lista= new ArrayList<>();
		for(int i=0; i<this.comandos.size();i++){
			ArrayList <String> aux = this.comandos.get(i).getLista();
			lista.addAll(aux);
		}
		return lista;
	}



}
