package Ej11;

public class Animal {
    // 1. Crea una clase Animal con el método makeSound().
    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("El animal hace un sonido");
    }

    public void getType(){
        System.out.println("Es un animal");
    }

    public void showAnimalType(Animal animal){
        animal.getType();
    }
}
