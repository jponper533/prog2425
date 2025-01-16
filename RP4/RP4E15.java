package RP4;
public class RP4E15 {
 
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        // Solicitar el nombre del producto
        System.out.print("ingrese el nombre del producto: ");
        leer.nextLine();

        // Solicitar la cantidad vendida
        System.out.print("ingrese la cantidad vendida: ");
        int cantidad = leer.nextInt();

        // Solicitar el precio por unidad
        System.out.print("ingrese el precio por unidad: ");
        double precio = leer.nextDouble();

        // Solicitar el tipo de producto
        System.out.print("ingrese el tipo de producto (electronico, ropa, alimento): ");
        leer.nextLine();  
        String tipo = leer.nextLine();

        // Calcular el ingreso total
        double ingresoTotal = cantidad * precio;

        // Clasificar el producto según el ingreso total y mas criterios
        if (ingresoTotal > 5000) {

            if (tipo.equals("electronico")) {
                System.out.println("producto premium");
            } 
            
            else if ((tipo.equals("ropa") || tipo.equals("alimento")) && cantidad > 100) {
                System.out.println("producto de alta demanda");
            }
        } 
        
        else if (ingresoTotal >= 2000 && ingresoTotal <= 5000) {
            System.out.println("producto en buen rendimiento");
        } 
        
        else {
            
            if (cantidad < 50) {
                System.out.println("producto de bajo rendimiento");
            } 
            
            else if (cantidad >= 50 && cantidad <= 100) {
                System.out.println("producto en promoción");
            }
        }

        
        leer.close();
    }
}