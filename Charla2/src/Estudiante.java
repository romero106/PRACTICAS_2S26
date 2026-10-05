package src;

public class Estudiante extends Persona {
    private int nota;

    public Estudiante(String nombre, String apellido, int edad, int nota) {
        establecerNombre(nombre);
        establecerApellido(apellido);
        establecerEdad(edad);
        establecerNota(nota);
    }

    @Override
    public void accion() {
        System.out.println("Estoy estudiando para aprobar");
    }

    public void establecerNota(int nota) {
        if (nota >= 0 && nota <= 100) {
            this.nota = nota;
        } else {
            System.out.println("La nota no es válida");
        }
    }

    public int obtenerNota() {
        return nota;
    }
}
