package sustituto;
class RP3E1 {
  
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //le pedimos las cadenas de caracteres
        System.out.print("ingresa la primera cadena: ");
        String cadena1 = leer.nextLine();

        System.out.print("ingresa la segunda cadena: ");
        String cadena2 = leer.nextLine();

        //hacemos la condicional para que nos muestra si las cadenas son iguale o no
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales");

        } 
        
        else {
            System.out.println("Las cadenas son distintas");
            System.out.println("cadena uno: " + cadena1);
            System.out.println("cadena dos: " + cadena2);
        }

        leer.close();

    }
}