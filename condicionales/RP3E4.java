public class RP3E4 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

    System.out.println("Ingresa una cadena de texto: ");
    String cadena1 = leer.nextLine();

    System.out.println("Ingresa una cadena de texto: ");
    String cadena2 = leer.nextLine();

        if (cadena1.length() > cadena2.length()) {
            System.out.println("la primera cadena es mas larga que la cadena2");
            
            }

       else if (cadena2.length() > cadena1.length()) {
        System.out.println("la segunda cadena es mas larga que la cadena1");
       }

       else {
        System.out.println("Son igualmente largos");

       }


        }
    }