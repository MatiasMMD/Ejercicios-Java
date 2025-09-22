package Ej11;

public class Cow extends Animal {
    // 1. Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    // 7. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    private String name;

    public Cow(String name) {
    super(name);
    this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println("Mooo");
    }

    @Override
    public void getType(){
        System.out.println("Es una vaca");
    }
}
