package Farmacia;
import java.util.ArrayList;
public class Farmacia {
private ArrayList <Medicamento>medicamentos;

public Farmacia(){
	this.medicamentos =new ArrayList<>();
}
public void addMedicamento(Medicamento m){
	this.medicamentos.add(m);
}

public ArrayList<Medicamento>buscar(Filtro filtro){
	ArrayList<Medicamento> medicamentos=new ArrayList<>();
}
}
