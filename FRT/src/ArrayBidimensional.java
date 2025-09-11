public class ArrayBidimensional {
    public static void main (String[]args){
       
        int [][] diasMes = new int [3][3]; //defini el array
        int [][] nombreDias = {            //decalre el array
            {22,23,24},
            {25,26,27},
            {28,29,31}
        }; 
        int diaEspecifico = nombreDias[2][0];
        System.out.println(diaEspecifico);
    }

}
