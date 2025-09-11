public class BreakContinue {
    public static void main (String []args){
        for (int x=0; x<5; x++){
            if (x==4){
                break; //pido que se rompa el bucle cuando x=4
            }
         System.out.println ("X = " +x);
        }
        
        for (int i = 0; i<10; i++){
            if (i % 2 !=0){  
                continue; //pido que los numeros diferentes de i dividio 2 = 0 sean salteados
            }
            System.out.println ("Es par = " +i);
        }
    }

}
