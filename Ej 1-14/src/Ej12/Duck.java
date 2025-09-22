package Ej12;

public class Duck implements Flyable, Swimmable{
    // 8. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
    private String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println(name + " puede volar.");
    }

    @Override
    public void swim(){
        System.out.println(name + " puede nadar.");
    }
}
