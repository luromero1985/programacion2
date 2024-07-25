package Act2_tp2;
import java.util.ArrayList;

public class Agenda {
private ArrayList<Reunion>reuniones;
private ArrayList<Contacto>contactos;

public Agenda(){
	reuniones=new ArrayList<Reunion>();
	contactos=new ArrayList<Contacto>();
}

public void agregarContacto(Contacto c1){
	if(!contactos.contains(c1)){
		contactos.add(c1);
			}
}

public boolean agregarReunion(Reunion r1){
	if (!reuniones.contains(r1)){
		for(int i=0; i<reuniones.size();i++){
			Reunion re=reuniones.get(i);
			if(!re.tieneConflicto(r1.getFecha(),r1.getHora())){
				reuniones.add(r1);
				return true;
			}
		}
			}
	return false;
}

public String toString(){
	return "Los contactos agregados en la agenda son: \n"+this.contactos+"\n";
}

}
