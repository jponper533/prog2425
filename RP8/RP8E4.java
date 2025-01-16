package RP8;
public class RP8E4 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int aleatorio = (int) (Math.random()*100)+1;


        int intentos = 0;
        int restoIntentos = 9;
        boolean acierto = false;

        while (intentos<10 && acierto==false) {
            System.out.println("Dame un numero (del 1 al 100): ");
            int eleccionUsu = leer.nextInt();

            if (eleccionUsu<aleatorio) {
                System.out.println("El numero a adivinar es mayor");
                System.out.println("Te quedan "+restoIntentos+" intentos");
                System.out.println("");
            } else if (eleccionUsu>aleatorio){
                System.out.println("El numero a adivinar es menor");
                System.out.println("Te quedan "+restoIntentos+" intentos");
                System.out.println("");
            } else {
                System.out.println("acertaste el numero");
                System.out.println("");
                acierto=true;
            }

            intentos++;
            restoIntentos--;
            
        }
        
        leer.close();
    }
}
