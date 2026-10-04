import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion = "y";

        while (opcion.equalsIgnoreCase("y")) {
            System.out.print("Ingrese la nota del estudiante: ");
            int nota = sc.nextInt();
            sc.nextLine();

            if (nota >= 60) {
                System.out.println("El estudiante aprobó el examen.");
            } else {
                System.out.println("El estudiante reprobó el examen.");
            }

            System.out.print("¿Desea continuar? (Y/N): ");
            opcion = sc.nextLine();
        }

        sc.close();
        System.out.println("¡Hasta pronto!");
    }
}
