package ejerciciosProfe;
import java.util.Scanner;

public class PartidoBaloncestoVersion2 {

    // Un partido de baloncesto hay unas 150 posesiones de media
    final static int TOTAL_POSESIONES_PARTIDO = 150;

    // Información de los equipos
    final static int EQUIPO1_ACIERTO_2 = 55;
    final static int EQUIPO2_ACIERTO_2 = 50;

    final static int EQUIPO1_ACIERTO_3 = 45;
    final static int EQUIPO2_ACIERTO_3 = 35;

    final static int EQUIPO1_LANZA_2 = 85;
    final static int EQUIPO2_LANZA_2 = 80;

    final static int EQUIPO1_REBOTE_DEFENSIVO = 80;
    final static int EQUIPO2_REBOTE_DEFENSIVO = 75;

    final static int EQUIPO1_ROBO = 15;
    final static int EQUIPO2_ROBO = 40;

    final static int EQUIPO1_SALTO = 70;

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
            
            if(!esRobado(equipo1, equipo2, turno)){
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
            } else {
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


    /**
     * Indica qué equipo ha ganado el salto inicial.
     * @param equipo1 Nombre del equipo 1.
     * @param equipo2 Nombre del equipo 2.
     * @return Nombre del equipo que ha ganado el salto.
     */
    private static String salto(String equipo1, String equipo2) {
        int aleatorio = ((int)Math.floor(Math.random() * 100)) + 1;
        String inicio = " ";

        if (EQUIPO1_SALTO >= aleatorio) {
            inicio = equipo1;
        } else {
            inicio = equipo2;
        }

        return inicio;
    
    }

    /**
     * Devuelve los puntos anotados en un ataque.
     * @param equipo1 Nombre del equipo 1.
     * @param equipo2 Nombre del equipo 2.
     * @param turno Nombre del equipo que tiene la posesión de ataque.
     * @return 0, 2 o 3 puntos.
     */
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

    /**
     * Devuelve el equipo que se hace con el rebote tras un lanzamiento a canasta.
     * @param equipo1 Nombre del equipo 1.
     * @param equipo2 Nombre del equipo 2.
     * @param turno Nombre del equipo que tiene la posesión de ataque.
     * @return Nombre del equipo que se ha hecho con el rebote.
     */
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

    /**
     * Calcula el total de puntos tras una canasta.
     * @param puntos Puntos antes de la canasta.
     * @param valorCanasta Puntos que vale la canasta.
     * @return El total de puntos actualizado.
     */
    private static int actualizaMarcador(int puntos, int valorCanasta) {
        int marcador = 0;

        marcador = puntos+valorCanasta;

        return marcador;
    }

    /**
     * Construye el marcador actual del partido.
     * @param equipo1 Nombre del equipo 1.
     * @param puntosEquipo1 Puntos del equipo 1.
     * @param equipo2 Nombre del equipo 2.
     * @param puntosEquipo2 Puntos del equipo 2.
     * @return Texto con el marcador actual del partido.
     */
    private static String marcadorActual(String equipo1, int puntosEquipo1, String equipo2, int puntosEquipo2) {
        String marcadorReal = " ";

        String mequipo1 = equipo1 + " - " + puntosEquipo1 + "\n";
        String mequipo2 = equipo2 + " - " + puntosEquipo2 + "\n";
        marcadorReal = mequipo1 + mequipo2;

        return marcadorReal;
    }

    /**
     * Cambia la posesión de equipo.
     * @param equipo1 Nombre del equipo 1.
     * @param equipo2 Nombre del equipo 2.
     * @param equipoActual Nombre del equipo que tenía la posesión.
     * @return Nombre del equipo que tiene la nueva posesión.
     */
    private static String siguienteTurno(String equipo1, String equipo2, String equipoActual) {
        String turnoFinal = " ";
        if (equipoActual.equals(equipo1)) {
            turnoFinal = "Es turno de " + equipo1; 
        } else {
            turnoFinal = "Es turno de " + equipo2;
        }

        return turnoFinal;
    }

    /**
     * Indica si se ha robado el balón.
     * @param equipo1 Nombre del equipo 1.
     * @param equipo2 Nombre del equipo 2.
     * @param turno Nombre del equipo que tiene la posesión de ataque.
     * @return Verdadero si se ha robado el balón. Falso en caso contrario.
     */
    private static Boolean esRobado(String equipo1, String equipo2, String turno) {
        int aleatorio = (int)Math.floor(Math.random() * 100);
        boolean robo = false;
    if (turno == equipo1) {
        if (EQUIPO1_ROBO >= aleatorio) {
            robo = true;
        }
    } else {
        if (EQUIPO2_ROBO >= aleatorio) {
            robo = true;
        }
    }
        return robo;
    }
}