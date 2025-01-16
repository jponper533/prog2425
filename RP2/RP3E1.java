package RP2;
public class RP3E1 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena1) para simplificar 
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena1 = leer.nextLine();


        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena2) para simplificar 
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena2 = leer.nextLine();

        if (cadena1.equals (cadena2)) {
            System.out.print("ambas cadenas son iguales");
            
        } else {
            System.out.print("no son iguales");
         }
        
    }
}