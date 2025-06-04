package cuentas;

import java.util.Scanner;

public class Cuentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el tipo de cuenta (ahorros o corriente):");
        String tipoCuenta = sc.nextLine().toLowerCase();

        System.out.print("Ingrese el saldo de la cuenta: ");
        double saldo = sc.nextDouble();

        switch (tipoCuenta) {
            case "ahorros":
                // Creamos una cuenta de ahorros con nombre y saldo
                CuentaAhorros cuentaA = new CuentaAhorros(nombre, saldo);

                // Aplicamos el interés del 5%
                cuentaA.SaldoConInteres();

                // Mostramos la información final
                cuentaA.mostrarInformacion();
                break;

            case "corriente":
                // Creamos una cuenta corriente con nombre y saldo
                CuentaCorriente cuentaC = new CuentaCorriente(nombre, saldo);

                // Aplicamos el interés del 7%
                cuentaC.SaldoConInteres();

                // Mostramos la información final
                cuentaC.mostrarInformacion();
                 break;
            default:
                System.out.println("Tipo de cuenta no válido.");
        }
    }
}
