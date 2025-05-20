package es.curso.modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.curso.modelo.entidades.Pelicula;

@Repository
public class DaoPeliculaJdbcTemplate implements DaoPelicula {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private DaoPeliculaRowMapper peliculaRowMapper;

	//JdbcTemplate trabaja con consultas parametrizadas por defecto, además de que es la manera
	//recomendable
	
	/**
	 * 
	 * @param p la película que queremos dar de alta
	 * @return el id con que se dio de alta en nuestra BBDD
	 */
	@Override
	public int insertar(Pelicula p) {
		String query = "INSERT INTO peliculas (TITULO, DIRECTOR, GENERO, YEAR) values (?, ?, ?, ?)";
		
		//Le pasamos la query y los valores de las "?" en orden
		int id = jdbcTemplate.update(query,
				p.getTitulo(),
				p.getDirector(),
				p.getGenero(),
				p.getYear()
			);
		
		return id;		
	}

	/**
	 * 
	 * @param p la película que queremos dar de alta
	 * @return el id con que se dio de alta en nuestra BBDD
	 */
	@Override
	public int modificar(Pelicula p) {
		String query = "UPDATE peliculas SET TITULO=?, DIRECTOR=?, GENERO=?, YEAR=? WHERE id=?";
		
		//Al final el update sive para modificar la BBDD
		int id = jdbcTemplate.update(query,
				p.getTitulo(),
				p.getDirector(),
				p.getGenero(),
				p.getYear(),
				p.getId()
			);
		
		return id;
	}

	@Override
	public int borrar(int id) {
		String query = "DELETE FROM peliculas WHERE id=?";
		return jdbcTemplate.update(query, id);
	}

	@Override
	public Pelicula buscar(int id) {
		String query = "SELECT * FROM peliculas WHERE id=?";

		//Este método espera un único regitro como resultado
		//Si devuelve más o menos, arrojaría una excepción
		
		//Al método le pasamos además de la query y el id que estamos
		//buscando, un objeto de tipo RowMapper
		//La función de este objeto que hemos creado es que por cada registro
		//que nos devuelva, se ejecutará el método mapRow() de la clase
		//DaoPeliculaRowMapper
		
		Pelicula pelicula = null;
		
		try {
			pelicula = jdbcTemplate.queryForObject(query, peliculaRowMapper,id);
		}catch(EmptyResultDataAccessException e) {
			//Este tipo de excepciones ocurren cuando esperamos un objeto y nos devuelve
			//0.
			System.out.println("EmptyResultDataAccessException: " + e.getMessage());
		}
		
		return pelicula;
		
	}

	@Override
	public List<Pelicula> listar() {
		String query = "select * from peliculas";
		//Como son varios elementos ejecutamos el metodo "query"
		return jdbcTemplate.query(query, peliculaRowMapper);
	}
	
	public void crearTablaPeliculas() {
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS peliculas (" + 
				"id INT NOT NULL AUTO_INCREMENT," + 
				"titulo VARCHAR(255) NOT NULL," + 
				"director VARCHAR(255)," + 
				"genero VARCHAR(255)," + 
				"year INT," + 
				"PRIMARY KEY (id)" + 
				"); ");
	}

}
