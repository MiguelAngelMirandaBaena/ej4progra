public class ParadaRecorrido {
    private Recorrido recorrido;
    private Parada parada;
    private int suben;
    private int bajan;
    private int retraso;

    public ParadaRecorrido(Recorrido recorrido, Parada parada, int suben, int bajan, int retraso) {
        this.setRecorrido(recorrido);
        this.setParada(parada);
        this.setSuben(suben);
        this.setBajan(bajan);
        this.setRetraso(retraso);
    }



    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    public int getSuben() {
        return suben;
    }

    public void setSuben(int suben) {
        this.suben = suben;
    }

    public int getBajan() {
        return bajan;
    }

    public void setBajan(int bajan) {
        this.bajan = bajan;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }
}
