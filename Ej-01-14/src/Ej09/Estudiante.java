package Ej09;

public class Estudiante {
    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
    private int nota;
    private boolean notaAsignada = false;

    public void setNota(int nota){
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            notaAsignada = true;
        }
        }
        
    
    public String calificacion(){
     if (notaAsignada == true) {
    if (nota >= 6) {
        return "Aprobó"; 
    } return "Desaprobó";
    } return "Ingrese una nota válida";
    }
}