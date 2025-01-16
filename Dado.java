import java.util.Scanner;

public class Dado {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int puntuacion = 0;

        for (int i = 1; i <= 6; i++) {
            
            int aleatorio = ((int) Math.floor(Math.random() * 6)) + 1;
            System.out.println("El valor del dado es: "+aleatorio);

            
            puntuacion = puntuacion + aleatorio;
            System.out.println("Tu puntuacion es: " + puntuacion);
            System.out.println("Presiona enter para el siguiente numero");
            leer.nextLine();

            if (puntuacion <= 16) {
                System.out.println("puntuacion baja");
            } else if (puntuacion <= 26 ) {
                System.out.println("puntuacion media");
            } else {
                System.out.println("puntuacion alta");
            }
        }

    }
}