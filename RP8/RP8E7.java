package RP8;
public class RP8E7 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Pedir numero al usuario
        System.out.print("Introduzca el numero del que desea ver el factorial: ");
        int num = leer.nextInt();
        if(num < 0) {
          System.out.println("No se puede calcular factorial de un valor negativo.");
        } else {
          int resultado = Factorial(num);
          System.out.println("El resultado es: " + resultado);
        }
      }
    
      public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
          factorial *= i;
        }
        return factorial;
      }
    }