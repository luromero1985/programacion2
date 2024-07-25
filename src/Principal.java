import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Persona persona1 = new Persona(30578001, "Ana", "Díaz", 38, LocalDate.of(1984, 6, 23), "Fememino", 74.5,
				1.80);
		Persona persona2 = new Persona(27122473, "Román", "García", 40, LocalDate.of(2082, 5, 12), "Masculino", 100, 1.95);
		
		System.out.println(persona1.getInformacion());
		System.out.println("");
		System.out.println(persona2.getInformacion());
		System.out.println("");
		System.out.println("Es " + persona1.getNombre() + " mayor de edad? " + persona1.esMayorDeEdad());
		System.out.println("Es " + persona2.getNombre() + " mayor de edad? " + persona2.esMayorDeEdad());
		System.out.println("");
		System.out.println("Es coherente la edad con la fecha de nacimiento? " + persona1.esCoherente());
		System.out.println("Es coherente la edad con la fecha de nacimiento? " + persona2.esCoherente());
		System.out.println("");
		System.out.println("Cual es la masa corporal de " + persona1.getNombre() + " ?  " + persona1.calculoMasaCorporal());
		System.out.println("Cual es la masa corporal de " + persona2.getNombre() + " ?  " + persona2.calculoMasaCorporal());
		System.out.println("");
		System.out.println("Esta " + persona1.getNombre() + " en forma? " + persona1.estaEnForma());
		System.out.println("Esta " + persona2.getNombre() + " en forma? " + persona2.estaEnForma());
		System.out.println("");
		System.out.println(persona1.getNombre() + " puede votar? " + persona1.puedeVotar());
		System.out.println(persona2.getNombre() + " puede votar? " + persona2.puedeVotar());
		System.out.println("");
		System.out.println("Es hoy el cumpleaños de " + persona1.getNombre() + "? " + persona1.estaCumpliendoAnios());
		System.out.println("Es hoy el cumpleaños de " + persona2.getNombre() + "? " + persona2.estaCumpliendoAnios());
		System.out.println("");

	}
}


