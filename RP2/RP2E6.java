package RP2;
public class RP2E6 {

    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena) para simplificar 
        System.out.print("Introduce una cadena de texto: ");
        String cadena1 = leer.nextLine();

        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena) para simplificar 
        System.out.print("Introduce un numero: ");
        int numero = leer.nextInt();

               // Validar que el número no sea mayor que la longitud de la cadena
               if (numero > cadena1.length()) {
                System.out.println("El número es mayor que la longitud de la cadena.");
            } else {
                // Obtener el prefijo (primeros 'numero' caracteres)
                String prefijo = cadena1.substring(0, numero);
                // Obtener el sufijo (últimos 'numero' caracteres)
                String sufijo = cadena1.substring(cadena1.length() - numero);
    
                // Mostrar el resultado
                System.out.println("Prefijo: " + prefijo);
                System.out.println("Sufijo: " + sufijo);
            }
    
            // Cerrar el escáner
            leer.close();

    }
}