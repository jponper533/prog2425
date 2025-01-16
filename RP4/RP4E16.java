package RP4;
public class RP4E16 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Solicitar el nombre del servicio
        System.out.print("ingrese el nombre del servicio: ");
        leer.nextLine();

        // Solicitar la duración 
        System.out.print("ingrese la duración del servicio (en meses): ");
        int duracion = leer.nextInt();

        // solicitar el coste mensual
        System.out.print("ingrese el coste mensual: ");
        double coste = leer.nextDouble();

        // solicitar la satisfacción del cliente
        System.out.print("ingrese la satisfacción del cliente (1-10): ");
        double satisfaccion = leer.nextDouble();

        // poner las categorías del servicio
        if (duracion > 12) {
            if (coste > 1000) {
                if (satisfaccion >= 8) {
                    System.out.println("servicio premium a largo plazo");
                } 
                
                else if (satisfaccion >= 5 && satisfaccion < 8) {
                    System.out.println("servicio aceptable a largo plazo");
                }
            }
            
            else {
                System.out.println("servicio económico a largo plazo");
            }
        } 
        
        else {
            if (coste > 500) {
                System.out.println("servicio corto y costoso");
            } 
            
            else {
                if (satisfaccion >= 7) {
                    System.out.println("servicio corto y satisfactorio");
                } 
                
                else {
                    System.out.println("servicio corto y requiere Mejora");
                }
            }
        }

        leer.close();
    }
}

