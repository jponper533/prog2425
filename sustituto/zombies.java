package sustituto;

import java.util.Random;
import java.util.Scanner;

public class zombies {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        int zombies = random.nextInt(6) + 5;
        int vidas = 4;
        double ganar = 0.90;
        int cuchilladas = 0;
        int mordeduras = 0;
        int rondas = 0;
        boolean pistola = true;
        int mordedurasSumaDeVerdad = 0;
        boolean victoria = true;
        int combates = 0;

        // mensaje de inicio
        System.out.println("Rick contra " + zombies + " zombies.");
        System.out.println("Rick tiene " + vidas + " vidas");
        System.out.println("Pulse para continuar...");
        leer.nextLine();

        while (zombies != 0) {

            combates++;
            mordeduras = 0;

            if (cuchilladas == 3) {
                cuchilladas = 0;
            }

            victoria = true;
            while (victoria) {

                rondas++;
                System.out.println();
                System.out.println("===============================");
                System.out.println("COMBATE Nº " + combates);
                System.out.println("===============================");
                System.out.println("Ronda Nº " + rondas);

                if (random.nextDouble() < ganar) {
                    cuchilladas++;

                    System.out.println("Rick acuchilla al zombie");
                    System.out.println("Rick tiene " + vidas + " vidas");
                    leer.nextLine();

                } else {
                    mordeduras++;
                    mordedurasSumaDeVerdad++;
                    System.out.println("El zombie ataco a rick");
                    System.out.println("Rick tiene " + vidas + " vidas");
                    leer.nextLine();
                }

                if (mordeduras == 3) {
                    System.out.println("Perdiste una vida y el combate");
                    vidas--;
                    victoria = false;
                }

                if (mordedurasSumaDeVerdad == 5) {
                    mordedurasSumaDeVerdad = 0;
                    vidas--;
                    System.out.println("Pierdes vida por sangrado (5 mordidas)");
                    System.out.println();
                }

                if (cuchilladas == 3) {
                    zombies--;
                    victoria = false;
                }

                if (victoria == false) {
                    rondas = 0;
                }

                // Sirve para bajar lo del cansancio. mirado en google para ver como se hacia
                // http://profesores.fi-b.unam.mx/carlos/java/java_basico2_5.html.
                ganar -= 0.05;

                if (zombies == 0 && vidas > 0) {
                    System.out.println("Rick a matado a todos los zombies");
                    System.exit(0);
                }

                if (vidas <= 0) {
                    System.out.println("Te quedaste sin vidas");
                    System.out.println("Rick ha muerto");
                    System.exit(0);
                }

                if (mordeduras == 2 && pistola == true) {
                    System.out.println("Quieres usar la pistola para matar al zombie? (S) (N)");
                    String pistolaEleccion = leer.nextLine();
                    System.out.println();
                    if (pistolaEleccion.equalsIgnoreCase("S")) {
                        cuchilladas = 0;
                        mordeduras = 0;
                        pistola = false;
                        zombies--;
                        rondas = 0;
                        combates++;
                    }
                }
            }
        }
    }

}
