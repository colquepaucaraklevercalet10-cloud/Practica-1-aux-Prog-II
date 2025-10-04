package herencia;
public class Main {
    public static void main(String[] args) {
        JefePolicia jp1 = new JefePolicia("Carlos", 45, 3500, "Comandante", "Mayor", "Seguridad");
        JefePolicia jp2 = new JefePolicia("Luis", 50, 4200, "Inspector", "Coronel", "Investigaciones");

        System.out.println(jp1);
        System.out.println(jp2);

        JefePolicia mayorSueldo = jp1.getSueldo() > jp2.getSueldo() ? jp1 : jp2;
        System.out.println("Mayor sueldo: " + mayorSueldo.getNombre());

        if (jp1.getGrado().equals(jp2.getGrado())) {
            System.out.println("Ambos tienen el mismo grado");
        } else {
            System.out.println("Tienen grados distintos");
        }
    }
}