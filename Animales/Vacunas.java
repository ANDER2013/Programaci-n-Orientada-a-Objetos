package herencia;

public class Vacunas {
    int totalVacunas;
    String estado;  // "Cachorro" o "Adulto"

    public void calcularVacunas(int edad) {
        if (edad <= 3) {
            totalVacunas = 4;
            estado = "Cachorro";
        } else {
            totalVacunas = 7;
            estado = "Adulto";
        }
    }
}
