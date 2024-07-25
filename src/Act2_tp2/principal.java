package Act2_tp2;

import java.time.LocalDate;

public class principal {

	public static void main(String[] args) {

		//creo la agenda

		Agenda a=new Agenda();


		//creamos la lista de contactos
		Contacto c1=new Contacto("Luciana Romero", "lu.yael.r@gmail.com", 154328640);
		Contacto c2=new Contacto("Santiago Palomeque", "santiagoPalomeque@gmail.com", 154125487);
		Contacto c3=new Contacto("Daniela Romero", "danielita.r@gmail.com", 154357849);
		Contacto c4=new Contacto("Felicitas Aguerralde", "feluchi.a@gmail.com", 154577761);
		Contacto c5=new Contacto("Mercedes", "mechi@gmail.com", 15457899);
		Contacto c6=new Contacto("Maria Piñeyro", "piagi@gmail.com", 154778893);
		
		
		System.out.println("Datos de los contactos: \n");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());


		// creamos las reuniones

		Reunion r1=new Reunion(LocalDate.of(2022, 9, 23),15,"Sala A", "La vida misma");
		Reunion r2=new Reunion(LocalDate.of(2022, 9, 23),18,"Sala B", "Se hace lo que se puede");
		Reunion r3=new Reunion(LocalDate.of(2022, 9, 23),15,"Sala A", "Esto no está pasando");

	
		//Agrego contactos en la egenda
		a.agregarContacto(c1);
		a.agregarContacto(c2);
		a.agregarContacto(c3);
		a.agregarContacto(c4);
		a.agregarContacto(c5);
		a.agregarContacto(c6);
		a.agregarContacto(c1); //pongo uno repetido

		System.out.println(a.toString());
		//Agrego reuniones

		a.agregarReunion(r1);
		a.agregarReunion(r2);
		a.agregarReunion(r3);


		//agrego participantes a la reunion
		r1.agregarParticipante(c1);
		r1.agregarParticipante(c2);
		r1.agregarParticipante(c3);


		r2.agregarParticipante(c3);
		r2.agregarParticipante(c4);
		r2.agregarParticipante(c5);
		r2.agregarParticipante(c6);


		r3.agregarParticipante(c1);
		r3.agregarParticipante(c2);
		r3.agregarParticipante(c3);
		r3.agregarParticipante(c4);
		r3.agregarParticipante(c5);
		r3.agregarParticipante(c6);

		//participantes que estan en las reuniones y detalles de la reunion:
		System.out.println("Detalles de la reunion: ");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());

		//controlamos que no haya superposicion (conflicto)

//no tengo idea como hacerlo
	}
}



