package es.curso.springcasa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Cargar el contexto de Spring desde el archivo ApplicationContextCasa.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextCasa.xml");

        // Obtener el bean de 'alquiler'
        Alquiler alquiler = (Alquiler) context.getBean("alquiler");

        // Mostrar información de la casa, propietario e inquilinos
        System.out.println("Casa: ");
        System.out.println("Dirección: " + alquiler.getCasa().getDireccion().getTipoVia() + " " +
                alquiler.getCasa().getDireccion().getNombreVia() + ", " +
                alquiler.getCasa().getDireccion().getCodigoPostal() + " " +
                alquiler.getCasa().getDireccion().getNumero());
        System.out.println("Precio de alquiler: " + alquiler.getCasa().getPrecioAlquiler() + " €");

        System.out.println("\nPropietario: ");
        System.out.println("Nombre: " + alquiler.getCasa().getPropietario().getNombre());
        System.out.println("DNI: " + alquiler.getCasa().getPropietario().getDni());
        System.out.println("Teléfono: " + alquiler.getCasa().getPropietario().getTelefono());

        System.out.println("\nInquilinos: ");
        for (Persona inquilino : alquiler.getInquilinos()) {
            System.out.println("Nombre: " + inquilino.getNombre());
            System.out.println("DNI: " + inquilino.getDni());
            System.out.println("Teléfono: " + inquilino.getTelefono());
        }

        System.out.println("\nAlquiler: ");
        System.out.println("Fecha de inicio: " + alquiler.getFechaInicio());
        System.out.println("Fecha de fin: " + alquiler.getFechaFin());
        System.out.println("Precio total: " + alquiler.getPrecioTotal() + " €");
    }
    
}