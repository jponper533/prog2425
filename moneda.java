
import java.util.Random;
import java.util.Scanner;

public class moneda {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();
        double probabilidadGanar = 50;
        int numeroDeCaras = 0;
        String resultado = " ";
        int cara = 0;
        int cruz = 0;

        System.out.println("Elige que cara de la moneda quieres");
        System.out.println("1. cara (O)");
        System.out.println("2. cruz (X)");
        leer.nextInt();
        leer.nextLine();

        System.out.println("Elige un numero entre 1 y 10 que crees que saldra la cara que elegiste");
        numeroDeCaras = leer.nextInt();
        leer.nextLine();

        System.out.println();
        System.out.println("Pulsa enter para empezar");
        leer.nextLine();

        for (int i = 0; i < 10; i++) {

            if (random.nextInt() > probabilidadGanar) {
                System.out.println("Ha salido cara");
                System.out.println();
                resultado = resultado + "O ";
                System.out.println(resultado);
                System.out.println("presiona enter para continuar");
                leer.nextLine();

                cara++;
            } else {
                System.out.println("Ha salido cruz");
                resultado = resultado + "X ";
                System.out.println(resultado);
                System.out.println("presiona enter para continuar");
                leer.nextLine();
                cruz++;
            }
        }

        if (cara == numeroDeCaras || cruz == numeroDeCaras) {
            System.out.println("Has acertado en la prediccion!");
        } else {
            System.out.println("Has fallado en tu prediccion");
        }

        leer.close();
    }
}
