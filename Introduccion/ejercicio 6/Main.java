package introduccion;
import java.util.Arrays;
public class Main {
    public static void main (String[]args){
        Fruta f1 = new Fruta();
        f1.setNombre("Kiwi");
        f1.setTipo("Subtropical");
        f1.setNroVitaminas(3);
        f1.setVitamina(0, "K");
        f1.setVitamina(1, "C");
        f1.setVitamina(2, "E");

        Fruta f2 = new Fruta("Naranja", "Cítrica");
        f2.setNroVitaminas(2);
        f2.setVitamina(0, "C");
        f2.setVitamina(1, "A");

        String[] vitaminasMango = {"A", "C", "E", "B6"};
        Fruta f3 = new Fruta("Mango", "Tropical", 4, vitaminasMango);

        System.out.println("--- Lista de Frutas ---");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        Fruta mayor = f1;
        if (f2.getNroVitaminas() > mayor.getNroVitaminas()) mayor = f2;
        if (f3.getNroVitaminas() > mayor.getNroVitaminas()) mayor = f3;

        System.out.println("\nFruta con más vitaminas: " + mayor.getNombre());
        
        System.out.println("\nVitaminas del " + f3.getNombre() + ":");
        for (int i = 0; i < f3.getNroVitaminas(); i++) {
            System.out.print(f3.getVitamina(i) + " ");
        }
        System.out.println();

        int totalCitricas = 0;
        Fruta[] frutas = {f1, f2, f3};
        for (Fruta f : frutas) {
            if (f.getTipo().equalsIgnoreCase("Cítrica")) {
                totalCitricas += f.getNroVitaminas();
            }
        }
        System.out.println("\nTotal de vitaminas en frutas cítricas: " + totalCitricas);

        System.out.println("\n--- Vitaminas ordenadas alfabéticamente ---");
        for (Fruta f : frutas) {
            String[] aux = new String[f.getNroVitaminas()];
            for (int i = 0; i < f.getNroVitaminas(); i++) {
                aux[i] = f.getVitamina(i);
            }
            Arrays.sort(aux);
            System.out.println(f.getNombre() + ": " + Arrays.toString(aux));
        }
    }
}