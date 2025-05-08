package es.curso.springcasa;

public class Direccion {

    private String tipoVia;
    private String nombreVia;
    private String codigoPostal;
    private int numero;

    // Constructor vacío
    public Direccion() {
    }

    // Constructor con parámetros
    public Direccion(String tipoVia, String nombreVia, String codigoPostal, int numero) {
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.codigoPostal = codigoPostal;
        this.numero = numero;
    }

    // Getters y setters
    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método toString
    @Override
    public String toString() {
        return tipoVia + " " + nombreVia + ", " + numero + " (" + codigoPostal + ")";
    }
}
