package manejo.de.excepciones;
public class Main { 
    public static void main(String[] args) { 
        try { 
            System.out.println("Suma: " + Calculadora.sumar(5, 3)); 
            System.out.println("Resta: " + Calculadora.restar(10, 4)); 
            System.out.println("Multiplicación: " + Calculadora.multiplicar(3, 5)); 
            System.out.println("División: " + Calculadora.dividir(10, 2)); 
 
            System.out.println("División con error:"); 
            System.out.println(Calculadora.dividir(10, 0)); // error 
 
        } catch (ArithmeticException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
 
        try { 
            int n1 = Calculadora.convertir("123"); 
            int n2 = Calculadora.convertir("abc"); // error 
            System.out.println("Conversión correcta: " + n1); 
            System.out.println("Conversión correcta: " + n2); 
        } catch (NumeroInvalidoException e) { 
        System.out.println("Error: " + e.getMessage()); 
        } 
    } 
}
