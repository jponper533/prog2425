package RP4;
public class RP4E4 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce el nombre del evento: ");
        leer.nextLine();

        System.out.print("Introduce el numero de asistentes esperados: ");
        int asistentes = leer.nextInt();

        //hacemos las condicionales anidadas con el precio y la duracion
        if (asistentes > 50) {
            System.out.print("Introduce la duracion del evento (horas): ");
            int duracion = leer.nextInt();

            if (duracion > 3) {
                System.out.print("evento grande y largo ");
            } 
            
            else {
                System.out.print("evento grande y corto ");
            }
        }
        else {
            System.out.print("evento pequeño ");
        }
        


        leer.close();
        }
    }