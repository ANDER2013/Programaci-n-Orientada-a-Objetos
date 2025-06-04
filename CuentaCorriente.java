package cuentas;

public class CuentaCorriente extends Cuenta {
    double saldo;
    double interes = 7.0; //Aqui se aplica el interes del 7%

    public CuentaCorriente(String titular, double saldo) {
        super(titular);
        this.saldo = saldo;
    }

    public void SaldoConInteres() {
        saldo += saldo * (interes / 100);
    }

    public void mostrarInformacion() {
        mostrarNombre();
        System.out.println("Tipo de cuenta: Corriente");
        System.out.println("Saldo con interés aplicado: " + saldo);
        System.out.println("Interés aplicado: " + interes + "%");
    }
}
