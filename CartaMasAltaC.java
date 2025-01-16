import java.util.Scanner;

public class CartaMasAltaC {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int dineroApuestaPc = 100;
        int dineroApuestaUsu = 100;
        boolean salidaWhile = true;
        int ronda = 0;
        int apuesta = 0;

        while (salidaWhile) {
            int aleatorioPc = ((int) Math.floor(Math.random() * 10)) + 1;
            int aleatorioUsu = ((int) Math.floor(Math.random() * 10)) + 1;

            System.out.println();
            do {
                System.out.println("Cuanto quieres apostar?");
                apuesta = leer.nextInt();
                leer.nextLine();

                if (apuesta > dineroApuestaPc) {
                    System.out.println("Elige una apuesta menor al dinero de la maquina");
                }

                ronda++;
            } while (apuesta > dineroApuestaPc);

            System.out.println("Presiona intro para sacar una carta aleatoria");
            leer.nextLine();

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
            imprimePaloDelUsu(aleatorioUsu);
            imprimePaloDelPc(aleatorioPc);
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

           salidaWhile = saberGanadorPartida(dineroApuestaPc, dineroApuestaUsu, salidaWhile);
            
        }

    }

    public static void imprimePaloDelPc(int aleatorioPc) {
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

        System.out.println("Numero Pc: " + aleatorioPc + paloPc);
    }

    public static void imprimePaloDelUsu(int aleatorioUsu) {
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

        System.out.println("Numero Pc: " + aleatorioUsu + paloUsu);
    }

    private static boolean saberGanadorPartida(int dineroApuestaPc, int dineroApuestaUsu, boolean salidaWhile) {
        if (dineroApuestaPc <= 0 || dineroApuestaUsu >= dineroApuestaPc * 2) {
            System.out.println();
            System.out.println("Has ganado a la maquina!");
            salidaWhile=false;
        } else if (dineroApuestaUsu <= 0 || dineroApuestaPc >= dineroApuestaUsu * 2) {
            System.out.println();
            System.out.println("Ha ganado la maquina!");
            salidaWhile=false;
        }

        return salidaWhile;

    }
}