public class OperadorTernario {
    public static void main (String []args){
        int  temperatura = 23;
        String clima = (temperatura<=12)? "Hace frio" 
        : (temperatura>=13 && temperatura <=24)? "Esta fresco" 
        : (temperatura >=25 && temperatura <=28)?"Esta lindo":"Hace calor";
        System.out.println (clima);
    }

}
