public class Bucles {
    public static void main (String []args){
        for (int x=0; x<5; x++){
            System.out.println("X = " +x);
        }

        int numero = 0;
        while (numero<7) {
            System.out.println ("Número con while = "+numero);
            numero++;
        }
        
        int y = 8;
        do {
            System.out.println ("Número con do while = " + y);
            y--;
        } while (y!=0);

        }

}
