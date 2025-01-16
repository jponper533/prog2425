package RP8;
import java.util.Scanner;

public class RP8E10 {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) { 

        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (true) {
            
        //El menu
        System.out.println(" ");
        System.out.println("==============================");
        System.out.println("Seleccione la eleccion: ");
        System.out.println("1. Numeros primos");
        System.out.println("2. tablas de multiplicar");
        System.out.println("3. Factorial");
        System.out.println("4. Fibonacci");
        System.out.println("5. Serie ULAM");
        System.out.println("6. Salir");
        System.out.println("==============================");
        int eleccion = leer.nextInt();

        switch (eleccion) {
            case 1:
                //Pedir numero al usuario

                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                 System.out.println("Elige un numero para saber si es primo o no: ");

                 int numero1 = leer.nextInt();
                 int contador = 0;
                 int i;

                 for (i = 1; i <= numero1; i++) {

                 if (numero1%i == 0) {
                    contador++;
                    }
                }

                 if (contador <= 2) {
                 System.out.println("El numero es primo");
                } else {
                 System.out.println("El numero no es primo");
                }

                break;

            case 2:
                  //Pedir numero al usuario
                  System.out.println("Elige un numero para saber su tabla de multiplicar: ");
                  int numero2 = leer.nextInt();

                  int a;
                  System.out.print("\033[H\033[2J");
                  System.out.flush();
      
                  System.out.println("Tabla del "+numero2);
                  System.out.println("--------------------");
      
                  for(a=1; a<11; a++){
                  int resultado = numero2 * a;
                  System.out.println(numero2+" x "+a+" = " + resultado);
                     }
                break;

            case 3:
                //Pedir numero al usuario
                System.out.print("\033[H\033[2J");
                  System.out.flush();

        System.out.print("Introduzca el numero del que desea ver el factorial: ");
        int num = leer.nextInt();
        if(num < 0) {
          System.out.println("No se puede calcular factorial de un valor negativo.");
        } else {
          int resultado = Factorial(num);
          System.out.println("El resultado es: " + resultado);
        }
       
    
                break;

            case 4:
                 int b = 0;
                 int numero = 0;
                 int numeroF = 0;
                 int numeroF2 = 1;

                 System.out.print("\033[H\033[2J");
                 System.out.flush();

                  System.out.println("Elige un numero al que hacerle su Fobonacci: ");
                  numero = leer.nextInt();
            
                  for( b=1; b<numero; b++){
                  if (numeroF==0) {
                  System.out.print(numeroF + " ");
                  System.out.print(numeroF2 + " ");
                     }
                     numeroF2 = numeroF +(numeroF = numeroF2);
      
                 System.out.print(numeroF2+" "); // 0
                    }
                break;

            case 5:
                //Pedir numero al usuario
                int ULAM = 0;

                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("Elige un numero para saber su serie ULAM: ");
                ULAM = leer.nextInt();
                while (ULAM!=1){

                if (ULAM%2==0) {
                    ULAM=ULAM/2;
                }

                else {
                    ULAM=(ULAM*3)+1;
                }

                System.out.print(ULAM + " ");
                }
                break;
        
            case 6:
              System.out.print("\033[H\033[2J");  
              System.out.flush(); 

                System.out.println("saliste del programa");
                System.exit(1);
                break;

            default:
              System.out.print("\033[H\033[2J");  
              System.out.flush(); 
                 System.out.println("operación no válida");
                break;
            
          }
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

