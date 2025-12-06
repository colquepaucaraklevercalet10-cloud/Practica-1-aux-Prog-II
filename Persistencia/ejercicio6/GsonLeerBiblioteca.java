package ejercicio6;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import com.google.gson.Gson;

public class GsonLeerBiblioteca {
    public static void main(String[] args) {
        try {
            ArchLibro al = new ArchLibro("libros.json");
            ArchPrestamo ap = new ArchPrestamo("prestamos.json");
            ArchCliente ac = new ArchCliente("clientes.json");

            al.crearArchivo();
            ap.crearArchivo();
            ac.crearArchivo();

            al.guardarLibro(new Libro(1, "Java Básico", 25.0));
            al.guardarLibro(new Libro(2, "Estructuras de Datos", 40.0));
            al.guardarLibro(new Libro(3, "Algoritmos", 35.0));
            al.guardarLibro(new Libro(4, "Historia", 15.0));

            ac.guardarCliente(new Cliente(100, "CI100", "Ana", "Perez"));
            ac.guardarCliente(new Cliente(101, "CI101", "Luis", "Gomez"));
            ac.guardarCliente(new Cliente(102, "CI102", "María", "Lopez"));

            ap.guardarPrestamo(new Prestamo(100, 1, "2025-01-10", 2));
            ap.guardarPrestamo(new Prestamo(101, 2, "2025-01-11", 1));
            ap.guardarPrestamo(new Prestamo(100, 2, "2025-01-12", 3));
            ap.guardarPrestamo(new Prestamo(102, 3, "2025-01-13", 1));
            ap.guardarPrestamo(new Prestamo(101, 2, "2025-02-01", 2));

            List<Libro> libros = al.leerTodos();
            List<Prestamo> prestamos = ap.leerTodos();
            List<Cliente> clientes = ac.leerTodos();

            System.out.println("LIBROS EN RANGO DE PRECIO (x=20, y=36):");
            double x = 20, y = 36;
            for (Libro l : libros) if (l.getPrecio() >= x && l.getPrecio() <= y) System.out.println(l);

            System.out.println("\nINGRESO TOTAL GENERADO POR UN LIBRO (cod=2):");
            int codBus = 2;
            double ingreso = 0;
            for (Prestamo p : prestamos) if (p.getCodLibro() == codBus) {
                Libro lb = buscarLibroPorCodigo(libros, p.getCodLibro());
                if (lb != null) ingreso += p.getCantidad() * lb.getPrecio();
            }
            System.out.println("Ingreso total libro " + codBus + " = " + ingreso);

            System.out.println("\nLIBROS NUNCA VENDIDOS:");
            Set<Integer> librosPrestados = new HashSet<>();
            for (Prestamo p : prestamos) librosPrestados.add(p.getCodLibro());
            for (Libro l : libros) if (!librosPrestados.contains(l.getCodLibro())) System.out.println(l);

            System.out.println("\nCLIENTES QUE COMPRARON EL LIBRO (cod=2):");
            Set<Integer> clientesQueCompraron = new HashSet<>();
            for (Prestamo p : prestamos) if (p.getCodLibro() == codBus) clientesQueCompraron.add(p.getCodCliente());
            for (Cliente c : clientes) if (clientesQueCompraron.contains(c.getCodCliente())) System.out.println(c);

            System.out.println("\nLIBRO MÁS PRESTADO (por cantidad total):");
            Map<Integer,Integer> sumaPorLibro = new HashMap<>();
            for (Prestamo p : prestamos) sumaPorLibro.put(p.getCodLibro(), sumaPorLibro.getOrDefault(p.getCodLibro(),0) + p.getCantidad());
            int libroMasPrestado = -1;
            int maxCant = -1;
            for (Map.Entry<Integer,Integer> e : sumaPorLibro.entrySet()) {
                if (e.getValue() > maxCant) { maxCant = e.getValue(); libroMasPrestado = e.getKey(); }
            }
            Libro lm = buscarLibroPorCodigo(libros, libroMasPrestado);
            if (lm != null) System.out.println(lm + " | Total prestado: " + maxCant);

            System.out.println("\nCLIENTE CON MÁS PRÉSTAMOS (por número de préstamos):");
            Map<Integer,Integer> cuentaPrestamos = new HashMap<>();
            for (Prestamo p : prestamos) cuentaPrestamos.put(p.getCodCliente(), cuentaPrestamos.getOrDefault(p.getCodCliente(),0) + 1);
            int clienteMas = -1;
            int maxPrest = -1;
            for (Map.Entry<Integer,Integer> e : cuentaPrestamos.entrySet()) {
                if (e.getValue() > maxPrest) { maxPrest = e.getValue(); clienteMas = e.getKey(); }
            }
            Cliente cm = buscarClientePorCodigo(clientes, clienteMas);
            if (cm != null) System.out.println(cm + " | Cantidad préstamos: " + maxPrest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Libro buscarLibroPorCodigo(List<Libro> libros, int codigo) {
        for (Libro l : libros) if (l.getCodLibro() == codigo) return l;
        return null;
    }

    private static Cliente buscarClientePorCodigo(List<Cliente> clientes, int codigo) {
        for (Cliente c : clientes) if (c.getCodCliente() == codigo) return c;
        return null;
    }
}