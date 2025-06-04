package cuentas;

public class CuentaAhorros extends Cuenta {
    double saldo;
    double interes = 5.0; //Aqui se aplica el interes del 5%

    public CuentaAhorros(String titular, double saldo) {
        super(titular);
        this.saldo = saldo;
    }

    public void SaldoConInteres() {
        saldo += saldo * (interes / 100);
    }

    public void mostrarInformacion() {
        mostrarNombre();
        System.out.println("Tipo de cuenta: Ahorros");
        System.out.println("Saldo con interés aplicado: " + saldo);
        System.out.println("Interés aplicado: " + interes + "%");
    }
}
