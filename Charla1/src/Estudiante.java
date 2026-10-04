class Estudiante {

    String nombre;
    String apellido;
    int edad;
    int nota;

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre );
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Nota: " + nota);
    }

    boolean aprobado() {
        return nota >= 61;
    }
}
