package herencia;
public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Carlos", "ABC123", 1, 50, "Sindicato A");
        Auto auto = new Auto("Luis", "XYZ456", 2, 120, true);
        Moto moto = new Moto("Ana", "MNO789", 3, 500, true);

        System.out.println(bus);
        System.out.println(auto);
        System.out.println(moto);

        // Cambiamos conductor de la moto
        moto.setConductor("Pedro");
        System.out.println("Después de cambiar conductor:");
        System.out.println(moto);
    }
}