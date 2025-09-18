package Ej12;

public class WordDocument extends Document{
    // 9. Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
    @Override
    public void print(){
        System.out.println("¿Seguro que quiere imprimir este documento en formato Word?");
    }
}
