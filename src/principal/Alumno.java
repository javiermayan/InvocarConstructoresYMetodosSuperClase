
package principal;

public class Alumno extends Persona {
    private String materia;
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getNombreCompleto() {     
        return "Me llamo " + super.getNombreCompleto() + " y curso la materia de " + this.materia;
    }   
    
}
