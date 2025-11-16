package manejo.de.excepciones;
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);

        try {
            cuenta.depositar(500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            cuenta.depositar(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            cuenta.retirar(300);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        try {
            cuenta.retirar(2000);
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        cuenta.mostrarInfo();
    }
}