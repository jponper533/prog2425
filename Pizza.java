
public class Pizza {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //Informacion de la pizza
        final double SMALL_PIZZA = 8;
        final double MEDIUM_PIZZA = 12;
        final double BIG_PIZZA = 15;

        //Informacion de ingrediente extras
        final double INGREDIENTES_PRECIO = 1;

        //Boolean que controla el bucle de pedidos
        boolean seguirPidiendo = true;

        //Bucle de pedidos
        while (seguirPidiendo) {
            
            System.out.println("Hacer un pedido (1)");
            System.out.println("Salir (0)");
            System.out.print("Elija: ");
            int pedido = leer.nextInt();

            //Limpiar buffer
            leer.nextLine();

            System.out.println();

            //Se comprueba si se desea realizar algun pedido
            if (pedido==1) {
                
                System.out.print("¿Quien compra? ");
                String cliente = leer.nextLine();

                System.out.print("Direccion del cliente: ");
                String direccion = leer.nextLine();

                System.out.print("Telefono del cliente: ");
                int telefono = leer.nextInt();

                //Limpiar buffer
                leer.nextLine();

                //Declaramos e inicializamos la informacion del ticket
                String ticket = "";
                double costeTotal = 0;
                int pizzasPedidas = 0;

                //Boolean que controla el bucle del ticket
                boolean seguirTicket = true;

                System.out.println();

                //Bucle de tickets
                do {
                    System.out.println("Pizza pequeña (1)");
                    System.out.println("Pizza mediana (2)");
                    System.out.println("Pizza grande (3)");
                    System.out.println("Finalizar e imprimir el ticket (0)");
                    System.out.print("Elija: ");
                    int pizza = leer.nextInt();

                    //Limpiar buffer
                    leer.nextLine();

                    System.out.println();

                    if (pizza!=0) {

                        //Se agrega un salto de linea si no es la primera bebida que se pide
                        if (pizzasPedidas>0) {
                            ticket+="\n";
                        }

                        //Se declara e inicializa la variable que controla el coste de la bebida (incluyendo los ingredientes)
                        double costePizza = 0;

                        //Se agrega al ticket la bebida elejida
                        switch (pizza) {
                            case 1:
                                costePizza+=SMALL_PIZZA;
                                pizzasPedidas++;
                                ticket+="PIZZA Nº" + pizzasPedidas + ": Pizza pequeña";
                                break;
                            case 2:
                                costePizza+=MEDIUM_PIZZA;
                                pizzasPedidas++;
                                ticket+="PIZZA Nº" + pizzasPedidas + ": Pizza mediana";
                                break;
                            case 3:
                                costePizza+=BIG_PIZZA;
                                pizzasPedidas++;
                                ticket+="PIZZA Nº" + pizzasPedidas + ": Pizza grande";
                                break;
                            //Este caso esta para sustituir una bebida no existente
                            default:
                                costePizza+=0;
                                pizzasPedidas++;
                                ticket+="PIZZA Nº" + pizzasPedidas + ": DESCONOCIDO";
                                break;
                        }

                        //Boolean que controla el bucle ingredientes
                        boolean seguirAgregando = true;

                        //Se agregan los primeros ingredientes que siempre tendra una pizza
                        ticket+="\nINGREDIENTES: Tomate, Queso";

                        //Se declara e inicializa la variable que controla cuantos ingredientes pidio en esta bebida
                        int ingredientesAgregados = 2;

                        while (seguirAgregando) {

                            //Se pregunta por ingredientes a añadir
                            System.out.println("Jamón (1)");
                            System.out.println("Cebolla (2)");
                            System.out.println("Bacon (3)");
                            System.out.println("Atún (4)");
                            System.out.println("Pimiento (5)");
                            System.out.println("Terminar de agregar ingredientes (0)");
                            System.out.print("Elija: ");
                            int ingrediente = leer.nextInt();

                            //Limpiar buffer
                            leer.nextLine();

                            if (ingrediente!=0) {

                                //Se agrega una ","
                                ticket+=", ";

                                //Se agrega el ingrediente al ticket
                                switch (ingrediente) {
                                    case 1:
                                        ticket+="Jamón";
                                        break;
                                    case 2:
                                        ticket+="Cebolla";
                                        break;
                                    case 3:
                                        ticket+="Bacon";
                                        break;
                                    case 4:
                                        ticket+="Atún";
                                        break;
                                    case 5:
                                        ticket+="Pimiento";
                                        break;
                                    //Este caso esta para sustituir un ingrediente no existente
                                    default:
                                        ticket+="DESCONOCIDO";
                                        break;
                                }
                                ingredientesAgregados++;
                            } else {
                                //Termina de pedir ingredientes y agregar un salto de linea
                                seguirAgregando=false;
                                ticket+="\n";
                            }

                            System.out.println();

                        }

                        //Se suma al coste de la bebida el coste de los ingredientes extras sin contar el tomate y el queso
                        costePizza+=(ingredientesAgregados-2)*INGREDIENTES_PRECIO;

                        //Se suma al coste total el coste de la bebida
                        costeTotal+=costePizza;

                        //Se agrega al ticket el coste de la bebida
                        ticket+="PRECIO: " + costePizza + "€";

                        System.out.println();

                    } else {
                    seguirTicket=false;
                    }

                } while (seguirTicket);

                //Se imprime el ticket con todos los datos obtenidos
                System.out.println("TICKET DEL PEDIDO");
                System.out.println("CLIENTE: " + cliente);
                System.out.println("DIRECCION: " + direccion);
                System.out.println("TELEFONO: " + telefono);
                System.out.println(ticket);
                System.out.println("TOTAL: " + costeTotal + "€");

                System.out.println();

            } else {
                seguirPidiendo=false;
            }

        }

        System.out.println("Fin del programa");

    }
}
