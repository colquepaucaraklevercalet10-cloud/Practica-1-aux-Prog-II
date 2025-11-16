package relaciones;
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp");

        Empleado e1 = new Empleado("Ana", "Ingeniera", 3500);
        Empleado e2 = new Empleado("Luis", "Analista", 2800);
        Empleado e3 = new Empleado("Marta", "Gerente", 5000);

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);

        empresa.mostrarInformacion();

        Empleado buscado = empresa.buscarEmpleado("Luis");
        if (buscado != null) System.out.println("Encontrado: " + buscado);

        empresa.eliminarEmpleado("Ana");

        System.out.println("\nDespués de eliminar:");
        empresa.mostrarInformacion();

        System.out.println("Promedio salarial: " + empresa.promedioSalarial());

        System.out.println("\nEmpleados con salario mayor a 3000:");
        empresa.listarMayores(3000);
    }
}