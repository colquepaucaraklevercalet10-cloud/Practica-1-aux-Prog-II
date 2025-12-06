package ejercicio5;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;

public class GsonLeerFarmacia {
    public static void main(String[] args) {
        try {
            ArchivoFarmacia af = new ArchivoFarmacia("farmacias.json");
            af.crearArchivo();

            Farmacia f1 = new Farmacia("Farmacia Central", 1, "Av. Principal 100");
            f1.agregarMedicamento(new Medicamento("Tapsin", 101, "tos", 12.5));
            f1.agregarMedicamento(new Medicamento("Resfriosol", 102, "resfrio", 8.0));
            f1.agregarMedicamento(new Medicamento("JarabeX", 103, "tos", 9.0));

            Farmacia f2 = new Farmacia("Farmacia Norte", 2, "Calle Norte 45");
            f2.agregarMedicamento(new Medicamento("Tapsin", 201, "tos", 11.0));
            f2.agregarMedicamento(new Medicamento("Antigrip", 202, "resfrio", 15.0));

            Farmacia f3 = new Farmacia("Farmacia Sur", 3, "Bv. Sur 10");
            f3.agregarMedicamento(new Medicamento("PainFree", 301, "dolor", 6.5));
            f3.agregarMedicamento(new Medicamento("JarabeY", 302, "tos", 7.5));

            af.guardarFarmacia(f1);
            af.guardarFarmacia(f2);
            af.guardarFarmacia(f3);

            System.out.println("LISTADO GENERAL:");
            af.listar();

            System.out.println("\nA) Medicamentos para la tos de la Sucursal número 2:");
            af.mostrarMedicamentosTosSucursal(2);

            System.out.println("\nB) Sucursal y dirección que tienen el medicamento 'Tapsin':");
            af.mostrarSucursalDireccionConMedicamento("Tapsin");

            System.out.println("\nC) Buscar medicamentos por tipo 'resfrio':");
            af.buscarMedicamentosPorTipo("resfrio");

            System.out.println("\nD) Farmacias ordenadas por dirección:");
            af.ordenarFarmaciasPorDireccion();

            System.out.println("\nE) Mover medicamentos de tipo 'tos' de la sucursal 1 a la sucursal 3:");
            af.moverMedicamentosTipoX("tos", 1, 3);

            System.out.println("\nLISTADO FINAL:");
            af.listar();

            Reader reader = Files.newBufferedReader(Paths.get("farmacias.json"));
            Gson gson = new Gson();
            Farmacia[] listaLeida = gson.fromJson(reader, Farmacia[].class);
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}