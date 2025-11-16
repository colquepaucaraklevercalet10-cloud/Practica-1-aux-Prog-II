package relaciones;
public class Main { 
    public static void main(String[] args) { 
        Ropero ropero = new Ropero("Madera"); 
 
        ropero.adicionar(new Ropa("Camisa", "Algodón")); 
        ropero.adicionar(new Ropa("Pantalón", "Jeans")); 
        ropero.adicionar(new Ropa("Chamarra", "Cuero")); 
        ropero.adicionar(new Ropa("Camisa", "Seda")); 
 
        System.out.println("Contenido inicial:"); 
        ropero.mostrar(); 
 
        ropero.eliminarPorMaterial("Cuero"); 
        ropero.eliminarPorTipo("Pantalón"); 
 
        System.out.println("\nDespués de eliminar:"); 
        ropero.mostrar(); 
 
        ropero.mostrarPor("Seda", "Camisa"); 
    } 
}
