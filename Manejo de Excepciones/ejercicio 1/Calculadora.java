package manejo.de.excepciones;
public class Calculadora { 
    public static int sumar(int a, int b) { return a + b; } 
    public static int restar(int a, int b) { return a - b; } 
    public static int multiplicar(int a, int b) { return a * b; } 
 
    public static int dividir(int a, int b) { 
        if (b == 0) 
            throw new ArithmeticException("División por cero no permitida"); 
        return a / b; 
    } 
 
    public static int convertir(String valor) throws NumeroInvalidoException { 
        try { 
            return Integer.parseInt(valor); 
        } catch (NumberFormatException e) { 
            throw new NumeroInvalidoException("El valor '" + valor + "' no es numérico"); 
        } 
    } 
}