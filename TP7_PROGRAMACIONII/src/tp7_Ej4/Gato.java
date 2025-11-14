package tp7_ej4;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Miau, miauuu";
    }

    @Override
    public String describirAnimal() {
        return "El gato es un animall intimidante y cariñoso.";
    }
}
