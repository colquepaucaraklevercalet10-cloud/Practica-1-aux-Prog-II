package relaciones;
public class Main {

    public static void main(String[] args) {
        Departamento D1=new Departamento();
        D1.mostrarEmpleados();
        
        System.out.println("------------------------------------------------");
        Departamento D2=new Departamento(0);
        D2.mostrarEmpleados();
        
        System.out.println("------------------------------------------------");
        D1.cambiarSalario( 3839.3);
        D1.mostrarEmpleados();
        
        System.out.println("------------------------------------------------");
        D1.verificarSiPertenece(D2);
        
        System.out.println("-----------------cambio-------------------------------");
        D1.cambiarEmpleados(D2);
        D1.mostrarEmpleados();
        D2.mostrarEmpleados();
    }
}