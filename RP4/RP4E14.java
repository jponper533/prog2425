package RP4;
public class RP4E14 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //recogemos los datos
        System.out.print("introduce el nombre del curso: ");
        leer.nextLine();

        System.out.print("introduce la duracion del curso: ");
        int duracion = leer.nextInt();

        System.out.print("introduce el costo del curso: ");
        int costo = leer.nextInt();

        System.out.print("introduce la calificacion: ");
        float calificacion = leer.nextFloat(); 

        if (duracion > 20 && costo > 500) {
            
            if (calificacion >= 8) {
                System.out.print("curso de alta calidad ");
            }

            else if (calificacion >= 5 && calificacion < 7.9) {
                System.out.print("curso aceptable ");
            }
        }

        else if (duracion <= 20) {
            
            if (costo > 300) {
                System.out.print("Curso corto y costoso ");
            }

            else{
                System.out.print("curso corto y economico ");
            }
        }




        leer.close();
        }
    }