package RP4;
public class RP4E8 {
    
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //pedimos los dos datos
        System.out.print("Introduce tu nombre: ");
        leer.nextLine();

        System.out.print("Introduce tu puntuacion en la tienda: ");
        int puntos = leer.nextInt();

        //dependiendo de la cantidad de puntos que tenga le saldra el tipo de cliente que es
        //si tiene mas de 100 puntos ademas sera platinum y le saldra el del viaje gratis
        if (puntos >= 1000) {
            System.out.print("cliente platinum ");

            if (puntos >= 500) {
                System.out.print("¡Has ganado un viaje gratis!");

            }
        }

        else if (puntos >= 500) {
            System.out.print("cliente oro");
        }

        else if (puntos >= 100) {
            System.out.print("cliente plata");
        }

        else {
            System.out.print("cliente regular");
        }
       


        leer.close();
        }
    }