package com.ejemplo.coches;
/**
 * Representa un coche con matrícula, marca, modelo y kilometraje.
 */
public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int kilometros;
    
    /**
     * Crea un nuevo objeto Coche.
     *
     * @param matricula Matrícula del coche (entre 1 y 6 caracteres).
     * @param marca     Marca del coche.
     * @param modelo    Modelo del coche.
     * @param kilometros Kilómetros recorridos.
     * @throws IllegalArgumentException si la matrícula no cumple con la longitud válida.
     */
    public Coche(String matricula, String marca, String modelo, int kilometros) {
    	if (matricula == null || matricula.length() < 1 || matricula.length() > 6) {
            throw new IllegalArgumentException("Error: La matrícula debe tener entre 1 y 6 caracteres o no puede estar en blanco.");
        }

        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }
    /** @return Matrícula del coche. */
    public String getMatricula() {
        return matricula;
    }
    /** @return Marca del coche */
    public String getMarca() {
        return marca;
    }
    /** @return  Modelo del coche */
    public String getModelo() {
        return modelo;
    }
    /** @return Kilómetros del coche*/
    public int getKilometros() {
        return kilometros;
    }
    
    /**
     * Representación en texto del objeto coche.
     * @return Cadena con los datos del coche.
     */
    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kilometros=" + kilometros + "]";
    }
}


