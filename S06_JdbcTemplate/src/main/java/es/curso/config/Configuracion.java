package es.curso.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * En esta clase vamos a hacer la configuración con la BBDD
 * 
 * Estas configuraciones principalmente se pueden hacer mediante XML o mediante
 * JavaConfig.
 * 
 * En este ejemplo vamos a configurarlo para hacerlo mediante configuración Java
 */
@Configuration
@ComponentScan(basePackages={"es.curso"})
public class Configuracion {
	
	//Damos de alta el objeto DataSource que es el objeto que usará spring
	//para contectarse a la BBDD
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		/*dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");//MySQL 8
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc_template?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("47933677kK");*/
		
		//Configuracion para MySQL 5.7
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/jdbc_template?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		//Configuracion para H2
		/*dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:file:~/h2/jdbcTemplate");
		dataSource.setUsername("sa");
		dataSource.setPassword("");*/
		return dataSource;
	}
	
	//Este será el objeto que usemos para hacer las queries contra la BBDD
	//"JdbcTemplate"
	//Le pasamos el objeto DataSource que creamos en el anterior método
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {		
		return new JdbcTemplate(dataSource);
	}
}