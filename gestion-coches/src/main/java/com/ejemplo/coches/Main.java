package com.ejemplo.coches;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Clase principal que ejecuta la aplicación de gestión de coches.
 */
public class Main {
	/**
     * Punto de entrada principal. Muestra un menú para gestionar coches.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Cargar el contexto de Spring y obtener el bean ComparadorMarca
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextcoche.xml");
    	ComparadorMarca comparador = (ComparadorMarca) context.getBean("comparadorMarca");

        
        // Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println("Binvenidos a la aplicacion");
        System.out.println("--------------------------");
        while (running) {
            // Mostrar el menú
            System.out.println("\n1. Añadir Coche");
            System.out.println("2. Listar Coches");
            System.out.println("3. Ordenar Coches por Marca");
            System.out.println("4. Ordenar Coches por Matrícula");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            
            // Leer opción seleccionada por el usuario
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
            
            switch (opcion) {
                case 1:
                    // Solicitar los detalles del coche
                	System.out.print("Introduce la matrícula: ");
                    String matricula = scanner.nextLine();
                    if (matricula.length() < 1 || matricula.length() > 6) {
                        System.err.println("Error: La matrícula debe tener entre 1 y 6 caracteres o no puede estar en blanco.");
                        break;
                    }
                    System.out.print("Introduce la marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Introduce el modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Introduce los kilómetros: ");
                    int kilometros = scanner.nextInt();
                    
                    // Crear el coche y agregarlo al comparador
                    Coche coche = new Coche(matricula, marca, modelo, kilometros);
                    if (comparador.agregarCoche(coche)) {
                        System.out.println("Coche añadido con éxito.");
                    } else {
                        System.err.println("Ya existe un coche con esa matrícula.");
                    }
                    break;
                case 2:
                    // Listar todos los coches
                    System.out.println("Lista de Coches:");
                    comparador.listarCoches();
                    break;
                case 3:
                    // Ordenar los coches por marca
                    comparador.ordenarPorMarca();
                    System.out.println("Coches ordenados por marca.");
                    break;
                case 4:
                    // Ordenar los coches por matrícula
                    comparador.ordenarPorMatricula();
                    break;
                case 5:
                    // Salir de la aplicación
                	System.out.println("saliendo de la aplicacion");
                    running = false;
                    break;
                default:
                    // Opción no válida
                    System.err.println("Opción no válida.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
