package tp7_ej4;

public class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Guau guau!";
    }

    @Override
    public String describirAnimal() {
        return "El perro es un animal doméstico, el mejor amigo del hombre!.";
    }
}

