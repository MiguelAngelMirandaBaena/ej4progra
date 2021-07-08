public class Linea {
    private int idlinea;
    private String nombre;

    public Linea(int idlinea, String nombre) {
        this.setIdlinea(idlinea);
        this.setNombre(nombre);
    }

    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
