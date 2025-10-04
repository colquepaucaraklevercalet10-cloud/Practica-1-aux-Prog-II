package polimorfismo;
import java.util.Arrays;
public class Matriz {
    private float[][] matriz = new float[10][10];

    public Matriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
    }

    public Matriz(float[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.matriz[i][j] = matriz[i][j];
            }
        }
    }

    public Matriz sumar(Matriz m) {
        float[][] resultado = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] + m.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public Matriz restar(Matriz m) {
        float[][] resultado = new float[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                resultado[i][j] = this.matriz[i][j] - m.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }

    public boolean igual(Matriz m) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.matriz[i][j] != m.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(Arrays.toString(matriz[i])).append("\n");
        }
        return sb.toString();
    }
}