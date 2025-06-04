package cuentas;
public class Cuenta {
    String titular;
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    public void mostrarNombre(){
        System.out.println("Titular: " + this.titular);
    }
    
}
