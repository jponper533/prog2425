package RP4;
public class RP4E3 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce el nombre del proyecto: ");
        leer.nextLine();

        System.out.print("Introduce la puntuacion del proyecto del 1 al 10: ");
        int puntuacion = leer.nextInt();

        //anidamos las condicionales que nos pide el ejercicio, 
        if (puntuacion > 7) {
            System.out.print("el proyecto tiene financiacion? (1 es si y 0 es no) ");
            int respuesta = leer.nextInt();
        
            if (respuesta == 1) {
                System.out.print("proyecto aprobado");
            } 
            
            else {
                System.out.print("proyecto pendiente de financiacion");
            }

        } else {
            System.out.print("proyecto rechazada");
        }
    


        leer.close();
     }   
    }