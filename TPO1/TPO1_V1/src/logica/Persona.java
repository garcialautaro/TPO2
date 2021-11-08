package logica;

public class Persona {

    //CREO LOS VECTORES
    public String dni[] = new String[10];
    public String nombre[] = new String[10];
    public String apellido[] = new String[10];
    public String direccion[] = new String[10];
    public String telefono[] = new String[10];
    public String fnac[] = new String[10];

    //METODO PARA INICIAR VECTORES
    public void iniciarVectores() {
        for (int i = 0; i < 10; i++) {
            dni[i] = "";
            nombre[i] = "";
            apellido[i] = "";
            direccion[i] = "";
            telefono[i] = "";
            fnac[i] = "";
        }
    }

    //METODO PARA CARGAR UNA PERSONA
    public void cargarPersona(int indice, String dni, String nombre, String apellido,
            String direccion, String telefono, String fnac) {
        this.dni[indice] = dni;
        this.nombre[indice] = nombre;
        this.apellido[indice] = apellido;
        this.direccion[indice] = direccion;
        this.telefono[indice] = telefono;
        this.fnac[indice] = fnac;
    }

    //METODOS PARA OBTENER UNA PERSONA
    public String getDni(int indice) {
        return this.dni[indice];
    }

    public String getNombre(int indice) {
        return this.nombre[indice];
    }

    public String getApellido(int indice) {
        return this.apellido[indice];
    }

    public String getDireccion(int indice) {
        return this.direccion[indice];
    }

    public String getTelefono(int indice) {
        return this.telefono[indice];
    }

    public String getFnac(int indice) {
        return this.fnac[indice];
    }
}
