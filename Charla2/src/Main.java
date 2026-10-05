package src;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Ana", "López", 16, 85);
        Profesor profesor1 = new Profesor("Carlos", "García", 35, "Programación");

        System.out.println("=================================");
        System.out.println("            ESTUDIANTE           ");
        System.out.println("=================================");
        estudiante1.mostrarInformacion();
        System.out.println("Nota: " + estudiante1.obtenerNota());
        estudiante1.accion();

        System.out.println("");

        System.out.println("=================================");
        System.out.println("            PROFESOR             ");
        System.out.println("=================================");
        profesor1.mostrarInformacion();
        System.out.println("Curso: " + profesor1.obtenerCurso());
        profesor1.accion();
    }
}
