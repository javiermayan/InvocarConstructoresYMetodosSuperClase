
package principal;

public class Persona {
    private String nombre;
    private String apellido;
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }
    
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
}
