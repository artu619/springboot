package es.curso.springcasa;

public class Habitacion {

    private double metrosCuadrados;
    private String tipo;
    private int numero;

    // Constructor vacío
    public Habitacion() {
    }

    // Constructor con parámetros
    public Habitacion(double metrosCuadrados, String tipo, int numero) {
        this.metrosCuadrados = metrosCuadrados;
        this.tipo = tipo;
        this.numero = numero;
    }

    // Getters y setters
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método toString para facilitar la impresión de información
    @Override
    public String toString() {
        return "Habitacion{" +
                "metrosCuadrados=" + metrosCuadrados +
                ", tipo='" + tipo + '\'' +
                ", numero=" + numero +
                '}';
    }
}
