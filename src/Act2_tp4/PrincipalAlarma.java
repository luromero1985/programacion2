package Act2_tp4;

import Act1_tp4.Alarma;
import Act1_tp4.Timbre;

public class PrincipalAlarma {
public static void main(String[] args) {
		
		Timbre t= new Timbre("timbre casa");
		Alarma a= new Alarma(t);

		t.hacerSonar();
		
		System.out.println(a.comprobar());
		System.out.println(t.isSonando());	
	}
}
