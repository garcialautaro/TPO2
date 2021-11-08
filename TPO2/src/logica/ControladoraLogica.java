package logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    public ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardarPerro(String nroCliente, String nombrePerro, String raza,
            String color, boolean alergico, boolean atencionEspecial, 
            String nombreDueno, String celular, String observaciones){
        
        Perro pe = new Perro(nroCliente, nombrePerro, raza, color, alergico, 
                atencionEspecial, nombreDueno, celular, observaciones);
        try {
            controlPersis.guardarPerro(pe);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
