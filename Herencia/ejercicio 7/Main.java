package herencia;
public class Main {
    public static void main(String[] args) {
        Empleado chef = new Chef("Remy", 2000, 10, "Francesa", 50);
        Empleado mesero1 = new Mesero("Linguini", 1200, 200, 5, 20);
        Empleado mesero2 = new Mesero("Colette", 1300, 150, 3, 25);
        Empleado admin1 = new Administrativo("Skinner", 1800, "Gerente");
        Empleado admin2 = new Administrativo("Anton Ego", 2500, "Crítico");

        Empleado[] empleados = {chef, mesero1, mesero2, admin1, admin2};

        System.out.println("=== Todos los empleados ===");
        for (Empleado e : empleados) {
            System.out.println(e);
        }

        float x = 1800;
        System.out.println("\n=== Empleados con sueldo base = " + x + " ===");
        for (Empleado e : empleados) {
            if (e.getSueldoMes() == x) {
                System.out.println(e);
            }
        }
    }
}