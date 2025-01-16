package RP4;
public class RP4E11 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //recogemos los datos
        System.out.print("introduce el nombre del curso: ");
        leer.nextLine();

        System.out.print("introduce los creditos: ");
        int creditos = leer.nextInt();

        System.out.print("introduce la duracion (en semanas): ");
        int duracion = leer.nextInt();

        //hacemos condicionales con dos condiciones con el simbolo &&
        if (creditos > 10 && duracion > 12) {
            System.out.print("curso avanzado ");
        }

        else if (creditos > 5) {
            System.out.print("curso intermedio ");
        }

        else {
            System.out.print("curso basico ");

            if (duracion >= 6) {
                    System.out.println("y largo ");
                } else {
                    System.out.println("y corto ");
                }
            }
       
        leer.close();
        }
    }