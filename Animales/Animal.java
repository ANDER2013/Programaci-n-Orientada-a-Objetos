package herencia;

public class Animal {
    String tipo;
    int edad;

    public Animal(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
    }

    public void mostrarDatos() {  
        System.out.println("Tipo: " + tipo);
        System.out.println("Edad: " + edad);
    }
}
