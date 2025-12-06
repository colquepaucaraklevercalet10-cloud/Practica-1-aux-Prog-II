package ejercicio3;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class GsonLeerProducto {
    public static void main(String[] args) {
        try {
            ArchivoProducto ap = new ArchivoProducto("productos.json");
            ap.crearArchivo();

            ap.guardarProducto(new Producto(1, "Leche", 8.5f));
            ap.guardarProducto(new Producto(2, "Azucar", 6.0f));
            ap.guardarProducto(new Producto(3, "Café", 22.0f));
            ap.guardarProducto(new Producto(4, "Harina", 4.5f));

            System.out.println("Productos guardados:");
            for (Producto p : ap.getLista()) System.out.println(p);

            Reader reader = Files.newBufferedReader(Paths.get("productos.json"));
            Gson gson = new Gson();
            Producto[] listaLeida = gson.fromJson(reader, Producto[].class);

            System.out.println("\nProductos leídos del archivo:");
            for (Producto p : listaLeida) System.out.println(p);

            System.out.println("\nBuscando producto con código 3:");
            Producto encontrado = ap.buscaProducto(3);
            if (encontrado != null) System.out.println(encontrado);
            else System.out.println("No existe");

            System.out.println("\nPromedio de precios:");
            System.out.println(ap.promedioPrecios());

            System.out.println("\nProducto más caro:");
            Producto caro = ap.productoMasCaro();
            if (caro != null) System.out.println(caro);
            else System.out.println("No hay productos");

        } catch (Exception e) {
            System.out.println("Error en la ejecución");
        }
    }
}