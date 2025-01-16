package sustituto;

import java.util.Scanner;

public class ExamenEjemplo {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // precios
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

        // cantidades
        double cantidad = 0;
        double cantidad2 = 0;
        double cantidad3 = 0;
        double cantidad4 = 0;
        double cantidad5 = 0;
        double cantidad6 = 0;
        double cantidad7 = 0;
        double cantidad8 = 0;
        double cantidad9 = 0;
        double cantidad10 = 0;
        int cantidadPrimer = 0;
        int cantidadSegundo = 0;
        int cantidadPostres = 0;

        // nombre platos
        double salmorejo = 0;
        double sopaPicadillo = 0;
        double ensaladaDeAtun = 0;
        double Paella = 0;
        double Salmon = 0;
        double codilloAlHorno = 0;
        double lentejas = 0;
        double fruta = 0;
        double cafe = 0;
        double helado = 0;

        int eleccion = 0;

        while (true) {

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
            System.out.println("0. SALIR (Imprimir Ticket + FIN) ");
            System.out.println("Selecciona la opción deseada por el cliente...");
            System.out.println();
            eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Cuanto deseas de salmorejo?");
                    cantidadPrimer = leer.nextInt();
                    if (eleccion == 1) {
                        cantidad = cantidad + (PLATO1 * cantidadPrimer);
                        salmorejo = cantidad;
                    }
                    System.out.println("Cantidad de salmorejo: " + cantidadPrimer + " Precio total: " + salmorejo);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Cuanta cantidad de Sopa Picadillo quieres");
                    cantidadPrimer = leer.nextInt();

                    if (eleccion == 2) {
                        cantidad2 = cantidad2 + (PLATO2 * cantidadPrimer);
                        sopaPicadillo = cantidad2;
                    }
                    System.out.println(
                            "Cantidad de sopa de picadillo: " + cantidadPrimer + " Precio total: " + sopaPicadillo);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Cuanta cantidad de Ensalada de atun quieres");
                    cantidadPrimer = leer.nextInt();

                    if (eleccion == 3) {
                        cantidad3 = cantidad3 + (PLATO3 * cantidadPrimer);
                        ensaladaDeAtun = cantidad3;
                    }
                    System.out.println(
                            "Cantidad de ensalada de atun: " + cantidadPrimer + " Precio total: " + ensaladaDeAtun);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Cuanta cantidad de Paella quieres");
                    cantidadSegundo = leer.nextInt();
                    if (eleccion == 4) {
                        cantidad4 = cantidad4 + (PLATO4 * cantidadSegundo);
                        Paella = cantidad4;
                    }
                    System.out.println("Cantidad de Paella: " + cantidadSegundo + " Precio total: " + Paella);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Cuanta cantidad de Salmon quieres");
                    cantidadSegundo = leer.nextInt();
                    if (eleccion == 5) {
                        cantidad5 = cantidad5 + (PLATO5 * cantidadSegundo);
                        ensaladaDeAtun = cantidad5;
                    }
                    System.out.println("Cantidad de Salmon: " + cantidadSegundo + " Precio total: " + Salmon);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Cuanta cantidad de Codillo al Horno quieres");
                    cantidadSegundo = leer.nextInt();
                    if (eleccion == 6) {
                        cantidad6 = cantidad6 + (PLATO6 * cantidadSegundo);
                        codilloAlHorno = cantidad6;
                    }
                    System.out.println(
                            "Cantidad de Codillo al Horno: " + cantidadSegundo + " Precio total: " + codilloAlHorno);
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Cuanta cantidad de Lentejas quieres");
                    cantidadSegundo = leer.nextInt();
                    if (eleccion == 7) {
                        cantidad7 = cantidad7 + (PLATO7 * cantidadSegundo);
                        lentejas = cantidad7;
                    }
                    System.out.println("Cantidad de lentejas: " + cantidadSegundo + " Precio total: " + lentejas);
                    System.out.println();
                    break;

                case 8:
                    System.out.println("Cuanta cantidad de Fruta quieres");
                    cantidadPostres = leer.nextInt();
                    if (eleccion == 8) {
                        cantidad8 = cantidad8 + (PLATO8 * cantidadPostres);
                        fruta = cantidad8;
                    }
                    System.out.println("Cantidad de fruta: " + cantidadPostres + " Precio total: " + fruta);
                    System.out.println();
                    break;

                case 9:

                    System.out.println("Cuanta cantidad de Cafe quieres");
                    cantidadPostres = leer.nextInt();
                    if (eleccion == 9) {
                        cantidad9 = cantidad9 + (PLATO9 * cantidadPostres);
                        cafe = cantidad9;
                    }
                    System.out.println("Cantidad de cafe: " + cantidadPostres + " Precio total: " + cafe);
                    System.out.println();
                    break;

                case 10:
                    System.out.println("Cuanta cantidad de Helado quieres");
                    cantidadPostres = leer.nextInt();
                    if (eleccion == 10) {
                        cantidad10 = cantidad10 + (PLATO10 * cantidadPostres);
                        helado = cantidad10;
                    }
                    System.out.println("Cantidad de helado: " + cantidadPostres + " Precio total: " + helado);
                    System.out.println();
                    break;

                case 0:

                    System.out.println("==================");
                    System.out.println("**Primeros Platos");
                    System.out.println();
                    System.out.println("**Segundos Platos");
                    System.out.println("");
                    System.out.println("TOTAL A PAGAR: ");
                    System.out.println("==================");
                    System.exit(1);

                    break;

                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("La eleccion es erroneo, repitala");
                    System.out.println();
                    break;
            }
        }
    }

}
