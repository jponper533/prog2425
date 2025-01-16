package RP2;
public class RP2E2 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

       // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena) para simplificar 
       System.out.print("Introduce una cadena de caracteres: ");
       String cadena1 = leer.nextLine();

       // usamos el .length para q sea capaz de contar los numeros de caracteres que hay en la cadena
       System.out.println("Tamaño cadena: " + cadena1.length());



    }

}