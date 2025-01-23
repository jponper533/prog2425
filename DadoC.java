import java.util.Scanner;

public class DadoC {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int puntuacion = 0;


        buclePuntuacionDado(puntuacion);
    }

    private static void buclePuntuacionDado(int puntuacion) {
   
        for (int i = 1; i <= 6; i++) {

            int numeroAleatorio = ((int) Math.floor(Math.random() * 6)) + 1;
            System.out.println("El valor del dado es: " + numeroAleatorio);

            puntuacion = puntuacion + numeroAleatorio;
            System.out.println("Tu puntuacion es: " + puntuacion);
            System.out.println("Presiona enter para el siguiente numero");
            leer.nextLine();
        }
        resultadoDeLosNumeros(puntuacion);
    }

    private static void resultadoDeLosNumeros(int puntuacion) {
    
        if (puntuacion <= 16) {
            System.out.println("puntuacion baja");
        } else if (puntuacion <= 26) {
            System.out.println("puntuacion media");
        } else {
            System.out.println("puntuacion alta");
        }
    }
}