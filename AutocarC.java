public class AutocarC {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("¿Cuantas plazas hay disponibles en total? ");
        int plazasDisponiblesTotal = leer.nextInt();

        int plazasDisponiblesActualmente = plazasDisponiblesTotal;
        boolean cerrar = false;

        String clientesInformacion = "";
        int clientes = 0;

        codigoPrincipal(plazasDisponiblesActualmente, cerrar, clientes, plazasDisponiblesTotal, clientesInformacion);
    }

    private static void codigoPrincipal(int plazasDisponiblesActualmente, boolean cerrar, int clientes,
            int plazasDisponiblesTotal, String clientesInformacion) {
        while (plazasDisponiblesActualmente > 0 && !cerrar) {

            menu(plazasDisponiblesActualmente);

            int decision = leer.nextInt();

            if (decision == 1) {

                System.out.print("¿Cuantas plazas quiere el nuevo cliente? ");
                int plazasSolicitadas = leer.nextInt();

                if (plazasSolicitadas <= plazasDisponiblesActualmente) {

                    if ((plazasDisponiblesTotal / 2) > plazasSolicitadas) {

                        clientes++;
                        clientesInformacion += "Cliente" + clientes + " tomo " + plazasSolicitadas + " plazas.\n";

                        plazasDisponiblesActualmente -= plazasSolicitadas;

                    } else {
                        System.out.println("El cliente esta solicitando demasiadas plazas.");
                    }

                } else {
                    System.out.println("No hay suficientes plazas para el cliente.");
                }

            } else {
                cerrar = true;
            }

            System.out.println();

        }

        menuCierre(plazasDisponiblesActualmente, clientesInformacion);
    }

    private static void menu(int plazasDisponiblesActualmente) {
        System.out.println("Plazas restantes: " + plazasDisponiblesActualmente);
        System.out.println("Añadir un nuevo cliente (1)");
        System.out.println("Cerrar autocar (0)");
        System.out.print("Opcion: ");
    }

    private static void menuCierre(int plazasDisponiblesActualmente, String clientesInformacion) {
        System.out.println("El autocar cerro.");
        System.out.println("Plazas que sobraron: " + plazasDisponiblesActualmente);
        System.out.println(clientesInformacion);
    }
}
