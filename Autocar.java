public class Autocar {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("¿Cuantas plazas hay disponibles en total? ");
        int plazasDisponiblesTotal = leer.nextInt();

        int plazasDisponiblesActualmente = plazasDisponiblesTotal;
        boolean cerrar = false;

        String clientesInformacion = "";
        int clientes = 0;

        while (plazasDisponiblesActualmente > 0 && !cerrar) {

            System.out.println("Plazas restantes: " + plazasDisponiblesActualmente);
            System.out.println("Añadir un nuevo cliente (1)");
            System.out.println("Cerrar autocar (0)");
            System.out.print("Opcion: ");
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
        System.out.println("El autocar cerro.");
        System.out.println("Plazas que sobraron: " + plazasDisponiblesActualmente);
        System.out.println(clientesInformacion);

    }
}
