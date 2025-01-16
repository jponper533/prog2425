package sustituto;
public class RP3E4 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

//ingresar las dos cadenas de texto y meterlas en una variable
    System.out.print("Ingresa una cadena de texto: ");
    String cadena1 = leer.nextLine();

    System.out.print("Ingresa una cadena de texto: ");
    String cadena2 = leer.nextLine();
    
//hacer una condicional para que indique que cadena de caracteres
//es la mas grande
        if (cadena1.length() > cadena2.length()) {
            System.out.println("la primera cadena es mas larga que la segunda cadena"); 
            }

       else if (cadena2.length() > cadena1.length()) {
        System.out.println("la segunda cadena es mas larga que la primera cadena");
       }

       else {
        System.out.println("Son igualmente largos");
       }

       leer.close();


        }
    }