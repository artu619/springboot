package es.curso.springcasa;

import java.util.List;

public class Casa {

	private Direccion direccion;
    private List<Habitacion> habitaciones;
    private Persona propietario;
    private double precioAlquiler;

    // Getters y setters
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    // Nuevo método: calcular total de metros cuadrados
    public double getMetrosCuadradosTotales() {
        double total = 0;
        if (habitaciones != null) {
            for (Habitacion h : habitaciones) {
                total += h.getMetrosCuadrados();
            }
        }
        return total;
    }
    
    
}


