package introduccion;

public class Buzon {
    private int nro;
    private int nroC; 
    private Carta[][] cartas;

    public Buzon(int nro, int nroC) {
        this.nro = nro;
        this.nroC = nroC;
        this.cartas = new Carta[3][nroC]; 
    }

    public void agregarCarta(Carta c, int fila, int col) {
        if (fila >= 0 && fila < cartas.length && col >= 0 && col < nroC) {
            cartas[fila][col] = c;
        }
    }

    public int contarCartasPorDestinatario(String destinatario) {
        int contador = 0;
        for (int i = 0; i < cartas.length; i++) {
            for (int j = 0; j < nroC; j++) {
                if (cartas[i][j] != null && cartas[i][j].getDestinatario().equalsIgnoreCase(destinatario)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public boolean eliminarCarta(String codigo) {
        for (int i = 0; i < cartas.length; i++) {
            for (int j = 0; j < nroC; j++) {
                if (cartas[i][j] != null && cartas[i][j].getCodigo().equalsIgnoreCase(codigo)) {
                    cartas[i][j] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarRemitente(String remitente) {
        for (int i = 0; i < cartas.length; i++) {
            for (int j = 0; j < nroC; j++) {
                if (cartas[i][j] != null && cartas[i][j].getRemitente().equalsIgnoreCase(remitente)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void buscarPorPalabraClave(String palabra) {
        for (int i = 0; i < cartas.length; i++) {
            for (int j = 0; j < nroC; j++) {
                if (cartas[i][j] != null && cartas[i][j].getDescripcion().toLowerCase().contains(palabra.toLowerCase())) {
                    System.out.println(cartas[i][j]);
                }
            }
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Buzón Nº" + nro + "\n");
        for (int i = 0; i < cartas.length; i++) {
            for (int j = 0; j < nroC; j++) {
                if (cartas[i][j] != null) {
                    sb.append(cartas[i][j]).append("\n");
                }
            }
        }
        return sb.toString();
    }
}