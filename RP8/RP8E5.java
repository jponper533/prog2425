package RP8;
public class RP8E5 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //Pedir numero al usuario
        System.out.println("Elige un numero: ");

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

        leer.close();
    }
        
}
