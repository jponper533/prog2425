package RP4;
public class RP4E6 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce el nombre del proyecto: ");
        leer.nextLine();

        System.out.print("Introduce la puntuacion del 1 al 10: ");
        double puntuacion = leer.nextDouble();

        // dependiendo de la puntuacion nos dira una frase u otra
        if (puntuacion > 8) {
            System.out.print("proyecto excelente");
        }

        else if (puntuacion > 5) {
            System.out.print("proyecto bueno");
        }

        else if (puntuacion > 3) {
            System.out.print("proyecto regular");
        }
    
        else {
            System.out.print("proyecto rechazado");
        }


        leer.close();
        }
    }