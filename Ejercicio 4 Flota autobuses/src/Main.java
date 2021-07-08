import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Modelo g1000= new Modelo(1, "G1000", 25, 6.5);
        Modelo g2000= new Modelo(1, "G2000", 35, 6.8);


        Autobus autobus101 = new Autobus(1, 101, g1000);
        Autobus autobus102 = new Autobus(1, 102, g1000);
        Autobus autobus103 = new Autobus(1, 103, g2000);

        //incidencias
        Incidencia incidencia1 = new Incidencia(1, "revision", Calendar.getInstance().getTime(),200, "Revision mensual programada", autobus101);
        Incidencia incidencia2 = new Incidencia(1, "reparacion", Calendar.getInstance().getTime(),1000, "Revision sistema de frenos", autobus102);
        Incidencia incidencia3 = new Incidencia(1, "revision", Calendar.getInstance().getTime(),200, "Revision mensual programada", autobus102);
        Incidencia incidencia4 = new Incidencia(1, "revision", Calendar.getInstance().getTime(),200, "Revision mensual programada", autobus103);
        Incidencia incidencia5 = new Incidencia(1, "reparacion", Calendar.getInstance().getTime(),2500, "Reparacion caja de cambios", autobus103);

        //imprimimos
        System.out.println(incidencia1.toString());
        System.out.println(incidencia2.toString());
        System.out.println(incidencia3.toString());
        System.out.println(incidencia4.toString());
        System.out.println(incidencia5.toString());


    }
}
