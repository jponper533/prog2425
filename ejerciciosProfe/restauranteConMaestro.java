package ejerciciosProfe;

import java.util.Scanner;

public class restauranteConMaestro {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        final double PLATO1 = 5;
        final double PLATO2 = 4;
        final double PLATO3 = 4.5;
        final double PLATO4 = 6;
        final double PLATO5 = 8;
        final double PLATO6 = 9;
        final double PLATO7 = 5;
        final double PLATO8 = 1.5;
        final double PLATO9 = 1.25;
        final double PLATO10 = 2;
        int opcion = 0;
        double precioTotal = 0;
        int cantidad = 0;
        String primerPlato = " \n";
        String segundoPlato = " \n";

        do {
            System.out.println(" *** RESTAURANTE IES VEGA DE MIJAS ****");
            System.out.println(" ----------------------------------");
            System.out.println("Primeros platos");
            System.out.println(" 1. Salmorejo (5€)");
            System.out.println(" 2. Sopa picadillo (4€)");
            System.out.println(" 3. Ensalada de atún (4.5€)");
            System.out.println("Segundos platos");
            System.out.println(" 4. Paella (6€)");
            System.out.println(" 5. Salmón (8€)");
            System.out.println(" 6. Codillo al horno (9€)");
            System.out.println(" 7. Lentejas (5€)");
            System.out.println("Postres");
            System.out.println(" 8. Fruta (1.5€)");
            System.out.println(" 9. Café (1.25€)");
            System.out.println("10. Helado (2€)");
            System.out.println();
            System.out.println();
            System.out.println("0. SALIR (Imprimir primerPlato + FIN) ");
            System.out.println("Selecciona la opción deseada por el cliente...");
            opcion = leer.nextInt();

            if (opcion >= 1 && opcion <= 10) {
                do {
                    System.out.println("Cantidad...");
                    cantidad = leer.nextInt();
                } while (cantidad <= 0);

                switch (opcion) {
                    case 1:
                        primerPlato = primerPlato + "salmorejo x " + cantidad + "\n";
                        precioTotal = precioTotal + (PLATO1 * cantidad);
                        break;

                    case 2:
                        primerPlato = primerPlato + "sopa picadillo x " + cantidad + "\n";
                        precioTotal = precioTotal + (PLATO2 * cantidad);
                        break;

                    case 3:
                        primerPlato = primerPlato + "ensalada de atun x " + cantidad + "\n";
                        precioTotal = precioTotal + (PLATO3 * cantidad);
                        break;

                    case 4:
                        segundoPlato = segundoPlato + "paella x " + cantidad + "\n";
                        if (cantidad > 2) {
                            precioTotal = precioTotal + ((PLATO4 - 1) * cantidad);
                        } else {
                            precioTotal = precioTotal + (PLATO4 * cantidad);
                        }
                        break;

                    case 5:
                        segundoPlato = segundoPlato + "salmon x " + cantidad + "\n";
                        if (cantidad > 2) {
                            precioTotal = precioTotal + ((PLATO5 - 1) * cantidad);
                        } else {
                            precioTotal = precioTotal + (PLATO5 * cantidad);
                        }
                        break;

                    case 6:
                        segundoPlato = segundoPlato + "codillo al horno x " + cantidad + "\n";
                        if (cantidad > 2) {
                            precioTotal = precioTotal + ((PLATO6 - 1) * cantidad);
                        } else {
                            precioTotal = precioTotal + (PLATO6 * cantidad);
                        }
                        break;

                    case 7:
                        segundoPlato = segundoPlato + "lentejas x " + cantidad + "\n";
                        if (cantidad > 2) {
                            precioTotal = precioTotal + ((PLATO7 - 1) * cantidad);
                        } else {
                            precioTotal = precioTotal + (PLATO7 * cantidad);
                        }
                        break;

                    case 8:
                        primerPlato = primerPlato + "fruta x " + cantidad + "\n";
                        precioTotal = precioTotal + (PLATO8 * cantidad);
                        break;

                    case 9:
                        primerPlato = primerPlato + "cafe x " + cantidad + "\n";
                        precioTotal = precioTotal + (PLATO9 * cantidad);
                        break;

                    case 10:
                        primerPlato = primerPlato + "helado x " + cantidad + "\n";
                        precioTotal = precioTotal + (PLATO10 * cantidad);
                        break;

                    default:
                        System.out.println("Numero no valido, elija de nuevo");
                        break;
                }
            } else if (opcion > 10) {
                System.out.println("Opcion no valida");
            }
        } while (opcion != 0);

        if (precioTotal > 20 && precioTotal < 30) {
            precioTotal = precioTotal - 2;
        }

        else if (precioTotal > 30 && precioTotal < 50) {
            precioTotal = precioTotal - 3;
        }

        else if (precioTotal > 50) {
            precioTotal = precioTotal - 5;
        }

        System.out.println();
        System.out.println("TICKET:");
        System.out.println("**Primeros platos** " + primerPlato);
        System.out.println("**Segundos platos** " + segundoPlato);
        System.out.println("TOTAL A PAGAR: " + precioTotal);
        leer.close();
    }
}