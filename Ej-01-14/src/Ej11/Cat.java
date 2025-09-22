package Ej11;

public class Cat extends Animal{
    // 1. Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    // 7. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    private String name;

    public Cat(String name) {
    super(name);
    this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println("Meoow");
    }

    @Override
    public void getType(){
        System.out.println("Es un gato");
    }
}
