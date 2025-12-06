package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestionCharangos {
    private ArrayList<Charango> lista = new ArrayList<>();

    public void agregar(Charango c) {
        lista.add(c);
    }

    public ArrayList<Charango> getLista() {
        return lista;
    }

    public void eliminarSiMasDe6False() {
        lista.removeIf(c -> c.contarFalse() > 6);
    }

    public ArrayList<Charango> listarPorMaterial(String m) {
        ArrayList<Charango> r = new ArrayList<>();
        for (Charango c : lista)
            if (c.getMaterial().equalsIgnoreCase(m))
                r.add(c);
        return r;
    }

    public ArrayList<Charango> buscar10Cuerdas() {
        ArrayList<Charango> r = new ArrayList<>();
        for (Charango c : lista)
            if (c.getNroCuerdas() == 10)
                r.add(c);
        return r;
    }

    public void ordenarPorMaterial() {
        Collections.sort(lista, new Comparator<Charango>() {
            public int compare(Charango a, Charango b) {
                return a.getMaterial().compareToIgnoreCase(b.getMaterial());
            }
        });
    }
}