package es.curso.springcasa;

import java.util.List;

public class Alquiler {

    private Casa casa;
    private List<Persona> inquilinos;
    private String fechaInicio;
    private String fechaFin;
    private double precioTotal;

    // Getters y setters
    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public List<Persona> getInquilinos() {
        return inquilinos;
    }

    public void setInquilinos(List<Persona> inquilinos) {
        this.inquilinos = inquilinos;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}

