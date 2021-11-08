package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perro implements Serializable {
    
    //ATRIBUTOS ----------------------------------------------------------------
    @Id
    private String nroCliente;
    @Basic
    private String nombrePerro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencionEspecial;
    private String nombreDueno;
    private String celular;
    private String observaciones;
    
    //CONSTRUCTORES ------------------------------------------------------------
    public Perro() {
    }
    public Perro(String nroCliente, String nombrePerro, String raza, String color, boolean alergico, boolean atencionEspecial, String nombreDueno, String celular, String observaciones) {
        this.nroCliente = nroCliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.nombreDueno = nombreDueno;
        this.celular = celular;
        this.observaciones = observaciones;
    }
    
    //GETTERS Y SETTERS --------------------------------------------------------
    public String getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(String nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(boolean atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    //METODO TO STRING ---------------------------------------------------------

    @Override
    public String toString() {
        return "Perro{" + "nroCliente: " + nroCliente + ", nombrePerro: " + 
                nombrePerro + ", raza: " + raza + ", color: " + color + 
                ", alergico: " + alergico + ", atencionEspecial: " + 
                atencionEspecial + ", nombreDueno: " + nombreDueno + 
                ", celular: " + celular + ", observaciones: " 
                + observaciones + '}';
    }
    
    
}
