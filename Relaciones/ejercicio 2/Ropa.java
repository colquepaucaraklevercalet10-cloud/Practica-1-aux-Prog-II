package relaciones;
import java.util.*;
public class Ropa { 
    private String tipo; 
    private String material; 
 
    public Ropa(String tipo, String material) { 
        this.tipo = tipo; 
        this.material = material; 
    } 
 
    public void mostrar() { 
        System.out.println("Ropa -> Tipo: " + tipo + ", Material: " + material); 
    } 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}