package tp7_ej4;

public class Vaca extends Animal {
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Muuu!";
    }

    @Override
    public String describirAnimal() {
        return "La vaca nos da la leche, el dulce de leche y la manteca que siempre le pongo al pan";
    }
}

