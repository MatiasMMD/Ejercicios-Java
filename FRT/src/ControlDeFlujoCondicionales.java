public class ControlDeFlujoCondicionales {
    public static void main (String []args){
      int edad = 12;
      
      if (edad<=17){
        System.out.println ("Soy un niño");
      } else if (edad >=18 && edad<=21){
        System.out.println ("Soy un adolescente");
      } else if(edad>=22 && edad <=70) {
        System.out.println ("Soy un adulto");
      } else{
        System.out.println ("Soy un anciano");
      }
    }


}
