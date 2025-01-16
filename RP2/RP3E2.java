package RP2;
public class RP3E2 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Introduce una cadena de caracteres: ");
        String cadena1 = leer.nextLine();

        System.out.print("Introduce una palabra: ");
        String palabra = leer.nextLine();

        if (cadena1.startsWith(palabra)) {
            System.out.print("Es cierto");
        }
        else {System.out.print("No es verdad");}

        leer.close();
    }
}
