package src;

public class Profesor extends Persona {
    private String curso;

    public Profesor(String nombre, String apellido, int edad, String curso) {
        establecerNombre(nombre);
        establecerApellido(apellido);
        establecerEdad(edad);
        establecerCurso(curso);
    }

    @Override
    public void accion() {
        System.out.println("Estoy enseñando a mis estudiantes");
    }

    public void establecerCurso(String curso) {
        this.curso = curso;
    }

    public String obtenerCurso() {
        return curso;
    }
}
