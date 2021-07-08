import java.util.Date;

public class Recorrido {
    private int idRecorrido;
    private Date fecha;
    private Autobus autobus;

    public Recorrido(int idRecorrido, Date fecha, Autobus autobus) {
        this.setIdRecorrido(idRecorrido);
        this.setFecha(fecha);
        this.setAutobus(autobus);
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }
}
