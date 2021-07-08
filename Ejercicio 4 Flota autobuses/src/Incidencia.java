import java.util.Date;

public class Incidencia {
    private int idIncidencia;
    private String tipo;
    private Date fecha;
    private double costo;
    private String descripcion;
    private Autobus autobus;

    public Incidencia(int idIncidencia, String tipo, Date fecha, double costo, String descripcion, Autobus autobus) {
        this.setIdIncidencia(idIncidencia);
        this.setTipo(tipo);
        this.setFecha(fecha);
        this.setCosto(costo);
        this.setDescripcion(descripcion);
        this.setAutobus(autobus);
    }

    @Override
    public String toString() {
        return autobus.getNumero() + "[" + tipo + ", "+ costo + "]";
    }

    public int getIdIncidencia() {
        return idIncidencia;
    }

    public void setIdIncidencia(int idIncidencia) {
        this.idIncidencia = idIncidencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
