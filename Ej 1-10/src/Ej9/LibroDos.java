package Ej9;

public class LibroDos {
    // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
    private String titulo;

    public LibroDos(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

}
