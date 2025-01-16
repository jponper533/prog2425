package RP2;
public class RP2E5 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena) para simplificar 
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena1 = leer.nextLine();

        //pedimos la segunda cadena
        System.out.print("Introduce otra cadena de caracteres: ");
        String cadena2 = leer.nextLine();

        //hacemos una condicional para saber si esta contenida en la cadena uno
        if (cadena1.contains(cadena2)) {
        System.out.println("La cadena dos esta en la cadena uno");
        }

        else {
        System.out.println("No esta en la cadena uno");
        }




    }
}



