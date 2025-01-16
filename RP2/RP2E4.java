package RP2;
public class RP2E4 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Pedimos que escriban una cadena de caracteres y usamos una variable (cadena) para simplificar 
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena1 = leer.nextLine();

  //hacemos una variable para acortar que hemos dividido la cadena en 2 y hacemos un substring para 
        //que coja desde el caracter 0 de la cadena hasta la mitad como indica la variable
        int mitad = cadena1.length() / 2;
        String mitad1 = cadena1.substring(0, mitad);
        System.out.println("Primera mitad cadena: " + mitad1);

        //hacemos lo mismo q arriba
        String mitad2 = cadena1.substring(mitad);
        System.out.println("Segunda mitad cadena: " + mitad2);


    }

}
