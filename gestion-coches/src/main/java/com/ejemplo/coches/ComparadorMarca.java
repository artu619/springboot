package com.ejemplo.coches;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Gestor de una lista de coches con funcionalidades para agregar y ordenar.
 */
@Component
@Scope("singleton") // o "prototype" si quieres una nueva instancia cada vez
public class ComparadorMarca {
    private List<Coche> coches = new ArrayList<>();
    /**
     * Agrega un coche a la lista si no existe otro con la misma matrícula.
     *
     * @param coche El coche a agregar.
     * @return true si se agregó correctamente, false si ya existe uno con la misma matrícula.
     */
    public boolean agregarCoche(Coche coche) {
        for (Coche c : coches) {
            if (c.getMatricula().equalsIgnoreCase(coche.getMatricula())) {
                return false; // ya existe
            }
        }
        coches.add(coche);
        return true;
    }
    /** Muestra todos los coches de la lista. */
    public void listarCoches() {
        for (Coche c : coches) {
            System.out.println(c);
        }
    }
    /** Ordena los coches alfabéticamente por marca. */
    public void ordenarPorMarca() {
        coches.sort(Comparator.comparing(Coche::getMarca));
    }
    /** Ordena los coches alfabéticamente por matrícula y los muestra. */
    public void ordenarPorMatricula() {
        coches.sort(Comparator.comparing(Coche::getMatricula));
        listarCoches();
    }
}

