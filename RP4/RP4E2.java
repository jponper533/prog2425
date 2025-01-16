package RP4;
public class RP4E2 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce el nombre del producto: ");
        leer.nextLine();

        System.out.print("Introduce el precio del producto: ");
        double precio = leer.nextDouble();

        System.out.print("Introduce la cantidad del producto: ");
        int cantidad = leer.nextInt();

        //hacemos las condicionales anidadas que nos pide el ejercicio
        if (precio <= 100.0) {
            System.out.print("producto economico");
        } 
        
        else {
            
            if (cantidad < 10) {
                System.out.print("producto caro y poco stock");
            } 
            
            else {
                System.out.print("producto caro y bien en stock");
                   }
                }


                leer.close();
         }
    }