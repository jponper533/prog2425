package ejerciciosProfe;
import java.util.Scanner;

public class PartidoBaloncesto {

    // Un partido de baloncesto hay unas 150 posesiones de media
    final static int TOTAL_POSESIONES_PARTIDO = 10;

    // Información de los equipos
    final static int EQUIPO1_ACIERTO_2 = 55;
    final static int EQUIPO2_ACIERTO_2 = 50;

    final static int EQUIPO1_ACIERTO_3 = 45;
    final static int EQUIPO2_ACIERTO_3 = 35;

    final static int EQUIPO1_LANZA_2 = 85;
    final static int EQUIPO2_LANZA_2 = 80;

    final static int EQUIPO1_REBOTE_DEFENSIVO = 80;
    final static int EQUIPO2_REBOTE_DEFENSIVO = 75;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del equipo 1 ... ");
        String equipo1 = sc.nextLine();

        System.out.print("Nombre del equipo 2 ... ");
        String equipo2 = sc.nextLine();

        int puntosEquipo1 = 0;
        int puntosEquipo2 = 0;

        System.out.println("INICIO del partido");
        System.out.println(marcadorActual(equipo1, puntosEquipo1, equipo2, puntosEquipo2));

        String turno = salto(equipo1, equipo2);

        int numeroPosesion = 1;
        boolean partidoEnJuego = true;
        while (partidoEnJuego) {

            System.out.println("Ataca el equipo " + turno);

            sc.nextLine();

            int valorCanasta = ataque(equipo1, equipo2, turno);

            if (valorCanasta == 0) {
                turno = rebote(equipo1, equipo2, turno);
                System.out.println("Rebote para el equipo " + turno);
            } else {
                if (turno.equals(equipo1)) {
                    puntosEquipo1 = actualizaMarcador(puntosEquipo1, valorCanasta);
                } else {
                    puntosEquipo2 = actualizaMarcador(puntosEquipo2, valorCanasta);
                }
                System.out.println("Canasta de " + turno + " de " + valorCanasta + " puntos");
                System.out.println(marcadorActual(equipo1, puntosEquipo1, equipo2, puntosEquipo2));
                turno = siguienteTurno(equipo1, equipo2, turno);

            }

            if (numeroPosesion == TOTAL_POSESIONES_PARTIDO) {
                partidoEnJuego = false;
            } else {
                numeroPosesion++;
            }

        }

        System.out.println("FIN del partido");
        System.out.println(marcadorActual(equipo1, puntosEquipo1, equipo2, puntosEquipo2));

        sc.close();
    }

    private static String salto(String equipo1, String equipo2) {
        //salto inicial, hacer 50/50

        int aleatorio = ((int)Math.floor(Math.random() * 2)) + 0;
        String inicio = " ";

        if (aleatorio == 1) {
            inicio = equipo1;
        } else {
            inicio = equipo2;
        }

        return inicio;
    }

    private static int ataque(String equipo1, String equipo2, String turno) {
        int numeroAtaque = 0;

        if (turno.equals(equipo1)) {
        if (EQUIPO1_LANZA_2 >= ((int)Math.floor(Math.random() * 100)) + 1) {
            if (EQUIPO1_ACIERTO_2 >= ((int)Math.floor(Math.random() * 100)) + 1) {
                numeroAtaque = 2;
            }
        } else {
            if (EQUIPO1_ACIERTO_3 >= ((int)Math.floor(Math.random() * 100)) + 1) {
                numeroAtaque = 3;
            }
        }

    } else {
        if (EQUIPO2_LANZA_2 >= ((int)Math.floor(Math.random() * 100)) + 1) {
            if (EQUIPO2_ACIERTO_2 >= ((int)Math.floor(Math.random() * 100)) + 1) {
                numeroAtaque = 2;
            }
        } else {
            if (EQUIPO2_ACIERTO_3 >= ((int)Math.floor(Math.random() * 100)) + 1) {
                numeroAtaque = 3;
            }
        }
    }

        return numeroAtaque;
    }

    private static String rebote(String equipo1, String equipo2, String turno) {

        String resultadoRebote = "";

        if (turno.equals(equipo1)) {
            if (EQUIPO2_REBOTE_DEFENSIVO >= ((int)Math.floor(Math.random() * 100)) + 1) {
                resultadoRebote = equipo2;
            } else {
                resultadoRebote = equipo1;
            }
        } else {
            if (EQUIPO1_REBOTE_DEFENSIVO >= ((int)Math.floor(Math.random() * 100)) + 1) {
                resultadoRebote = equipo1;
            } else {
                resultadoRebote = equipo2;
            }
        }

        return resultadoRebote;
    }

    private static int actualizaMarcador(int puntos, int valorCanasta) {

        int marcador = 0;

        marcador = puntos+valorCanasta;

        return marcador;
    }

    private static String marcadorActual(String equipo1, int puntosEquipo1, String equipo2, int puntosEquipo2) {
        String marcadorReal = " ";

        String mequipo1 = equipo1 + " - " + puntosEquipo1 + "\n";
        String mequipo2 = equipo2 + " - " + puntosEquipo2 + "\n";
        marcadorReal = mequipo1 + mequipo2;

        return marcadorReal;
    }

    private static String siguienteTurno(String equipo1, String equipo2, String equipoActual) {
        String turnoFinal = " ";
        if (equipoActual.equals(equipo1)) {
            turnoFinal = "Es turno de " + equipo1; 
        } else {
            turnoFinal = "Es turno de " + equipo2;
        }

        return turnoFinal;
    }
}