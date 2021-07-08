public class ParadaLinea {
    private Linea linea;
    private Parada parada;
    private int numero;

    public ParadaLinea(Linea linea, Parada parada, int numero) {
        this.setLinea(linea);
        this.setParada(parada);
        this.setNumero(numero);
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
