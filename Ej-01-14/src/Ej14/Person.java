// 8. Crea una clase con comentarios adecuados explicando cada sección del código.
//Declaro en que paquete se encuentra la clase
package Ej14;

//Creo la clase
public class Person {
    //Declaro los atributos de la clase Person.
    private String name;
    private int age;
    final private String DNI;

    //Creo el constructor de la clase Person para poder inicializar los atributos en otra clase al crearla como objeto.
    public Person (String name, int age, String DNI) {
        this.setName(name);
        this.setAge(age);
        this.DNI = DNI;
    }

    //Setter para que el atributo name sea una String y que no acepte una String vacía.
    public void setName(String name){
       if (name.length() > 0) {
        this.name = name;
       } else {
        System.out.println("Nombre inválido.");
       }
    }

    //Setter para que el atributo age no acepte una edad negativa.
    public void setAge(int age){
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad inválida.");
        }
    }

    //Getters para poder acceder a los atributos en la clase main() (uno para cada atributo).
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDNI(){
        return DNI;
    }

    //Métodos que la clase Person puede utilizar. Por un lado, el greet(String partnerName) saludo a una persona. Por otro lado, eat(String food) muestra qué esta comiendo.
    public void greet(String partnerName){
        System.out.println("Hola " + partnerName + ", ¿Cómo andas?");
    }

    public void eat(String food){
        System.out.println("Estoy comiendo " + food);
    }
}
