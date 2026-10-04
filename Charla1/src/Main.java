public class Main {
    public static void main(String[] args) {
      
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "Ana";
        estudiante1.apellido = "López";
        estudiante1.edad = 16;
        estudiante1.nota = 85;

        System.out.println("======= DATOS =======");
        estudiante1.mostrarInformacion();

        if (estudiante1.aprobado()) {
            System.out.println("El estudiante aprobó el curso");
        } else {
            System.out.println("El estudiante reprobó el curso");
        }
    }    
}
