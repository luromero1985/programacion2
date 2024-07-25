package Act2_tp4;

import java.util.ArrayList;

import Act4_tp2.Cancha;
import Act4_tp2.Turno;

public class Alarma {
	
		private ArrayList<Sensor>sensores;
		private Timbre timbre;

		public Alarma(Timbre timbre) {
			this.timbre = timbre;
			this.sensores= new ArrayList<>();
		}

		public ArrayList<Sensor> getSensor() {
			return new ArrayList<Sensor>(this.sensores);
		}	
		
		
		//agregamos sensores
		public void agregarSensor(Sensor sensor) {

			if (!(this.sensores.contains(sensor))) {
				this.sensores.add(sensor);
			}
		}

		public boolean comprobar(){
			if(sensores){
				this.timbre.hacerSonar();
				return true;
			}
			else {
				return false;
			}
		}
	}


