package manejo.de.excepciones;

public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String msg){
        super(msg);
    }
}