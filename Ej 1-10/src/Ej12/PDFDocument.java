package Ej12;

public class PDFDocument extends Document{
    // 9. Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
    @Override
    public void print(){
        System.out.println("¿Seguro que quiere imprimir este documento en formato PDF?");
    }
}
