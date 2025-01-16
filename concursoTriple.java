import java.util.Scanner;

public class concursoTriple {
    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int aleatorio = ((int) Math.floor(Math.random() * 100)) + 1;
        int oponente = 0;
        int carro = 1;
        int stephen = 80;
        int larry = 75;
        int puntuacion = 0;
        int balones = 0;
        boolean salida = true;
        boolean salidaWhile = true;
        String dejarJuego = " ";

        while (salidaWhile) {
            puntuacion = 0;
            carro = 1;
            System.out.println();
            System.out.println("Selecciona a tu personaje");
            System.out.println("1. Stephen Carry");
            System.out.println("2. Larry Bird");
            oponente = leer.nextInt();
            leer.nextLine();

            switch (oponente) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                        System.out.println("Carro: " + carro);
                        System.out.println("Presiona enter para empezar");
                        leer.nextLine();

                        while (salida) {
                            aleatorio = ((int) Math.floor(Math.random() * 100)) + 1;
                            balones++;
                            if (balones == 5 && aleatorio <= stephen) {
                                System.out.println("Balon " + balones + " CANASTA DOBLE");
                                puntuacion++;
                                puntuacion++;
                            } else if (aleatorio <= stephen) {
                                System.out.println("Balon " + balones + " CANASTA");
                                puntuacion++;

                            }

                            else {
                                System.out.println("Balon " + balones + " ERROR");
                            }

                            if (balones >= 5) {
                                salida = false;
                                carro++;
                                balones = 0;

                                if (carro > 5) {
                                    System.out.println();
                                    System.out.println("Has obtenido esta puntuacion: " + puntuacion);
                                }
                            }

                        }
                        salida = true;

                    }

                    System.out.println();
                    System.out.println("Quieres dejar de jugar? (S)/(N)");
                    dejarJuego = leer.nextLine();

                    if (dejarJuego.equalsIgnoreCase("S")) {
                        salidaWhile = false;
                    }
                    break;

                case 2:
                    for (int i = 0; i < 5; i++) {
                        System.out.println();
                        System.out.println("Carro: " + carro);
                        System.out.println("Presiona enter para empezar");
                        leer.nextLine();

                        while (salida) {
                            aleatorio = ((int) Math.floor(Math.random() * 100)) + 1;
                            balones++;

                            if (carro == 1 || carro == 5) {
                                larry = 85;
                            }

                            if (carro == 2 || carro == 3 || carro == 4) {
                                larry = 75;
                            }

                            if (balones == 5 && aleatorio <= larry) {
                                System.out.println("Balon " + balones + " CANASTA DOBLE");
                                puntuacion++;
                                puntuacion++;
                            } else if (aleatorio < larry) {
                                System.out.println("Balon " + balones + " CANASTA");
                                puntuacion++;
                            }

                            else {
                                System.out.println("Balon " + balones + " ERROR");
                            }

                            if (balones == 5) {
                                salida = false;
                                carro++;
                                balones = 0;

                                if (carro > 5) {
                                    System.out.println();
                                    System.out.println("Has obtenido esta puntuacion: " + puntuacion);
                                }
                            }
                        }

                        salida = true;
                    }

                    System.out.println();
                    System.out.println("Quieres dejar de jugar? (S)/(N)");
                    dejarJuego = leer.nextLine();

                    if (dejarJuego.equalsIgnoreCase("S")) {
                        salidaWhile = false;
                    }
                    break;
                default:
                    System.out.println("Elije un numero valido");
                    break;
            }

        }
    }
}
