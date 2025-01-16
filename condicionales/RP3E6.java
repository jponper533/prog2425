public class RP3E6 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

    System.out.println("Ingresa una cadena de texto: ");
    String cadena1 = leer.nextLine();

        if (cadena1.contains("@") && cadena1.contains("#")) {
            System.out.println("Tiene el @ y el #");
        }
        else if (cadena1.contains("#")) {
        System.out.println("Tiene #");
        }
        else if (cadena1.contains("@")) {
            System.out.println("Tiene el @");
        }
        else { System.out.println("no tiene ninguno");
        }
    }
 }