public class Autobus {
    private int idAutobus;
    private int numero;
    private Modelo modelo;

    public Autobus(int idAutobus, int numero, Modelo modelo) {
        this.setIdAutobus(idAutobus);
        this.setNumero(numero);
        this.setModelo(modelo);
    }

    @Override
    public String toString() {
        return this.numero + "[" + modelo.toString() +"]";
    }

    public int getIdAutobus() {
        return idAutobus;
    }

    public void setIdAutobus(int idAutobus) {
        this.idAutobus = idAutobus;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
