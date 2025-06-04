package herencia;

import java.util.Scanner;

public class Herencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de su perrito: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        System.out.print("Ingrese la raza de su perrito: ");
        String raza = scanner.nextLine();

        Vacunas vacunas = new Vacunas();
        vacunas.calcularVacunas(edad);

        System.out.print("Ingrese la cantidad de vacunas que ya tiene aplicadas: ");
        int vacunasAplicadas = scanner.nextInt();

        Perro p = new Perro("Mamífero", edad, raza, vacunasAplicadas);

        System.out.println("\nInformación del perrito:");
        p.mostrarInfo(vacunas.estado, vacunas.totalVacunas);

        if (vacunasAplicadas >= vacunas.totalVacunas) {
            System.out.println("El perrito está al día con sus vacunas.");
        } else {
            System.out.println("El perrito necesita aplicarse " + (vacunas.totalVacunas - vacunasAplicadas) + " vacunas más.");
        }
    }
}
