package RP5;
public class RP5E10 {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Solicitar la cantidad de alumnos
        System.out.print("ingrese la cantidad de alumnos: ");
        int cantidad = leer.nextInt();

        int cantidadtotal = 4000 / cantidad;

        if (cantidad >= 100) {
            System.out.println("Cada uno debera pagar 65 euros ");
            System.out.println("el total del dinero es: " + 65*cantidad);
        }
           
        else if (cantidad >= 50 && cantidad <= 99) {
            System.out.println("Cada uno debera pagar 70 euros ");
            System.out.println("el total del dinero es: " + 70*cantidad);
        }

        else if (cantidad >= 30 && cantidad <= 49) {
            System.out.println("Cada uno debera pagar 95 euros ");
            System.out.println("el total del dinero es: " + 95*cantidad);
        }

        else {
            System.out.println("Cada uno debera pagar: " + cantidadtotal + " euros");
        }
    }
}
