package Ej12;

public class Cat extends Animal{
    // 3. Implementa Dog y Cat para que hagan sonidos distintos. 
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " hace: Meoow");
    }
}