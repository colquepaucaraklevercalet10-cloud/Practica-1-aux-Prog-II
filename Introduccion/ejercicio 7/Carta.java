package introduccion;

public class Carta {
    private String codigo;
    private String descripcion;
    private String remitente;
    private String destinatario;

    public Carta(String codigo, String descripcion, String remitente, String destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public String getCodigo() { 
        return codigo; }
    public String getDescripcion() { 
        return descripcion; }
    public String getRemitente() { 
        return remitente; }
    public String getDestinatario() { 
        return destinatario; }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Remitente: " + remitente + ", Destinatario: " + destinatario + "\nDescripción: " + descripcion;
    }
}