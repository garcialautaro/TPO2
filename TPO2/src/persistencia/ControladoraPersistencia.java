package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Perro;

public class ControladoraPersistencia {
    PerroJpaController perroJPA = new PerroJpaController();
    
    public void guardarPerro(Perro pe){
        try {
            perroJPA.create(pe);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

