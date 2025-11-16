package relaciones;
import java.util.*;
public class Ropero { 
    private String material; 
    private ArrayList<Ropa> ropas = new ArrayList<>(); 
 
    public Ropero(String material) { 
        this.material = material; 
    } 
 
    public void adicionar(Ropa r) { 
        ropas.add(r); 
    } 
 
    public void eliminarPorMaterial(String mat) { 
        ropas.removeIf(r -> r.getMaterial().equalsIgnoreCase(mat)); 
    } 
 
    public void eliminarPorTipo(String tipo) { 
        ropas.removeIf(r -> r.getTipo().equalsIgnoreCase(tipo)); 
    } 
 
    public void mostrarPor(String mat, String tipo) { 
        System.out.println("Prendas de material " + mat + " y tipo " + tipo + ":"); 
        for (Ropa r : ropas) 
            if (r.getMaterial().equalsIgnoreCase(mat) && r.getTipo().equalsIgnoreCase(tipo)) 
                r.mostrar(); 
    } 
 
    public void mostrar() { 
        System.out.println("\nRopero de material: " + material); 
        for (Ropa r : ropas) r.mostrar(); 
    } 
}