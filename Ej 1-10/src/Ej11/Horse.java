package Ej11;

public class Horse extends Animal{
    // 7. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    private String name;

    public Horse(String name) {
    super(name);
    this.name = name;
    }

    public void makeSound(){
        System.out.println("Hiiiiiiiiii");
    }

    @Override
    public void getType(){
        System.out.println("Es un caballo");
    }
}
