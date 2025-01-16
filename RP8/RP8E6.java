package RP8;
public class RP8E6 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

      //Pedir numero al usuario
      System.out.println("Elige un numero: ");
      int numero1 = leer.nextInt();

      int i;
      System.out.print("\033[H\033[2J");
      System.out.flush();
      
      System.out.println("Tabla del "+numero1);
      System.out.println("--------------------");
      
      for(i=1; i<11; i++){
        int resultado = numero1 * i;
        System.out.println(numero1+" x "+i+" = " + resultado);
      }
      
      leer.close();
    }
}    
