
package principal;

public class Principal {
    
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Juan");
        alumno.setApellido("Pérez");
        alumno.setMateria("Programación en Java");
        
        System.out.println(alumno.getNombreCompleto());
    }
    
}
