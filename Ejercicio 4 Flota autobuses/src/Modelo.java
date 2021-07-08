public class Modelo {
    private int idModelo;
    private String nombre;
    private int capacidad;
    private double consumo;

    public Modelo(int idModelo, String nombre, int capacidad, double consumo) {
        this.setIdModelo(idModelo);
        this.setNombre(nombre);
        this.setCapacidad(capacidad);
        this.setConsumo(consumo);
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
