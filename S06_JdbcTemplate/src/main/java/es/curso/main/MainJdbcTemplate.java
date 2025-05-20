package es.curso.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.config.Configuracion;
import es.curso.modelo.entidades.Pelicula;
import es.curso.modelo.negocio.GestorPelicula;

public class MainJdbcTemplate {

	private static ApplicationContext context;
	
	public static void main(String[] args) {		
		context = new AnnotationConfigApplicationContext(Configuracion.class);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		
		// Insertar varias películas de ejemplo
		insertarPelicula(gp, "El Padrino", "Francis Ford Coppola", "Drama", 1972);
		insertarPelicula(gp, "Pulp Fiction", "Quentin Tarantino", "Thriller", 1994);
		insertarPelicula(gp, "Matrix", "Lana y Lilly Wachowski", "Ciencia Ficción", 1999);
		insertarPelicula(gp, "El Señor de los Anillos", "Peter Jackson", "Fantasía", 2001);
		insertarPelicula(gp, "Interestelar", "Christopher Nolan", "Ciencia Ficción", 2014);
		
		// Listar todas las películas
		System.out.println("\n== LISTADO DE PELÍCULAS ==");
		gp.listar().forEach(v -> System.out.println(v));
	}
	
	private static void insertarPelicula(GestorPelicula gestor, String titulo, String director, String genero, int year) {
		Pelicula p = context.getBean("pelicula", Pelicula.class);
		p.setTitulo(titulo);
		p.setDirector(director);
		p.setGenero(genero);
		p.setYear(year);
		
		int id = gestor.insertar(p);
		System.out.println("Película '" + titulo + "' insertada con ID: " + id);
	}
}
