package Ej10;

public class EstudianteTres extends PersonaTres {
    // 2. Luego crea una clase Student que agregue el atributo grade y un método study().
    private int nota;

    public EstudianteTres(String nombre, int edad, int nota) {
        super(nombre, edad);
        this.setNota(nota);
    }

    public void setNota(int nota){
        if (nota <= 10 && nota >= 0) {
            this.nota = nota;
        } else {
            System.out.println("Ingrese una nota válida");
        }
    }

    public int getNota(){
        return nota;
    }
    
    public String estudiar(){
       String calificacion = (nota == 10) ? "No tenes que estudiar" : (nota <= 9 && nota >= 7) ? "Te falto un poquito" : (nota <= 6) ? "Segui estudiando" : "Ponete a estudiar";
       return calificacion;
    }
}
