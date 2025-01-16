import java.util.Scanner;

public class CartaMasAlta {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int dineroApuestaPc = 100;
        int dineroApuestaUsu = 100;
        boolean salidaWhile = true;
        int apuesta = 0;

        while (salidaWhile) {
            System.out.println();
            do {
                System.out.println("Cuanto quieres apostar?");
                apuesta = leer.nextInt();
                leer.nextLine();

                if (apuesta > dineroApuestaPc) {
                    System.out.println("Elige una apuesta menor al dinero de la maquina");
                }
            } while (apuesta > dineroApuestaPc);

            System.out.println("Presiona intro para sacar una carta aleatoria");
            leer.nextLine();

            int paloCartaUsu = ((int) Math.floor(Math.random() * 4)) + 1;
            String paloUsu = " ";
            if (paloCartaUsu == 1) {
                paloUsu = " de oros";
            } else if (paloCartaUsu == 2) {
                paloUsu = " de copas";
            } else if (paloCartaUsu == 3) {
                paloUsu = " de espadas";
            } else {
                paloUsu = " de bastos";
            }

            int paloCartaPc = ((int) Math.floor(Math.random() * 4)) + 1;
            String paloPc = " ";

            if (paloCartaPc == 1) {
                paloPc = " de oros";
            } else if (paloCartaPc == 2) {
                paloPc = " de copas";
            } else if (paloCartaPc == 3) {
                paloPc = " de espadas";
            } else {
                paloPc = " de bastos";
            }

            int aleatorioUsu = ((int) Math.floor(Math.random() * 10)) + 1;
            System.out.println("Salio la carta: " + aleatorioUsu + paloUsu);
            System.out.println();
            int ronda = 0;
            ronda++;

            if (ronda >= 1) {
                dineroApuestaPc = dineroApuestaPc - 5;
                dineroApuestaUsu = dineroApuestaUsu - 5;
            }

            System.out.println("RONDA NUMERO " + ronda);
            System.out.println("===============");
            System.out.println("Dinero por partida: 5");
            System.out.println("Dinero Usu: " + dineroApuestaUsu);
            System.out.println("Dinero Pc: " + dineroApuestaPc);
            System.out.println("-----------------");
            System.out.println("Numero Usu: " + aleatorioUsu + paloUsu);
            int aleatorioPc = ((int) Math.floor(Math.random() * 10)) + 1;
            System.out.println("Numero Pc: " + aleatorioPc + paloPc);
            System.out.println();

            if (aleatorioPc > aleatorioUsu) {
                System.out.println("La carta de PC es mayor!");
                System.out.println("Se te restara: " + apuesta + " del dinero total");
                dineroApuestaUsu = dineroApuestaUsu - apuesta;
                dineroApuestaPc = dineroApuestaPc + apuesta;
                System.out.println("Total Usu: " + dineroApuestaUsu);
                System.out.println("Total Pc: " + dineroApuestaPc);

            } else if (aleatorioUsu > aleatorioPc) {
                System.out.println("Tu carta es mayor!");
                System.out.println("Se te sumara: " + apuesta + " al dinero total");
                dineroApuestaPc = dineroApuestaPc - apuesta;
                dineroApuestaUsu = dineroApuestaUsu + apuesta;
                System.out.println("Total Usu: " + dineroApuestaUsu);
                System.out.println("Total Pc: " + dineroApuestaPc);

            } else {
                System.out.println("Las cartas son iguales, no se resta nada");
            }

            if (dineroApuestaPc <= 0) {
                salidaWhile = false;
                System.out.println();
                System.out.println("Has ganado a la maquina!");
            } else if (dineroApuestaUsu <= 0) {
                salidaWhile = false;
                System.out.println();
                System.out.println("Ha ganado la maquina!");
            }

            if (dineroApuestaPc >= dineroApuestaUsu * 2) {
                salidaWhile = false;
                System.out.println();
                System.out.println("Has ganado a la maquina!");
            } else if (dineroApuestaUsu >= dineroApuestaPc * 2) {
                salidaWhile = false;
                System.out.println();
                System.out.println("Ha ganado la maquina!");
            }
        }

    }

}