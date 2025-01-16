package RP8;
public class RP8E8 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

      //Pedir numero al usuario
      int i = 0;
      int numero = 0;
      int numero1 = 0;
      int numero2 = 1;
      
      System.out.println("Elige un numero: ");
      numero = leer.nextInt();
      
      for( i=1; i<numero; i++){
        if (numero1==0) {
            System.out.print(numero1 + " ");
            System.out.print(numero2 + " ");
        }
        numero2 = numero1 +(numero1 = numero2);

        System.out.print(numero2+" "); // 0


      }
      
      leer.close();
    }
}    
