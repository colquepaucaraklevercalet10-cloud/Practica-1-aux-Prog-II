package ejercicio5;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchivoFarmacia {
    private String nombreArchivo;

    public ArchivoFarmacia(String nombreArchivo) { this.nombreArchivo = nombreArchivo; }

    public void crearArchivo() {
        try {
            Files.write(Paths.get(nombreArchivo), "[]".getBytes());
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void guardarTodas(List<Farmacia> lista) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(lista);
            FileWriter fw = new FileWriter(nombreArchivo);
            fw.write(json);
            fw.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public void guardarFarmacia(Farmacia f) {
        try {
            List<Farmacia> lista = leerTodas();
            lista.add(f);
            guardarTodas(lista);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public List<Farmacia> leerTodas() {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(nombreArchivo));
            Farmacia[] arr = gson.fromJson(reader, Farmacia[].class);
            reader.close();
            if (arr == null) return new ArrayList<>();
            return new ArrayList<>(Arrays.asList(arr));
        } catch (Exception e) { e.printStackTrace(); return new ArrayList<>(); }
    }

    public void listar() {
        List<Farmacia> lista = leerTodas();
        for (Farmacia f : lista) f.mostrar();
    }

    public void mostrarMedicamentosTosSucursal(int suc) {
        List<Farmacia> lista = leerTodas();
        for (Farmacia f : lista) if (f.getSucursal() == suc) f.mostrarMedicamentosTipo("tos");
    }

    public void mostrarSucursalDireccionConMedicamento(String nombreMed) {
        List<Farmacia> lista = leerTodas();
        for (Farmacia f : lista) if (f.tieneMedicamento(nombreMed)) System.out.println("Sucursal " + f.getSucursal() + " | Dirección: " + f.getDireccion());
    }

    public void buscarMedicamentosPorTipo(String tipo) {
        List<Farmacia> lista = leerTodas();
        for (Farmacia f : lista) {
            System.out.println("Farmacia sucursal " + f.getSucursal() + ":");
            f.mostrarMedicamentosTipo(tipo);
        }
    }

    public void ordenarFarmaciasPorDireccion() {
        List<Farmacia> lista = leerTodas();
        lista.sort(Comparator.comparing(Farmacia::getDireccion, String.CASE_INSENSITIVE_ORDER));
        for (Farmacia f : lista) f.mostrar();
    }

    public void moverMedicamentosTipoX(String tipo, int sucY, int sucZ) {
        List<Farmacia> lista = leerTodas();
        Farmacia origen = null;
        Farmacia destino = null;
        for (Farmacia f : lista) {
            if (f.getSucursal() == sucY) origen = f;
            if (f.getSucursal() == sucZ) destino = f;
        }
        if (origen != null && destino != null) origen.moverMedicamentosTipoHacia(tipo, destino);
        guardarTodas(lista);
    }
}