package Act2_tp4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sensor {
	private String sensorCocina, sensorCuarto, SensorBanio;
	private ArrayList<String>sensores;


	public Sensor(){
		this.SensorBanio="banio";
		this.sensorCuarto="cuarto";
		this.sensorCocina="cocina";
		this.sensores= new ArrayList<>();
	}


	public String getSensorCocina() {
		return sensorCocina;
	}


	public void setSensorCocina(String sensorCocina) {
		this.sensorCocina = sensorCocina;
	}


	public String getSensorCuarto() {
		return sensorCuarto;
	}


	public void setSensorCuarto(String sensorCuarto) {
		this.sensorCuarto = sensorCuarto;
	}


	public String getSensorBanio() {
		return SensorBanio;
	}


	public void setSensorBanio(String sensorBanio) {
		SensorBanio = sensorBanio;
	}





}
