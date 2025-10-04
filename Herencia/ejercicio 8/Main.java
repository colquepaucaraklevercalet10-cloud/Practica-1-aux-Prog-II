package herencia;
public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("Luis", "Mariposa", "Montaña", 10);

        System.out.println(triatleta);
        triatleta.nadar();
        triatleta.pedalear();
        triatleta.correr();
    }
}