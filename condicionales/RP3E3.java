public class RP3E3 {
    
        private static java.util.Scanner leer = new java.util.Scanner(System.in);
        public static void main(String[] args) {

        System.out.println("Ingresa una cadena de tecto: ");
        String cadena1 = leer.nextLine();

        System.out.println("Ingresa una palabra: ");
        String palabra = leer.nextLine();

        if (cadena1.endsWith(palabra)) {
            System.out.println("Es cierto");
            }
           
            else { System.out.println("no es verdad"); 
            }
        }
}
