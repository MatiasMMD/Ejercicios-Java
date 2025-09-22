package Ej12;

public class Dog extends Animal{
    // 3. Implementa Dog y Cat para que hagan sonidos distintos. 
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " hace: Woof Woof");
    }
}
