package herencia;

public class Perro extends Animal {
    String raza;
    int vacunasAplicadas;

    public Perro(String tipo, int edad, String raza, int vacunasAplicadas) {
        super(tipo, edad);
        this.raza = raza;
        this.vacunasAplicadas = vacunasAplicadas;
    }

    public void mostrarInfo(String estado, int totalVacunas) {
        mostrarDatos();
        System.out.println("Raza: " + raza);
        System.out.println("Estado: " + estado);
        System.out.println("Vacunas aplicadas: " + vacunasAplicadas);
        System.out.println("Vacunas totales recomendadas: " + totalVacunas);
    }
}
