public class Parada {
    private int idParada;
    private String nombreCalle;
    private int numero;

    public Parada(int idParada, String nombreCalle, int numero) {
        this.setIdParada(idParada);
        this.setNombreCalle(nombreCalle);
        this.setNumero(numero);
    }

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
