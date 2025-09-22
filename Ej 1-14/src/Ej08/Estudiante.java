package Ej08;

public class Estudiante {
    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    int nota;
    String nombre;

    public Estudiante(int nota, String nombre){
        this.nota = nota;
        this.nombre = nombre;
    }

    public String calificacion(){
        if (nota >= 6) {
            return "Aprobaste";
        }
        return "Desaprobaste";
    }
}
