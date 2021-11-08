package logica;

import igu.Ventana1;

public class TPO1 {

    public static void main(String[] args) {
        //INICIO LA VENTANA
        Ventana1 ventana = new Ventana1();
        ventana.setVisible(true);
        ventana.persona1.iniciarVectores();
        ventana.setLocationRelativeTo(null);
        //anulo la opcion de maximizar porque queda cualquier cosa jaja
        ventana.setResizable(false);
    }

}
