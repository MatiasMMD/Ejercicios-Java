public class Arrays {
    public static void main (String[]args){
      
        String  [] duelistaValo = {"Jett","Reyna","Phoenix","Waylay"}; //declaro el array
        
        System.out.println ("-Duelistas en For each: ");   
        for (String duelistasValo : duelistaValo){      //abro un for each para poder imprimir
            System.out.println(duelistasValo);
        }

        System.out.println ("-Duelistas en while: ");
        int i=0;  //declaro el contador para el while
        while (i<duelistaValo.length){  //abro un while para poder imprimir los items
            System.out.println(duelistaValo[i]);
            i++; //declaro que aumente de a 1
        }
        
        int[] winrateDuelista = {67,88,60,50}; //declaro el array int

        System.out.println ("-Winrate con duelista:");
        for (i=0; i<winrateDuelista.length; i++){  //abro un for tradicional para poder mostrar los winrates
            System.out.println (winrateDuelista[i]);
        }
        
        System.out.println ("Duelista favorito: ");
        System.out.println (duelistaValo[duelistaValo.length-3]);  //pido que se imprima un elemento especifico

        int primerWinrate = winrateDuelista[1];  //declaro un winrate especifico
        System.out.println ("Winrate con duelista favorito: ");
        System.out.println (primerWinrate);  //pido que se imprima el winrate que declare
    }

}
