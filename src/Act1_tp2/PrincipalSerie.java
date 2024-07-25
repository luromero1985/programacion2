package Act1_tp2;

public class PrincipalSerie {

	public static void main(String[] args) {

		Episodio e1 = new Episodio("e1", "desc");
		Episodio e2 = new Episodio("e2", "desc");
		Episodio e3 = new Episodio("e3", "desc");
		Episodio e4 = new Episodio("e4", "desc");
		Episodio e5 = new Episodio("e5", "desc");
		Episodio e6 = new Episodio("e6", "desc");



		Temporada t1 = new Temporada(4);
		t1.addEpisodio(e1);
		t1.addEpisodio(e2);
		t1.addEpisodio(e3);
		t1.addEpisodio(e4);

		Temporada t2 = new Temporada(2);

		t2.addEpisodio(e5);
		t2.addEpisodio(e6);

		Serie s1 = new Serie("Mi Serie", "Accion", "Yo", "Desc");
		s1.addTemporada(t1);
		s1.addTemporada(t2);


		System.out.println("Cantidad de episodios vistos: "+s1.getCantidadEpisodiosVistos());
		System.out.println("Se vieron todos los episodios?: "+s1.isTodosVistos());

		e1.setCalificacion(3);
		e2.setCalificacion(4);
		e3.setCalificacion(5);
		e4.setCalificacion(5);

		System.out.println("Cantidad de episodios vistos: "+s1.getCantidadEpisodiosVistos());
		System.out.println("Se vieron todos los capitulos?: "+s1.isTodosVistos());

		e5.setCalificacion(5);
		e6.setCalificacion(4);

		System.out.println("Cantidad de episodios vistos: "+s1.getCantidadEpisodiosVistos());
		System.out.println("Se vieron todos los episodios?: "+s1.isTodosVistos());
		System.out.println("La calificación promedio es de: "+t1.getCalifPromedio());

	}

}


