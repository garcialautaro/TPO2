package logica;

import igu.Ventana1;

public class main {
    public static void main(String args[]) {
        Ventana1 ventana = new Ventana1();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        //anulo la opcion de maximizar porque queda cualquier cosa jaja
        ventana.setResizable(false);
    }
}
