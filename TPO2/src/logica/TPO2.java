package logica;

import igu.Ventana;

public class TPO2 {
    public static void main(String[] args) {
        ControladoraLogica control = new ControladoraLogica();
        Ventana ventana = new Ventana(control);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        //anulo la opcion de maximizar porque queda cualquier cosa jaja
        ventana.setResizable(false);
    }

}
