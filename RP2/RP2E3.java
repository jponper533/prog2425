package RP2;
public class RP2E3 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena) para simplificar 
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena1 = leer.nextLine();

        // Utilizamos el .toUpperCase para ponerlo todo en mayusculas
         System.out.println("En mayúsculas: " + cadena1.toUpperCase());

        // utilizmaos el .toLowerCase para ponerlo todo en minusculas
        System.out.println("En minúsculas: " + cadena1.toLowerCase());
        




    }
}
