public class EstarbacC {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        //Informacion del cafe
        final double CAFE_SMALL = 2;
        final double CAFE_MEDIUM = 2.5;
        final double CAFE_BIG = 3;

        //Informacion del te
        final double TE_SMALL = 1.5;
        final double TE_MEDIUM = 1.75;
        final double TE_BIG = 2;

        //Informacion del chocolate
        final double CHOCOLATE_SMALL = 3;
        final double CHOCOLATE_MEDIUM = 3.5;
        final double CHOCOLATE_BIG = 4;

        //Informacion de ingrediente extras
        final int INGREDIENTES_LIMITE = 3;
        final double INGREDIENTES_PRECIO = 0.5;

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

                System.out.print("Telefono del cliente: ");
                int telefono = leer.nextInt();

                //Limpiar buffer
                leer.nextLine();

                //Declaramos e inicializamos la informacion del ticket
                String ticket = "";
                double costeTotal = 0;
                int bebidasPedidas = 0;

                //Boolean que controla el bucle del ticket
                boolean seguirTicket = true;

                System.out.println();

                //Bucle de tickets
                do {
                    System.out.println("Cafe pequeño (1)");
                    System.out.println("Cafe mediano (2)");
                    System.out.println("Cafe grande (3)");
                    System.out.println("Te pequeño (4)");
                    System.out.println("Te mediano (5)");
                    System.out.println("Te grande (6)");
                    System.out.println("Chocolate pequeño (7)");
                    System.out.println("Chocolate mediano (8)");
                    System.out.println("Chocolate grande (9)");
                    System.out.println("Finalizar e imprimir el ticket (0)");
                    System.out.print("Elija: ");
                    int bebida = leer.nextInt();

                    //Limpiar buffer
                    leer.nextLine();

                    System.out.println();

                    if (bebida!=0) {

                        //Se agrega un salto de linea si no es la primera bebida que se pide
                        if (bebidasPedidas>0) {
                            ticket+="\n";
                        }

                        //Se declara e inicializa la variable que controla el coste de la bebida (incluyendo los ingredientes)
                        double costeBebida = 0;

                        //Se agrega al ticket la bebida elejida
                        switch (bebida) {
                            case 1:
                                costeBebida+=CAFE_SMALL;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Cafe pequeño";
                                break;
                            case 2:
                                costeBebida+=CAFE_MEDIUM;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Cafe mediano";
                                break;
                            case 3:
                                costeBebida+=CAFE_BIG;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Cafe grande";
                                break;
                            case 4:
                                costeBebida+=TE_SMALL;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Te pequeño";
                                break;
                            case 5:
                                costeBebida+=TE_MEDIUM;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Te mediano";
                                break;
                            case 6:
                                costeBebida+=TE_BIG;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Te grande";
                                break;
                            case 7:
                                costeBebida+=CHOCOLATE_SMALL;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Chocolate pequeño";
                                break;
                            case 8:
                                costeBebida+=CHOCOLATE_MEDIUM;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Chocolate mediano";
                                break;
                            case 9:
                                costeBebida+=CHOCOLATE_BIG;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": Chocolate grande";
                                break;
                            //Este caso esta para sustituir una bebida no existente
                            default:
                                costeBebida+=0;
                                bebidasPedidas++;
                                ticket+="BEBIDA Nº" + bebidasPedidas + ": DESCONOCIDO";
                                break;
                        }

                        //Boolean que controla el bucle ingredientes
                        boolean seguirAgregando = true;

                        //Se declara e inicializa la variable que controla cuantos ingredientes pidio en esta bebida
                        int ingredientesAgregados = 0;

                        while (seguirAgregando&&ingredientesAgregados<INGREDIENTES_LIMITE) {

                            //Se pregunta por ingredientes a añadir
                            System.out.println("Leche (1)");
                            System.out.println("Azucar (2)");
                            System.out.println("Canela (3)");
                            System.out.println("Miel (4)");
                            System.out.println("Limon (5)");
                            System.out.println("Terminar de agregar ingredientes (0)");
                            System.out.print("Elija: ");
                            int ingrediente = leer.nextInt();

                            //Limpiar buffer
                            leer.nextLine();

                            if (ingrediente!=0) {

                                //Se agrega una "," si no es el primer ingrediente
                                if (ingredientesAgregados>0) {
                                    ticket+=", ";
                                } else {
                                    ticket+="\nINGREDIENTES: ";
                                }

                                //Se agrega el ingrediente al ticket
                                switch (ingrediente) {
                                    case 1:
                                        ticket+="Leche";
                                        break;
                                    case 2:
                                        ticket+="Azucar";
                                        break;
                                    case 3:
                                        ticket+="Canela";
                                        break;
                                    case 4:
                                        ticket+="Miel";
                                        break;
                                    case 5:
                                        ticket+="Limon";
                                        break;
                                    //Este caso esta para sustituir un ingrediente no existente
                                    default:
                                        ticket+="DESCONOCIDO";
                                        break;
                                }
                                ingredientesAgregados++;
                                //Si se llega al limite de ingredientes se agrega un salto de linea
                                if (ingredientesAgregados>=INGREDIENTES_LIMITE) {
                                    ticket+="\n";
                                }
                            } else {
                                //Termina de pedir ingredientes y agregar un salto de linea
                                seguirAgregando=false;
                                ticket+="\n";
                            }

                            System.out.println();

                        }

                        //Se suma al coste de la bebida el coste de los ingredientes extras
                        costeBebida+=ingredientesAgregados*INGREDIENTES_PRECIO;

                        //Se suma al coste total el coste de la bebida
                        costeTotal+=costeBebida;

                        //Se agrega al ticket el coste de la bebida
                        ticket+="PRECIO: " + costeBebida + "€";

                        System.out.println();

                    } else {
                    seguirTicket=false;
                    }

                } while (seguirTicket);

                //Se imprime el ticket con todos los datos obtenidos
                System.out.println("TICKET DEL PEDIDO");
                System.out.println("CLIENTE: " + cliente);
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
