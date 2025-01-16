package RP8;
public class RP8E9 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

      //Pedir numero al usuario
      int numero = 0;
      int resultado = numero%2;
      System.out.println("Elige un numero: ");
      numero = leer.nextInt();
      if (numero<0) {
        System.out.println("debes poner un numero positivo y entero");
      }

      while (resultado==0) {
        System.out.println("paco");
      }
      
      leer.close();
    }
}    
