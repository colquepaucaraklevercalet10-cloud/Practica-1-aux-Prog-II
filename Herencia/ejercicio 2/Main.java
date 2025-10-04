package herencia;
public class Main {
    public static void main(String[] args) {
        Animal[] zoologico = new Animal[3];

        zoologico[0] = new Leon("Simba", 5);
        zoologico[1] = new Pinguino("Pingu", 3);
        zoologico[2] = new Canguro("Kangoo", 6);

        for (Animal a : zoologico) {
            a.desplazarse();
        }
    }
}