package herencia;
public class Main {
    public static void main(String[] args) {

        Presidente p1 = new Presidente("Luis", "Perez", "Abogado", 20, "Partido Azul", "Opositor");
        Presidente p2 = new Presidente("Maria", "Lopez", "Economista", 15, "Partido Rojo", "Gobernante");

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = p1;
        presidentes[1] = p2;
        presidentes[2] = new Presidente("Carlos", "Gomez", "Ingeniero", 10, "Partido Verde", "Independiente");
        for (Presidente p : presidentes) {
            System.out.println(p);
            System.out.println("-----------");
        }

        String nombreBuscado = "Maria";
        for (Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Encontrado: " + p.getNombre() + " " + p.getApellido());
                System.out.println("Partido: " + p.getPartido().getNombreP());
                System.out.println("Profesión: " + p.getProfesion());
            }
        }
    }
}