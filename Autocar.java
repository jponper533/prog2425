public class Autocar {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //Se pregunta por las plazas disponibles al inicio del dia
        System.out.print("¿Cuantas plazas hay disponibles en total? ");
        int plazasDisponiblesTotal = leer.nextInt();

        //Se declaran e inicializan las variables que serviran para el bucle y para mostrar informacion
        int plazasDisponiblesActualmente = plazasDisponiblesTotal;
        boolean cerrar = false;

        //Se declara la variable que almacenara toda la informacion de los clientes
        String clientesInformacion = "";
        int clientes = 0;

        //Mientras haya plazas disponibles o no cierre el autocar
        while (plazasDisponiblesActualmente>0 && !cerrar) {

            //Se imprime las posibles opciones y se muestran cuantas plazas quedan actualmente
            System.out.println("Plazas restantes: " + plazasDisponiblesActualmente);
            System.out.println("Añadir un nuevo cliente (1)");
            System.out.println("Cerrar autocar (0)");
            System.out.print("Opcion: ");
            int decision = leer.nextInt();

            //Se comprueba si quiere agregar un cliente o cerrar el autocar
            if (decision==1) {

                //Se pregunta cuantas plazas quiere el cliente
                System.out.print("¿Cuantas plazas quiere el nuevo cliente? ");
                int plazasSolicitadas = leer.nextInt();

                //Se comprueba si hay suficientes plazas
                if (plazasSolicitadas<=plazasDisponiblesActualmente) {
                    
                    //Se compruebas que no pidio mas de la mitad de plazas totales
                    if ((plazasDisponiblesTotal/2)>plazasSolicitadas) {
                        
                        //Agrega un nuevo cliente
                        clientes++;
                        clientesInformacion += "Cliente" + clientes + " tomo " + plazasSolicitadas + " plazas.\n";

                        //Resta a las plazas disponibles la cantidad solicitada
                        plazasDisponiblesActualmente -= plazasSolicitadas;

                    } else {
                        //El cliente pidio la mitad o mas de plazas totales
                        System.out.println("El cliente esta solicitando demasiadas plazas.");
                    }

                } else {
                    //El cliente pidio mas plazas de las que hay disponibles
                    System.out.println("No hay suficientes plazas para el cliente.");
                }

            } else {
                //Se cierra anticipadamente el autocar
                cerrar=true;
            }
            
            System.out.println();
            
        }

        //Se imprime cuantas plazas sobraron y la informacion de los clientes
        System.out.println("El autocar cerro.");
        System.out.println("Plazas que sobraron: " + plazasDisponiblesActualmente);
        System.out.println(clientesInformacion);

    }
}
