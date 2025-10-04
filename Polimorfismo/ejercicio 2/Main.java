package polimorfismo;
public class Main {
    public static void main(String[] args) {
        Matriz m1 = new Matriz();

        float[][] valores = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                valores[i][j] = i + j;
            }
        }
        Matriz m2 = new Matriz(valores);

        Matriz suma = m1.sumar(m2);

        Matriz resta = m2.restar(m1);

        boolean iguales = m1.igual(m2);

        System.out.println("Matriz 1 (Identidad):");
        System.out.println(m1);

        System.out.println("Matriz 2:");
        System.out.println(m2);

        System.out.println("Suma:");
        System.out.println(suma);

        System.out.println("Resta:");
        System.out.println(resta);

        System.out.println("¿Matriz 1 es igual a Matriz 2? " + iguales);
    }
}