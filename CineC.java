public class CineC {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("¿Cuantas asientos hay disponibles en total? ");
        int asientosDisponiblesTotal = leer.nextInt();
        leer.nextLine();

        int asientosDisponiblesActualmente = asientosDisponiblesTotal;
        boolean cerrar = false;

        String clientesInformacion = "";
        int tickets = 0;

        bloquePrincipal(asientosDisponiblesActualmente, asientosDisponiblesTotal, cerrar, tickets, clientesInformacion);

    }

    private static void bloquePrincipal(int asientosDisponiblesActualmente, int asientosDisponiblesTotal, boolean cerrar, int tickets, String clientesInformacion) {
        while (asientosDisponiblesActualmente>0 && !cerrar) {
            primerMenu(asientosDisponiblesActualmente);
            int decision = leer.nextInt();
            leer.nextLine();

            if (decision==1) {

                System.out.print("Nombre del cliente: ");
                String nombre = leer.nextLine();

                System.out.print("¿Cuantas asientos quiere el nuevo cliente? ");
                int asientosSolicitados = leer.nextInt();
                leer.nextLine();

                if (asientosSolicitados<=asientosDisponiblesActualmente) {
                    
                    if ((asientosDisponiblesTotal/2)>asientosSolicitados) {
                        
                        tickets++;
                        clientesInformacion += "TICKET" + tickets + ": " + nombre + " tomo " + asientosSolicitados + " asientos.\n";

                        asientosDisponiblesActualmente -= asientosSolicitados;

                    } else {
                        System.out.println("El cliente esta solicitando demasiados asientos.");
                    }

                } else {
                    System.out.println("No hay suficientes asientos para el cliente.");
                }

            } else {
                cerrar=true;
            }
            
            System.out.println();

        }

        segundoMenu(asientosDisponiblesActualmente, tickets, clientesInformacion);
    }

    private static void primerMenu(int asientosDisponiblesActualmente) {
        System.out.println("Asientos restantes: " + asientosDisponiblesActualmente);
            System.out.println("Añadir un nuevo cliente (1)");
            System.out.println("Cerrar cine (0)");
            System.out.print("Opcion: ");
    }

    private static void segundoMenu(int asientosDisponiblesActualmente, int tickets, String clientesInformacion) {
        System.out.println("El cine cerro.");
        System.out.println("Plazas que sobraron: " + asientosDisponiblesActualmente);
        System.out.println("Reservas realizadas: " + tickets);
        System.out.println(clientesInformacion);
    }
}