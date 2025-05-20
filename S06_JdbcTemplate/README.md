# JDBC Template

Esta parte de Spring está pensanda para que de una manera básica nos ayude a interactuar con una base de datos. Este motor se apoya en JDBC para hacer las peticiones contra la BBDD.

## Configuracion

A parte de las librerías core de Spring habría que meter las librerías  de JDBC Template. Además, debemos de meter los drivers de conexión contra la BBDD que usemos.

	<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.framework.version}</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${spring.framework.version}</version>
		</dependency>
				
		<dependency>
		    <groupId>mysql</groupId>
		    <artifactId>mysql-connector-java</artifactId>
		    <version>8.0.26</version>
		</dependency>
		
Lo siguiente sería crear la tabla de BBDD, para ello podemos ejecutar la clase es.curso.main.MainCrearTabla

Aun así, tenemos que crear el schema de BBDD, que este caso se llamará "jdbcTemplate".