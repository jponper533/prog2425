
public class PizzaC {
    private static java.util.Scanner leer = new java.util.Scanner(System.in);
    public static void main(String[] args) {

        final double SMALL_PIZZA = 8;
        final double MEDIUM_PIZZA = 12;
        final double BIG_PIZZA = 15;

        final double INGREDIENTES_PRECIO = 1;

        boolean seguirPidiendo = true;


        while (seguirPidiendo) {
            
            System.out.println("Hacer un pedido (1)");
            System.out.println("Salir (0)");
            System.out.print("Elija: ");
            int pedido = leer.nextInt();


            leer.nextLine();

            System.out.println();

            if (pedido==1) {
                
                System.out.print("¿Quien compra? ");
                String cliente = leer.nextLine();

                System.out.print("Direccion del cliente: ");
                String direccion = leer.nextLine();

                System.out.print("Telefono del cliente: ");
                int telefono = leer.nextInt();

                leer.nextLine();

                String ticket = "";
                double costeTotal = 0;
                int pizzasPedidas = 0;

                boolean seguirTicket = true;

                System.out.println();

                do {
                    System.out.println("Pizza pequeña (1)");
                    System.out.println("Pizza mediana (2)");
                    System.out.println("Pizza grande (3)");
                    System.out.println("Finalizar e imprimir el ticket (0)");
                    System.out.print("Elija: ");
                    int pizza = leer.nextInt();

                    leer.nextLine();

                    System.out.println();

                    if (pizza!=0) {

                        if (pizzasPedidas>0) {
                            ticket+="\n";
                        }

                        double costePizza = 0;

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
                            default:
                                costePizza+=0;
                                pizzasPedidas++;
                                ticket+="PIZZA Nº" + pizzasPedidas + ": DESCONOCIDO";
                                break;
                        }

                        boolean seguirAgregando = true;

                        ticket+="\nINGREDIENTES: Tomate, Queso";

                        int ingredientesAgregados = 2;

                        while (seguirAgregando) {

                            System.out.println("Jamón (1)");
                            System.out.println("Cebolla (2)");
                            System.out.println("Bacon (3)");
                            System.out.println("Atún (4)");
                            System.out.println("Pimiento (5)");
                            System.out.println("Terminar de agregar ingredientes (0)");
                            System.out.print("Elija: ");
                            int ingrediente = leer.nextInt();

                            leer.nextLine();

                            if (ingrediente!=0) {

                                ticket+=", ";

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
                                    default:
                                        ticket+="DESCONOCIDO";
                                        break;
                                }
                                ingredientesAgregados++;
                            } else {
                                seguirAgregando=false;
                                ticket+="\n";
                            }

                            System.out.println();

                        }

                        costePizza+=(ingredientesAgregados-2)*INGREDIENTES_PRECIO;

                        costeTotal+=costePizza;

                        ticket+="PRECIO: " + costePizza + "€";

                        System.out.println();

                    } else {
                    seguirTicket=false;
                    }

                } while (seguirTicket);

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
