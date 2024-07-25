package Act4_tp2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainEstablDeport {

	public static void main(String[] args) {

		//creamos el establecimiento deportivo
		GestionTurnos est1 = new GestionTurnos ();

		//generamos usuarios
		Usuario u1 = new Usuario("Juan", "Perez", LocalDate.of(2022, 3, 12));
		Usuario u2 = new Usuario("Diego", "Sancho",LocalDate.of(2022, 6, 15));
		Usuario u3 = new Usuario("Ana", "Loreal",LocalDate.of(2022, 9, 22));

		//imprimimos detalles de los usuarios
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3+"\n");

		//creamos las canchas
		Cancha cancha1F = new Cancha("Futbol1",u1 ,100,1);
		Cancha cancha2F = new Cancha("Futbol2", u1,100,2);
		Cancha cancha3P = new Cancha("Paddle1",u1,100,3);
		Cancha cancha4P = new Cancha("Paddle2", u1,400,1);
		Cancha cancha5P = new Cancha("Paddle3",u2,400,1);

		//asociamos las canchas al establecimiento deportivo
		est1.agregarCancha(cancha1F);
		est1.agregarCancha(cancha2F);
		est1.agregarCancha(cancha3P);
		est1.agregarCancha(cancha4P);
		est1.agregarCancha(cancha5P);

		//generamos turnos
		Turno turno1 = new Turno(1, u1, cancha1F, LocalDateTime.of(2022, 7, 20, 11, 00));
		Turno turno2 = new Turno(1, u1, cancha1F, LocalDateTime.of(2022, 7, 20, 11, 00));
		Turno turno3 = new Turno(2, u3, cancha1F, LocalDateTime.of(2022, 7, 20, 11, 00));
		//Turno turno2 = new Turno("Turno 2", u1, cancha2F, LocalDateTime.of(2022, 8, 15, 12, 00));
		//Turno turno3 = new Turno("Turno 3", u1, cancha3P, LocalDateTime.of(2022, 6, 30, 11, 00));
		Turno turno4 = new Turno(4, u1, cancha4P, LocalDateTime.of(2022, 8, 12, 11, 00));



		System.out.println("Hay superposición de turnos: "+est1.detectarConflicto(turno1));
		est1.agregarTurno(turno1);
		System.out.println( "Costo de la cancha: "+est1.cobrarTurno(turno1));

		System.out.println("Hay superposición de turnos: "+est1.detectarConflicto(turno2));
		est1.agregarTurno(turno2);
		System.out.println( "Costo de la cancha: "+est1.cobrarTurno(turno2));

		System.out.println("Hay superposición de turnos: "+est1.detectarConflicto(turno3));
		est1.agregarTurno(turno3);
		System.out.println("Costo de la cancha: "+ est1.cobrarTurno(turno3));

		System.out.println("Hay superposición de turnos: "+est1.detectarConflicto(turno4));
		est1.agregarTurno(turno4);
		System.out.println( "Costo de la cancha: "+est1.cobrarTurno(turno4));

		System.out.println(est1.getTurnos());







	}

}


