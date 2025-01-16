import java.util.Random;
import java.util.Scanner;

public class calculadora {
    private static Scanner leer = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) { 
    
        String validas = ("1234PMmSs");
        while(true){
        //El menu
        System.out.println("Seleccione la eleccion: ");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multipliacion");
        System.out.println("4. division");
        System.out.println("P. potencia");
        System.out.println("M. maximo");
        System.out.println("m. minimo");
        System.out.println("S. salir");
        System.out.println(" ");
        System.out.print("elige que operacion quieres: ");
        //Guardamos la variable
        String eleccion = leer.nextLine();

            if (!validas.contains(eleccion)) {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Elegiste una opcion no valida");
                continue;
                
            }

            if (eleccion.equalsIgnoreCase("S")) {
                System.exit(0);
            }

        //Pedimos las dos variables y las guardamos
        System.out.println("Introduce el primer numero o -R- para un número aleatorio");
        String numeroEntrada1 = leer.nextLine();

        System.out.println("Introduce el segundo numero o -R- para un número aleatorio");
        String numeroEntrada2 = leer.nextLine();

        int numero1;
        int numero2;

        
        
        // Si numero1 y numero2 = R genera un numero aleatorio sino el que haya puesto el usuario
        if (numeroEntrada1.equalsIgnoreCase("R")) {
            numero1 = random.nextInt(100) + 1; 
            System.out.println(numero1);
        } 
        
        else {
            numero1 = Integer.parseInt(numeroEntrada1);
            System.out.println(numero1);
        }

        if (numeroEntrada2.equalsIgnoreCase("R")) {
            numero2 = random.nextInt(100) + 1; 
            System.out.println(numero2);
        } 
        
        else {
            numero2 = Integer.parseInt(numeroEntrada2);
            System.out.println(numero2);
        }
        
        //Hacemos las elecciones dependiendo de que numero se ponga
          switch (eleccion) {
            case "1":
                System.out.print("\033[H\033[2J");  
                System.out.flush();

                System.out.println("Sumaste: " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("La suma es: " + (numero1 + numero2));
                break;

            case "2":
                 System.out.print("\033[H\033[2J");  
                 System.out.flush();

                System.out.println("Restaste " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("La resta es: " + (numero1 - numero2));
                break;

            case "3":
                 System.out.print("\033[H\033[2J");  
                 System.out.flush();

                System.out.println("multiplicaste: " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("La multiplicacion es: " + (numero1 * numero2));
                break;

            case "4":
                System.out.print("\033[H\033[2J");  
                System.out.flush();

                System.out.println("dividiste: " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("La division es: " + (numero1 / numero2));
                break;

            case "P":
                System.out.print("\033[H\033[2J");  
                System.out.flush();

                System.out.println("los numeros a potenciar son: " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("la potencia es: " + Math.pow(numero1,numero2));
                break;

            case "M":
                System.out.print("\033[H\033[2J");  
                System.out.flush();

                System.out.println("los numeros a hacer el m.c.d son: " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("el maximo es: " + Math.max(numero1,numero2));
                break;

            case "m":
                System.out.print("\033[H\033[2J");  
                System.out.flush();

                System.out.println("los numeros a hacer el m.c.m son: " + numero1 + " y el segundo numero es: " + numero2);
                System.out.println("el minimo es: " + Math.min(numero1,numero2));
                break;

            case "S":
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                
                System.out.println("saliste del programa");
                break;
            default:
                System.out.println("operación no válida");
                break;
        
            }
        }
    }
}