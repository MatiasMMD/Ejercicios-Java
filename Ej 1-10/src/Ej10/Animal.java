package Ej10;

public class Animal {
    // 3. Crea una clase Animal con el método makeSound(). 
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre (){
        return nombre;
    }

    public void hacerSonido(){
        System.out.println("*El animal hace un sonido*");
    }

}
